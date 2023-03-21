import java.util.Scanner;

public class biodata {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        try (Scanner scanner = new Scanner(System.in)) {
            String nama = scanner.nextLine();
            String panggilan = scanner.nextLine();
            int umur = scanner.nextInt();
            scanner.nextLine();
            String notelp = scanner.nextLine();
            String askot = scanner.nextLine();

            System.out.printf("%-15s: %2s\n", "Nama Lengkap", nama);
            System.out.printf("%-15s: %2s\n", "Panggilan", panggilan);
            System.out.printf("%-15s: %2d\n", "Umur", umur);
            System.out.printf("%-15s: %2s\n", "No Telepon", notelp);
            System.out.printf("%-15s: %2s\n", "Asal Kota", askot);

        }

    }

}
