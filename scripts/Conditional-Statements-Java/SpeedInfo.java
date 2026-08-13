
import java.util.*;
import java.util.Scanner;

/* a program to check for fast and slow speed, (i) reads a number "SPEED". Prints SLOW if the number is <= 30, prints FAST if the number is > 30*/

public class SpeedInfo{
  public static void main(String[] args){

    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int speed = scanner.nextInt();

    if(speed <= 30){
      System.out.println("Slow");
    }
    else{
      System.out.println("Fast");
    }
    scanner.close();
  }
}