import java.io.*;
import java.util.*;
public class novowels {
    public static void main(String[]args){
        try(Scanner s = new Scanner(System.in)){
            String sent = s.nextLine();
            String yep = "";
            yep = sent.replaceAll("[aeiouAEIOU]", "");
            System.out.print(yep);


        }
        

    }
    
}
