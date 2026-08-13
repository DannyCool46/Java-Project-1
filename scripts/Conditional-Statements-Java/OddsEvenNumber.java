
import java.util.*;
import java.util.Scanner;

/* a program that reads an integer from a user, if the input is an even number, prints out even, if its odd number, prints out odd */

public class OddsEvenNumber{
  public static void main(String[] args){

    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    //to check if a number is divisible by 2, we use the modulo % operator

    if(num % 2 == 0){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }
    scanner.close();
  }
}