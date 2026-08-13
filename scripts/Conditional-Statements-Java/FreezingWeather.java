
import java.util.*;
import java.util.Scanner;

/*A programme to check the freezing weather which: (i) Reads  a temperature in celcius, (b) Checks whether the temperature is below zero, (c) prints "Freezing Weather" if the temperature is equal or smaller than zero, otherwise print nothing*/

public class FreezingWeather{
  public static void main(String[] args){

    System.out.print("Enter the temperature (in celcius): ");
    Scanner scanner = new Scanner(System.in);
    double tempNow = scanner.nextDouble();

    if(tempNow <= 0){
      System.out.println("Freezing Weather !!!");
    }
    else{
      System.out.println("Not Freezing!!");
    }
    scanner.close();
  }
}