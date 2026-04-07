import java.util.Scanner;

public class DecimalToBinary {

   // Recursive
   public static int recursiveBinary(int n) {
      if (n == 0) {
         return 0;
      }
      return(n % 2) + 10 * recursiveBinary(n / 2);
   }


   // Iterative
   public static int iterativeBinary(int n) {
      if (n == 0) {
         return 0;
      }
      int binary = 0;
      int placeValue = 1;

      while (n > 0) {
         int remainder = n % 2;
         binary = binary + (remainder * placeValue);
         n = n / 2;
         placeValue *= 10;
      }
      return binary;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.err.println("input:");
      int decimalNum = scnr.nextInt();

      System.out.println("the Recursive is " + recursiveBinary(decimalNum));
      System.out.println("the Iterative is " + iterativeBinary(decimalNum));
   }
}
