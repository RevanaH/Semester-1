import java.util.Scanner;

public class Array3d {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.printf("%-10s:","Length(x)");
            int x = s.nextInt();
            System.out.printf("%-10s:","Width(y)");
            int y = s.nextInt();
            System.out.printf("%-10s:","Layer(z)");
            int z = s.nextInt();
            System.out.println();
            int index = 0;
            int[][][] array = new int[z][y][x];
            for (int i = 0; i < z; i++) {
                for (int j = 0; j < y; j++) {
                    for (int k = 0; k < x; k++) {
                        array[i][j][k] = ++index;
                        System.out.printf("%-3s", Integer.toString(array[i][j][k]));

                    }
                    System.out.println();

                }
                System.out.println();

            }
        }
    }
}