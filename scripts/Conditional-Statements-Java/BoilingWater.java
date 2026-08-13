
import java.util.*;
import java.util.Scanner;

/*a program to check for boiling water, which reads a number: the water temperature in (Degree Celcius), prints "The water is boiling" if the number > 100 or print "The water is not hot enough" in all other cases*/

public class BoilingWater{
  public static void main(String[] args){

    System.out.print("Enter a number (in celcius): ");
    Scanner scanner = new Scanner(System.in);
    double tempNow = scanner.nextDouble();

    if(tempNow >= 100){
      System.out.println("The water is boiling");
    }
    else{
      System.out.println("The water is not hot enough!");
    }
    scanner.close();
  }
}