
import java.util.*;
import java.util.Scanner;

/*The goal is to build a simple program that acts like a shape-based area calculator. Instead of using separate logic for each shape, the program takes inputs from the console step-by-step, figures out which shape you are asking about, and calculates its area using the appropriate mathematical formula.
Depending on the shape entered, the program reads the necessary measurements:Square: Reads 1 number (side length "a").Rectangle: Reads 2 numbers (side "a" and side "b").Circle: Reads 1 number (radius "r"). The program checks the text entered in the first step using if / else if statements to decide which math operation to run: Square Area = a * a, Rectangle Area = a * b, Circle Area = pi * r^2.*/

public class AreaOfFigures{
  public static void main(String[] args){

    String circle = "Circle";
    String square = "Square";
    String rectangle = "Rectangle";

     Scanner scanner = new Scanner(System.in);
     
      System.out.print("Please enter a shape to calculate: ");
      String newShape = scanner.nextLine();

    if(newShape.equalsIgnoreCase(circle)){ //area = pi*r^2
      System.out.print("Enter a radius to calculate: ");
      double radius = scanner.nextDouble();
      double circleArea = Math.PI * radius * radius;
      System.out.printf("Area: %.2f\n", circleArea);
    }
    else if(newShape.equalsIgnoreCase(square)){ //area = a * a
      System.out.print("Enter a square: ");
      double newSquare = scanner.nextDouble();
      double squareArea = newSquare * newSquare;
      System.out.printf("Area: %.2f\n ", squareArea);
    }
    else if(newShape.equalsIgnoreCase(rectangle)){//area = L * W
      System.out.print("Enter the length of the rectangle: ");
      double length = scanner.nextDouble();
      System.out.print("Enter the width of the rectangle: ");
      double width = scanner.nextDouble();
      double rectCal = length * width;
      System.out.printf("Area of a rectangle: %.2f\n ", rectCal);
    }
    else{
      System.out.println("You have inputed a wrong shape");
    }
    scanner.close();
  }
}