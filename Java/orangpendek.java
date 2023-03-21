import java.util.Scanner;

public class orangpendek {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)){
            int N = s.nextInt();
            double [] A = new double [N];
            for (int i = 0; i < N; i++){
                 A[i] = s.nextDouble();
                 
            }
         System.out.println(FindSmallest(A) + 1);
        }
            
}
    
public static int FindSmallest (double [] array) {
    int index = 0;
    double min = array[index];
    double half = array.length/2;

    for (int i=1; i<array.length; i++) {

        if (array[i] < min) {
            min = array[i];
            index = i;
        }
        if (array[i] == min){
            double jarakIndexPertamaKeTengah = Math.abs(half-index);
            double jarakIndexKeduaKeTengah = Math.abs(half-i);
            if (jarakIndexKeduaKeTengah<jarakIndexPertamaKeTengah){
                index = i;
            }
        }
    }
    return index;
}
}


