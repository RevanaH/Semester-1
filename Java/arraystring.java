import java.util.Scanner;
public class arraystring {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)){

        System.out.print("Masukan panjang array : ");
        int panjang = s.nextInt();s.nextLine();

        String [] textArray = new String[panjang];

        for (int i = 0; i < textArray.length; i++){
            System.out.printf("masukan isi array index ke-%d :", i);
            textArray[i] = s.nextLine();


        }
         
        System.out.println("Isi array nama : ");

        for ( int i = 0; i< textArray.length; i++){
            System.out.print(textArray[i]);
            if (i==textArray.length-1) continue;

            System.out.print(", ");

        }


    }
    
}
}