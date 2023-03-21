import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class sum {
    
    public static void main(String[] args) {
        DecimalFormat nf = new DecimalFormat("##.###");
        
      try (Scanner s = new Scanner(System.in)){
          int total = s.nextInt();
          float add = 0;
          for (int i = 0; i < total; i++){
              float a = s.nextInt();
              add = add + a;
          }
          System.out.printf(nf.format(add/total));
          
        
          }
      }
    }
