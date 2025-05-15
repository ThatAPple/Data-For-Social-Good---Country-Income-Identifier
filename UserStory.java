import java.util.Scanner;

public class UserStory {
  
  private Country[] outcomes;

  
  public UserStory() {
    this.outcomes = createCountries("countries.txt", "incomes.txt", "unemployment.txt");
    //creates the different arrays for the txt files
  }

  public static Country[] createCountries(String countriesFile, String incomesFile, String unemploymentFile) {
    String[] countriesData = FileReader.toStringArray(countriesFile); 
    String[] incomesData = FileReader.toStringArray(incomesFile);      
    double[] unemploymentData = FileReader.toDoubleArray(unemploymentFile);
    //the country array for each txt file
    
    Country[] riskOutcomes = new Country[countriesData.length];
    for (int i = 0; i < countriesData.length; i++) {
      String country = countriesData[i];
      String income = incomesData[i];
      double unemploymentRate = unemploymentData[i];
      //Array that commands the code to switch counteis based on criteria listed below.
      riskOutcomes[i] = new Country(country, income, unemploymentRate);
    }

    return riskOutcomes;
  }

  public Country[] riskOutcomes() {
    if (outcomes == null || outcomes.length == 0) {
        System.out.println("No countries data available.");
        return new Country[0];  
    }
    int count = 0;
    for (int i = 0; i < outcomes.length; i++) {
        Country country = outcomes[i];
        //System.out.println("Checking country: " + country.getCountries() + " with unemployment " + country.getUnemployment());
        if (country.getUnemployment() > 10 && 
            (country.getIncomes().equals("Lower Middle Income") || country.getIncomes().equals("Low Income"))) {
            //System.out.println("High risk: " + country.getCountries());
            count++;
        }
    }

    Country[] highRiskCountries = new Country[count];
    int index = 0;

    for (int i = 0; i < outcomes.length; i++) {
        Country country = outcomes[i];
        if (country.getUnemployment() > 10 && 
            (country.getIncomes().equals("Lower Middle Income") || country.getIncomes().equals("Low Income"))) {
            highRiskCountries[index++] = country;
        }
    }

    return highRiskCountries;
  }
}
//The above code lists the criteria that tells the code what countries to choose and classify as deserving of the aid in the form of food.
