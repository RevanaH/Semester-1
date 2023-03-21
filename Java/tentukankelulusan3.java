
import java.util.Scanner;


    public class tentukankelulusan3 {
     static char grade;
        public static void main(String[] args) {
            
            try (Scanner scanner = new Scanner(System.in)) {
                int data1 = scanner.nextInt();
                int data2 = scanner.nextInt();
                int data3 = scanner.nextInt();


                int ratarata = (data1 + data2 + data3) / 3;
                        
                    if (ratarata >= 80 && ratarata <= 100){
                        grade = 'A';
                    }
                    else if (ratarata >= 70 && ratarata <= 79){ 
                        grade = 'B';
                    }
                    else if (ratarata >= 50 && ratarata <= 69){ 
                        grade = 'C';
                    }
                    else if (ratarata >= 30 && ratarata <= 49){
                        grade = 'D';
                    }
                    else if (ratarata >= 0 && ratarata <= 29){ 
                        grade = 'E';
                    }
                    
                switch (grade){
                        
                    case 'A':
                        System.out.println("Selamat, Anda lulus dengan predikat A (Sangat Baik)");
                        break;
                    case 'B':
                        System.out.println("Selamat, Anda lulus dengan predikat B (Baik)");
                        break;
                    case 'C':
                        System.out.println("Selamat, Anda lulus dengan predikat C (Cukup)");
                        break;
                    case 'D':
                        System.out.println("Maaf, Anda tidak lulus dengan predikat D (Kurang)");
                        break;
                    case 'E':
                        System.out.println("Maaf, Anda tidak lulus dengan predikat E (Sangat Kurang)");
                        break;
                        
                }
            }
        }
    }