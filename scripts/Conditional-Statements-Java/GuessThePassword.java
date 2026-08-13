
import java.util.*;
import java.util.Scanner;

/* A program for checking a password which (i) reads a string that holds a password. (ii) prints "Welcome"if the password is "S3cr3t!", prints wrong password in all other cases*/

public class GuessThePassword{
  public static void main(String[] args){
    
    String password = "S3cr3t!";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your password: ");
    String newPass = scanner.nextLine();

    if(newPass.equals(password))
      System.out.println("Welcome");
    else
      System.out.println("Wrong Password");
    scanner.close();
  }
}