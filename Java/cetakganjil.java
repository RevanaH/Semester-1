import java.util.*;

public class cetakganjil {

    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
           int jarak = scanner.nextInt();
           for(int i = 1; i <= jarak ; i++){
               if (i % 2 != 0 ){
                   System.out.print(i);
               }
               if (i % 2 == 0 && i == jarak){
                break;
               }
               if (i % 2 == 0){
                System.out.print(", ");
              }
    }
}
}
}