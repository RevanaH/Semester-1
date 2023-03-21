import java.util.Arrays;

public class arrayofarray {
    public static void main(String args[]) {

    int [][] arrays = new int [3][5];
    arrays[0][1] = 8;
    arrays[1][1] = 10;
    arrays[0][4] = 11;
    arrays[2][1] = 8;
    
    System.out.println(Arrays.deepToString(arrays));
    System.out.println(Arrays.toString(arrays[0]));
    System.out.println(arrays[0][1]);
    
    
    }

}