
import java.util.*;
import java.util.Scanner;

/* The program reads three integer values representing the side lengths of a triangle (let's call them "a", "b", and "c".Condition: A triangle is valid if and only if each side is strictly less than the sum of the other two sides: a < b + c, b < a + c, c < a + b.*/

public class ValidTriangle{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int a = scanner.nextInt();

    System.out.print("Enter a second number: ");
    int b = scanner.nextInt();

    System.out.print("Enter a third number: ");
    int c = scanner.nextInt();

    /*"if(a + b <= c || a + c <= b || b + c <= a) "Invalid Triangle"
    if(a < b + c && b < a + c && c < a + b){
      System.out.println("Valid Triangle");
    }
    else{
      System.out.println("Invalid Triangle");
    }*/
    /*if(a + b < c){
      System.out.println("Invalid Triangle");
    }
      else if(b + c < a){
      System.out.println("Inavlid Triangle");
      }
      else if(a + c < b){
          System.out.println("Invalid Triangle");
      }
    else{
      System.out.println("Valid Triangle");
    }*/
    boolean valid = true;

    if(a + b < c)
      valid = false;
    else if(a + c < b)
      valid = false;
    else if(b + c < a)
      valid = false;
    if(valid){
      System.out.println("valid triangle");
      }
    else{
      System.out.println("Invalid triangle");
    }
  }
}