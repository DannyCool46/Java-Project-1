
import java.util.*;
import java.util.Scanner;

/* a program that finds the greater of two numbers: reads two integer numbers, finds the greater number. Prints "Greater Number: " + the greater number*/

public class GreaterNumber{
  public static void main(String[] args){

    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);

    int num1 = scanner.nextInt();

    System.out.print("Enter a sceond number: ");
    int num2 = scanner.nextInt();

    if(num1 > num2){
      System.out.println("Greater Number:" + num1);
    }
    else{
      System.out.println("Greater Number: " + num2);
    }
    scanner.close();
  }
}