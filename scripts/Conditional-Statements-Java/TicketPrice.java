
import java.util.*;
import java.util.Scanner;

/* a program to calculate ticket price, which: reads ticket type either "Student" or "Regular". Prints the price in the folllowing format ${Price}. Student ticket price: $1.00, and Regular ticket price: $1.60. For invalid type, "Invalid Ticket Type".*/

public class TicketPrice{
  public static void main(String[] args){

    double studentPrice = 1.00;
    double regular = 1.60;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a ticket type: ");
    String input = scanner.nextLine();

    if(input.equalsIgnoreCase("Student")){
      System.out.printf("$%.2f\n", studentPrice);
    }
    else if(input.equalsIgnoreCase("Regular")){
      System.out.printf("$%.2f.\n" , regular);
    }
    else{
      System.out.println("Invalid Ticket Type.");
    }
    scanner.close();
  }
}