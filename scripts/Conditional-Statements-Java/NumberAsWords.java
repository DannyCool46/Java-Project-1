
import java.util.*;
import java.util.Scanner;

/* a program that takes a number from 1-9 and print it out in words, and prints "Out of Range" if the number is not in list of words*/

public class NumberAsWords{
  public static void main(String[] args){

    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();

    if(num == 1)
      System.out.println("One");
    
      else if(num == 2)
        System.out.println("Two");
      
    else if(num == 3)
      System.out.println("Three");
    
    else if(num == 4)
      System.out.println("Four");
    
    else if(num == 5)
      System.out.println("Five");

      else if(num == 6)
        System.out.println("Six");
    
    else if(num == 7)
      System.out.println("Seven");
    
    else if(num == 8)
      System.out.println("Eight");
    
    else if(num == 9)
      System.out.println("Nine");
    
    else 
      System.out.println("Out of range");
    scanner.close();
    
  }
}