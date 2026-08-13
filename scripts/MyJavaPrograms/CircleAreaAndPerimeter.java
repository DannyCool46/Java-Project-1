
import java.util.*;

/*formula for the area of a circle is A = 3.14*r*r.
formula for perimeter of a circle is P = 2*3.14*r */

public class CircleAreaAndPerimeter{
  public static void main(String[] args){
    
    System.out.print("Enter a given radius: ");
    Scanner scanner = new Scanner(System.in);
    double radius = scanner.nextDouble();

    double  areaCircle =  Math.PI * radius * radius;
    System.out.printf("Area: %.2f\n", areaCircle);
    double  periCircle =   2 * Math.PI * radius;
    System.out.printf("Perimeter: %.2f\n", periCircle);

    scanner.close();
    
  }
}