import java.util.Scanner;

public class arrayofarrays3 {
    public static void main(String args[]) {

    try(Scanner s = new Scanner(System.in)){
    int [][] arrays = new int [2][3];
    for ( int i = 0; i < arrays.length; i++){
        for ( int j = 0; j < arrays.length; j++){
        arrays[i][j] = s.nextInt();
        }
    }

        for ( int i = 0; i < arrays.length; i++){
            for ( int j = 0; j < arrays.length; j++){
           System.out.print(arrays[i][j] +" ");
            }

         System.out.printf("\n");
        }
        // System.out.println(Arrays.deepToString(arrays));
        s.close();
    }  
        }
       
}

    