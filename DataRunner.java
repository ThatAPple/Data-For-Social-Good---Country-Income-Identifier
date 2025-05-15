import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List; 


public class DataRunner {
  public static void main(String[] args) {
    UserStory.createCountries("countries.txt", "incomes.txt", "unemployment.txt");
        UserStory userStory = new UserStory();
    Country[] riskCountries = userStory.riskOutcomes();
    // Checks the countries if they meet the criteria to classify them as a high risk country.

    for (int i = 0; i < riskCountries.length; i++) {
      System.out.println(riskCountries[i].toString());
  //Prints the countries that risk outcomes determine are high-risk countries.
    }
  }
}
