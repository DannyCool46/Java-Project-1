
import java.util.*;
import java.util.Scanner;

/*a program to calculate the price for a drink, which reads a drink name either "Coffee" or "Tea", reads an extra either "Sugar" or "No", prints the price in the format Final Price {$Price}.*/

public class CoffeeShop{
  public static void main(String[] args){

    double coffee = 1.00;
    double tea = 0.60;
    double sugar = 0.40;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter what you'd care to have: ");
    String drinks = scanner.nextLine();

    System.out.print("Do you want sugar or without: ");
    String noSugar = scanner.nextLine();

    if(drinks.equalsIgnoreCase("Coffee")){
      if(noSugar.equalsIgnoreCase("Sugar")){
        System.out.printf("Final Price: $%.2f\n", coffee + sugar);
      }
      else if (noSugar.equalsIgnoreCase("No")){
        System.out.printf("Final Price: $%.2f\n ", coffee);
      }
    }
    else if(drinks.equalsIgnoreCase("tea")){
      if(noSugar.equalsIgnoreCase("sugar")){
        System.out.printf("Final Price: $%.2f\n ", tea + sugar);
      }
      else if (noSugar.equalsIgnoreCase("No")){
        System.out.printf("Final Price: $%.2f\n ", tea);
      }
    }
    else{
      System.out.println("Out of stock");
    }  
  }
}