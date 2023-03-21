import java.util.*;

public class ularalfabet {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)){
        int panjangUlar = scanner.nextInt();
        int panjangSatuan = scanner.nextInt();
        float ularAlfabet = (float)panjangUlar / (float)panjangSatuan;
        char currChar='a';
        int steps = 0;
        for (int i=0; i<ularAlfabet; i++){
            String body="";
            for (int j=0; j<panjangSatuan ; j++){
                if (currChar > 'z') currChar = 'a';
                if (i%2==0){
                    if (steps == panjangUlar){
                        body += "_";
                    } else {
                        body += currChar;
                        currChar++; steps++;
                    }
                } 
                else {
                    if (steps == panjangUlar){
                        body = "_" + body;
                    } else {
                        body = currChar + body; 
                        currChar++; steps++;
                     }
                } 
            } System.out.println(body);
        }
     }
}
}