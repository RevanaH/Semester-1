import java.util.Scanner;

public class scanequation {
    public static void main(String args[]) {
      //materi input & output
      
      //input
      
      try (Scanner scanner = new Scanner(System.in)) {
        int angkaBulat = scanner.nextInt();
        int angkaBulatDua = scanner.nextInt();
        int jumlah = angkaBulat+angkaBulatDua;
        
        
        //output

        System.out.println("Angka Penjumlahan : " + jumlah);
      }
    }
}