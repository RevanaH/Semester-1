import java.util.*;

public class reversenumbers {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String num = s.nextLine();
            boolean notPalindrome = true;
            int now = Integer.parseInt(num);
        

            if (now == 196) {
                System.exit(0);
            }

            
            while (notPalindrome){


               if (isPalindrome(now)){
                System.out.printf("%d merupakan bilangan palindrome", now);
 
               }else{
                int reversedNum = reverse(now);
                int newNum = now + reversedNum;
                System.out.printf("%d + %d = %d", now,reversedNum,newNum);

                now = newNum;
               }
            }

            }
            }

            public static int reverse(int num) {
                int reversedNum = 0;
                int newNum = num;
                int remainder = 0;
                while (newNum != 0) {
                    remainder = newNum % 10;
                    reversedNum = reversedNum * 10 + remainder;
                    newNum = newNum/ 10;
                }
                return reversedNum;
            }

            public static boolean isPalindrome(int num) {
                int reversedNum = 0;
                int newNum = num;
                reversedNum = reverse(newNum);
                if (reversedNum == num) {
                    return true;
                } else {
                    return false;
                }
            }

            
        }
    
    
