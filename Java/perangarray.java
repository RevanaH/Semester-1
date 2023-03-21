import java.util.Scanner;

public class perangarray {
    public static void main(String args[]) {

        try (Scanner s = new Scanner(System.in)){
        String[][] field = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = s.next();
            }
        }
        int Ammo = s.nextInt();
        s.nextLine();
        int x = 0, y = 0;
        for (int k = 0; k < Ammo; k++) {
            x = s.nextInt();
            y = s.nextInt();

            if (x < 0 || x >= 10 || y < 0 || y >= 10) {
                System.out.println("Tidak terjangkau");
                continue;

            }

            if (field[x][y].equals("t")) {
                System.out.println("Terkena tank");
            }
            if (field[x][y].equals("p")) {
                System.out.println("Terkena personel");

            }
            if (field[x][y].equals("a")) {
                System.out.println("Terkena altileri");
            }
            if (field[x][y].equals("k")) {
                System.out.println("Meleset");
            }
        }
    }
}
}
