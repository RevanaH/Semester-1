import java.util.Scanner;

public class pixeltv {
    public static void main(String args[]) {
        boolean[][] data = new boolean[7][7];
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    data[i][j] = in.nextInt() == 1;
                }
            }
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                        if (scan(data, i, j)) {
                            System.out.println(j + "," + i);
                            return;
                        }
                    }
                }
            in.close();

        }
    }

    public static boolean scan(boolean [][] data, int i, int j) {
        for (int y = i; y < i + 3; y++) {
            if (!data[y][j]) {
                return false;
            }
            if (j > 0 && j < data.length-1){
                if (data[y][j - 1]) {
                    return false;
                }
                if (data[y][j + 1]) {
                    return false;
                }
            }
        }
        if (i + 3 < data.length - 1) {
            if (data[i + 3][j]) {
                return false;
            }
            
        }
       
        if (i - 1 >= 0) {
            if (data[i - 1][j]) {
                return false;
            }
            
        }
        return true;
    }
}