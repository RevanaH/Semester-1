import java.util.Scanner;
import java.util.Arrays;

public class arrayofarrays2 {
    public static void main(String args[]) {

    try(Scanner s = new Scanner(System.in)){
    int [][] arrays = new int [2][3];
    for ( int i = 0; i < arrays.length; i++){
        for ( int j = 0; j < arrays.length; j++){
        arrays[i][j] = s.nextInt();

        System.out.println(Arrays.deepToString(arrays));
    
    
    }


}
}
}
}