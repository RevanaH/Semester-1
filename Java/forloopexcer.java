import java.util.Scanner;
public class forloopexcer { 
    public static void main(String[] args) {
    
    try(Scanner scanner = new Scanner(System.in)){
    int data = scanner.nextInt();

        for (int index = 1; index <= data; index++){
            System.out.println("Saya berjanji tidak mengulangi lagi plagiasi");
            
        }
    }
        
}
}