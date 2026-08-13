
import java.util.*;

/* A program that reads users info and print it in the following order. Reads 4 lines of strings firstname, lastname, country, and town
  */

public class PersonalInfo{
  public static void main(String[] args){

    System.out.print("Please input your first name: ");
    Scanner scanner = new Scanner(System.in);
    String firstName = scanner.nextLine();

    System.out.print("please input your last name: ");
    String lastName = scanner.nextLine();

    System.out.print("Please input your town: ");
    String town = scanner.nextLine();

    System.out.print("Please input your country: ");
    String country = scanner.nextLine();

    String result = String.format("Hello, Mr %s %s , you're from %s - %s\n." , firstName, lastName, town, country);
    System.out.println(result);

    scanner.close();
  }
}