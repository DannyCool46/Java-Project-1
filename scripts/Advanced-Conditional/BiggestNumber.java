
import java.util.*;
import java.util.Scanner;

/* a program that reads 3 numbers from the console and prints the biggest of them*/

public class BiggestNumber{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double num3 = scanner.nextDouble();

    //using logical AND(&&) instead of Math.max() to get the biggest number.
    if(num1 > num2 && (num1 > num3)){
      System.out.println("The biggest is: " + num1);
    }
    else if(num2 > num1 && (num2 > num3)){
      System.out.println("The biggest is : " + num2);
    }
    else {
      System.out.println("The biggest is: " + num3);
    }
    scanner.close();
  }
}