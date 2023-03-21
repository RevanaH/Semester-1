import java.util.Scanner;


    public class tentukankelulusan2 {

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                int data1 = scanner.nextInt();
                int data2 = scanner.nextInt();
                int data3 = scanner.nextInt();

                int ratarata = (data1 + data2 + data3) / 3;
                        
                    if (ratarata >= 80 && ratarata <= 100){
                    
                    System.out.println("Selamat, Anda lulus dengan predikat A (Sangat Baik)");}
                    
                    else if (ratarata >= 70 && ratarata <= 79){
                    
                    System.out.println("Selamat, Anda lulus dengan predikat B (Baik)");
                    }
                    else if (ratarata >= 50 && ratarata <= 69){
                    
                    System.out.println("Selamat, Anda lulus dengan predikat C (Cukup)");}
                    
                    else if (ratarata >= 30 && ratarata <= 49){
                    
                    System.out.println("Maaf, Anda tidak lulus dengan predikat D (Kurang)");}
                    
                    else if (ratarata >= 0 && ratarata <= 29){
                    
                    System.out.println("Maaf, Anda tidak lulus dengan predikat E (Sangat Kurang)");}
                    
                } 
                }

            }
