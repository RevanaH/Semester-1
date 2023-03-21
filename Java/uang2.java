import java.util.Scanner;
public class uang2 {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner (System.in)){
    int uangDariIBu = scanner.nextInt();
    int hargaBarang = scanner.nextInt();
    int kembalian = uangDariIBu-hargaBarang;
    
    int limaPuluhRibu = kembalian/50000;
    int sisa1 = kembalian%50000;
    int duaPuluhRibu = sisa1/20000;
    int sisa2 = sisa1%20000;
    int sepuluhRibu = sisa2/10000;
    int sisa3 = sisa2%10000;
    int limaRibu = sisa3/5000;
    int sisa4 = sisa3%5000;
    int duaRibu = sisa4/2000;
    int sisa5 = sisa4%2000;
    int satuRibu = sisa5/1000;
    // int sisa6 = sisa5%1000;
    
    
    System.out.printf("Jumlah lembar 50 ribu%2s %s \n", ":", limaPuluhRibu);
    System.out.printf("Jumlah lembar 20 ribu%2s %s \n", ":", duaPuluhRibu);
    System.out.printf("Jumlah lembar 10 ribu%2s %s \n", ":", sepuluhRibu);
    System.out.printf("Jumlah lembar 5 ribu%3s %s \n", ":", limaRibu);
    System.out.printf("Jumlah lembar 2 ribu%3s %s \n", ":", duaRibu);
    System.out.printf("Jumlah lembar 1 ribu%3s %s \n", ":", satuRibu);
}

}
}
    

