import java.io.*;
import java.util.*;

public class kpk {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)){
            int n = s.nextInt();
            for (int i = 0; i < n; i++){
                 int bruh = s.nextInt();
                 if (bruh % 2 == 0){
                    System.out.print("2 ");
                 }
                 if (bruh % 3 == 0){
                    System.out.print("3 ");
                 }
                 if (bruh % 4 == 0){
                    System.out.print("4 ");
                 }
                 if (bruh % 5 == 0){
                    System.out.print("5");
                 }
                 if (bruh % 2 != 0 && bruh % 3 != 0 && bruh % 4 != 0 && bruh % 5 != 0 ){
                    System.out.print("0");
                 }
                 System.out.println();
            }

        }
}
}
