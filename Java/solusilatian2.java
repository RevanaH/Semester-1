import java.util.Scanner;

public class solusilatian2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner scanner = new Scanner (System.in)){
        float nilaiA = scanner.nextFloat();
        float nilaiB = scanner.nextFloat();
        float nilaiC = scanner.nextFloat();
            
            float ratarata = (nilaiA + nilaiB + nilaiC)/3;
            System.out.printf("%.2f", ratarata);
        }}}