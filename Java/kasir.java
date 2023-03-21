import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        String[] input1;
        String[] input2;
        try (Scanner in = new Scanner(System.in)) {

            // Header

            String barang1 = "Tolak Angin 12 sachet 15ml";
            String barang2 = "Masker Orlee 50 pieces";
            System.out.printf("%-15s  %15s\n", "5 Desember 2022", "11.10");
            System.out.printf("%-15s  %13s\n", "Receipt Number : ", (int)Math.floor(Math.random()*10000)+10000);
            System.out.printf("%-15s  %13s\n", "Order ID       : ", "FM" + (int)Math.floor(Math.random()*1000));
            System.out.printf("%-15s  %8s", "Collected By   : ", "");
            in.nextLine();
            System.out.println("================================");

            // Purchase List

            System.out.println(barang1);
            int quantity1, price1;
            input1 = in.nextLine().split("x      Rp.");
            quantity1 = Integer.parseInt(input1[0]);
            price1 = Integer.parseInt(input1[1]);
            int totalBarang1 = quantity1 * price1;
            System.out.printf("%-8s %6s %8s\n", "Price          :", "Rp.", totalBarang1);
            System.out.println(barang2);
            int quantity2, price2;
            input2 = in.nextLine().split("x      Rp.");
            quantity2 = Integer.parseInt(input2[0]);
            price2 = Integer.parseInt(input2[1]);
            int totalBarang2 = quantity2 * price2;
            System.out.printf("%-8s %6s %8s\n", "Price          :", "Rp.", totalBarang2);

            // Subtotals and Discounts

            System.out.println("================================");
            int totalHarga = totalBarang1 + totalBarang2;
            System.out.printf("%-7s %14s %8s\n", "Subtotal", "Rp.", totalHarga);
            System.out.println("Diskon");
            int diskon = 10;
            int setelahDiskon = totalHarga / diskon;
            System.out.printf("%-7s %15s %8s\n", "10%", "-Rp.", setelahDiskon);

            // Total and Payments

            System.out.println("================================");
            int hargaFinal = totalHarga - setelahDiskon;
            System.out.printf("%-7s %15s %8s\n", "Total", "Rp.", hargaFinal);
            System.out.printf("%-7s %15s %2s", "Bayar", "Rp.", "");
            int Bayar = in.nextInt();

            // Change

            System.out.println("================================");
            System.out.printf("%-7s %15s %8s\n", "Kembali", "Rp.", Bayar - hargaFinal);
            System.out.println("================================");

        }
    }
}