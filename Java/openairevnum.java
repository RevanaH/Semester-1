import java.util.Scanner;

public class openairevnum {
        public static void main(String[] args) {
          String num = "12345"; // the number to reverse and add
      
          // loop until we find a palindrome
          while (true) {
            String reverse = new StringBuilder(num).reverse().toString(); // reverse the number
      
            int result = Integer.parseInt(num) + Integer.parseInt(reverse); // add the number and its reverse
            System.out.println(num + " + " + reverse + " = " + result); // print the equation
      
            // check if the result is a palindrome
            if (isPalindrome(result)) {
              System.out.println("Found palindrome: " + result);
              break; // stop the loop
            }
      
            num = String.valueOf(result); // update the number for the next iteration
          }
        }
      
        // method to check if a number is a palindrome
        public static boolean isPalindrome(int num) {
          String str = String.valueOf(num);
          String reverse = new StringBuilder(str).reverse().toString();
          return str.equals(reverse);
        }
      }
      