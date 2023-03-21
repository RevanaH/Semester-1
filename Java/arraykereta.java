import java.util.Scanner;
public class arraykereta {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)){

        int panjang = s.nextInt();s.nextLine();
        String namaKereta = s.nextLine();

        String [] namaGerbong = new String[panjang];

        for (int i = 0; i < namaGerbong.length; i++){
           namaGerbong[i] = s.next();

        }
        System.out.println(namaKereta);

        for ( int i = 0; i< namaGerbong.length; i++){
            System.out.print(namaGerbong[i]);
            if (i==namaGerbong.length-1) continue;

            System.out.print("-");
            
        }
    }
}
}
