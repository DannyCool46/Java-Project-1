
import java.util.*;
import java.util.Scanner;

/* a program that reads a product, between Banana, Apple, Kiwi, and a day in the week between Weekday and Weekend from the console, print the price formatted to 2nd digit, based on their price table*/

public class MarketPlace{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a product: ");
    String product = scanner.nextLine();
    System.out.print("Enter period of the week: ");
    String dayOfWeek = scanner.nextLine();

    if(product.equalsIgnoreCase("Banana")){
      if(dayOfWeek.equalsIgnoreCase("Weekday")){
        System.out.println("$" + "2.50");
      }
      else{
        System.out.println("$" + "2.70");
      }
    }
    else if(product.equalsIgnoreCase("Apple")){
      if(dayOfWeek.equalsIgnoreCase("weekday")){
        System.out.println("$" + "1.30");
      }
      else{
        System.out.println("$" + "1.60");
      }
    }
  else if(product.equalsIgnoreCase("Kiwi")){
    if(dayOfWeek.equalsIgnoreCase("weekday")){
      System.out.println("$" + "2.20");
    }
    else{
      System.out.println("$" + "3.00");
    }
  }
    else{
      System.out.println("Out of stock");
    }
    scanner.close();
}
}