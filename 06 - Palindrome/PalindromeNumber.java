public class PalindromeNumber {
   public static void main(String[] args) {
      int num = 15451;

      int originalNum = num;
      int reversedNum = 0;
      int remainder;

      while (num !=0) {
         remainder = num % 10;
         reversedNum = (reversedNum * 10) + remainder;
         num = num / 10;
      }

      if(reversedNum == originalNum) {
         System.out.println("The number is palindrome");
      } else {
         System.out.println("The number is not palindrome");
      }
   }
}
