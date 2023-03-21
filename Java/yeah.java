import java.util.Scanner;

public class yeah {
    public static void main(String args[]) {
      //materi input & output
      
      //input
      
      try (Scanner scanner = new Scanner(System.in)) {
        String inputText = scanner.nextLine();
        
        //output

        System.out.println("Nama Saya : " + inputText);
      }
    }
}
