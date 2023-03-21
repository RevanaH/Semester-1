import java.util.Scanner;

public class Tentukankelulusan {

    public class Solution {

        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                float data1 = scanner.nextFloat();
                float data2 = scanner.nextFloat();
                float data3 = scanner.nextFloat();

                float ratarata = (data1 + data2 + data3) / 3;

                if (ratarata >= 80 && ratarata <= 100) {
                    System.out.println("A");
                    System.out.println("Selamat, Anda lulus");
                }

                else if (ratarata >= 70 && ratarata <= 79) {
                    System.out.println("B");
                    System.out.println("Selamat, Anda lulus");
                } else if (ratarata >= 50 && ratarata <= 69) {
                    System.out.println("C");
                    System.out.println("Selamat, Anda lulus");
                } else if (ratarata >= 30 && ratarata <= 49) {
                    System.out.println("D");
                    System.out.println("Maaf, Anda tidak lulus");
                } else if (ratarata >= 0 && ratarata <= 29) {
                    System.out.println("E");
                    System.out.println("Maaf, Anda tidak lulus");
                } else {
                }

            }

        }
    }
}