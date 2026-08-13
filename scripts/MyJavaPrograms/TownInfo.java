
import java.util.*;
import java.util.Scanner;

/* a program that gets the town name, population and area square km of a given town*/
/* use Integer.parseInt(scanner.nextLine()); when you need to read an integer from standard input, especially in programs where you mix reading numbers and reading full lines of text*/

public class TownInfo{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Input the population: ");
    int population = Integer.parseInt(scanner.nextLine());
    
    System.out.print("Input the area (in km sq.): ");
    int squareArea = Integer.parseInt(scanner.nextLine());

    System.out.print("Enter town name: ");
    String town = scanner.nextLine();

    String result = String.format("Town %s has a population of %d, and %d area square kilometer", town, population, squareArea);
    System.out.println(result);

    scanner.close();
  }
}