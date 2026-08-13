
import java.util.*;

public class FourOperation{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

      double firstNum = scanner.nextDouble();
      double secondNum = scanner.nextDouble();
      scanner.close();

      System.out.printf("%.2f + %.2f = %.2f\n", firstNum, secondNum,               firstNum + secondNum);
      System.out.printf("%.2f - %.2f = %.2f\n", firstNum, secondNum,               firstNum - secondNum);
      System.out.printf("%.2f * %.2f = %.2f\n", firstNum, secondNum,               firstNum * secondNum);
      System.out.printf("%.2f / %.2f = %.2f\n", firstNum, secondNum,               firstNum / secondNum);
    }
}