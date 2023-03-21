import java.util.*;
public class revernum {
    /* Iterative function to reverse digits of num*/
    long reverseDigits(long num)
    {
        long rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }
 
    /* Function to check whether he number is
           palindrome or not */
    boolean isPalindrome(long num)
    {
        return (reverseDigits(num) == num);
    }
 
    /* Reverse and Add Function */
    void ReverseandAdd(long num)
    {
        long rev_num = 0;
        while (num <= 4294967295l) {
            // Reversing the digits of the number
            rev_num = reverseDigits(num);
 
            // Adding the reversed number
            // with the original
            num
                = num + rev_num;
 
            // Checking whether the number
            // is palindrome or not
            if (isPalindrome(num)) {
                System.out.println(num);
                break;
            }
            else if (num > 4294967295l) {
                System.out.println("No palindrome exist");
            }
        }
    }
 
    // Main method
    public static void main(String[] args)
    {
        try (Scanner n = new Scanner(System.in)){
            String number = n.nextLine();
            


        }
    }
}
