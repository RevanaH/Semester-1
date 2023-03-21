import java.util.Scanner;

public class cetaksegitiga {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
        int baris = scanner.nextInt();

        for(int i = 0; i < baris; i++){
            for(int j = baris - i ; j > 1; j--)
                System.out.print(" ");   
            for(int j = 0; j <= i; j++)
                System.out.print("*");
                       
            System.out.println("");
        }
        
    }
    
}
}
