
import java.util.*;

public class DaysToMinutes{
  public static void main(String[] args){

    System.out.print("Enter the number of days to be converted: ");
    Scanner scanner = new Scanner(System.in);
    double days = scanner.nextDouble();
    scanner.close();

    double minutes = days * 60 * 24;
    double result = minutes;

    System.out.printf("%.2f\n", result);

    
  }
}