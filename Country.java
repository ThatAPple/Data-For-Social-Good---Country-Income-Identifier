public class Country {
  
    private String country;
    private String income;  
    private double unemployment;

    public Country(String country, String income, double unemployment) {
      this.country = country;
      this.income = income;  
      this.unemployment = unemployment;
    }
  
    public String getCountries() {
      return country;
    }
  
    public String getIncomes() {
      return income;
    }
 
    public double getUnemployment() {
      return unemployment;
    }
  
    public String toString() {
      return "Country: " + country + "\nIncome: " + income + "\nUnemployment: " + unemployment;
    }
}
// Country methods that call each txt file to formulate it into a list in the console that shows the low income countries.
