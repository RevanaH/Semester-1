import java.io.*;
import java.util.*;

public class tebak {    

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)){
            String kata = s.nextLine();
            String lok = s.nextLine();
            
            String tebak = s.nextLine();
            tebak = toLowerCase();
            if (tebak == "kanan" ){
            for (int i = 0; i < kata.length(); i++){
                if (charAt(i) == tebak){
                    System.out.print("Tebakan anda benar.");

                    
                }
            }
        }



        }
    }

    private static String toLowerCase() {
        return null;
    }

    private static String charAt(int i) {
        return null;
    }
    
}
