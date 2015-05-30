//If we list all the natural numbers below 10 that are multiples of 3 or 5,
// we get 3, 5, 6 and 9. The sum of these multiples is 23.

// Find the sum of all the multiples of 3 or 5 below any number X

public class MultiplesOf3And5 {
   
   public static final int MAX = 1000;
   
   public static void main(String[] args) {
      System.out.println("The sum of all numbers below " + MAX + " is " + sum3and5(MAX) + ".");
   }
   
   public static int sum3and5(int x) {
      int sum = 0;
      for (int i = 0; i < x; i++) {
         if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
         }
      }
      return sum;
   }
   
}

