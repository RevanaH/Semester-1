import java.io.*;
import java.util.*;

public class ram {

    public static void main(String[] args) {
      try(Scanner s = new Scanner(System.in)){
        int cap = s.nextInt();
        int run = s.nextInt();
        int load = 0;
        int capa = cap*1024;
        for (int i = 1; i <= run; i++ ){
            int space = s.nextInt();
            load = load + space;
            if (i == run && load < 2048){
                System.out.print("Memori dialokasikan : ");System.out.print(load); System.out.println(" MB");
                System.out.println("Memori terbuang : 0 MB");
                System.out.print("Rekomendasi ram : 2 GB");
            }
            if (i == run && load > 2048 && load < 4096 && load < capa){
                System.out.print("Memori dialokasikan : ");System.out.print(load); System.out.println(" MB");
                System.out.println("Memori terbuang : 0 MB");
                System.out.print("Rekomendasi ram : 4 GB");
            }
            if (i == run && load > 2048 && load < 4096 && load > capa){
                System.out.print("Memori dialokasikan : ");System.out.print(load); System.out.println(" MB");
                System.out.print("Memori terbuang : "); System.out.print(load - capa); System.out.println(" MB");
                System.out.print("Rekomendasi ram : 4 GB");
            }
            if (i == run && load > 4096 && load < 8192 && load < capa){
                System.out.print("Memori dialokasikan : ");System.out.print(load); System.out.println(" MB");
                System.out.println("Memori terbuang : 0 MB");
                System.out.print("Rekomendasi ram : 8 GB");
            }
            if (i == run && load > 4096 && load < 8192 && load > capa){
                System.out.print("Memori dialokasikan : ");System.out.print(load); System.out.println(" MB");
                System.out.print("Memori terbuang : "); System.out.print(load - capa); System.out.println(" MB");
                System.out.print("Rekomendasi ram : 8 GB");
            }
            if (i == run && load > 8192 && load <= 16384 && load < capa){
                System.out.print("Memori dialokasikan : ");System.out.print(load); System.out.println(" MB");
                System.out.println("Memori terbuang : 0 MB");
                System.out.print("Rekomendasi ram : 16 GB");
            }
            if (i == run && load > 8192 && load < 16384 && load > capa){
                System.out.print("Memori dialokasikan : ");System.out.print(load); System.out.println(" MB");
                System.out.print("Memori terbuang : "); System.out.print(load - capa); System.out.println(" MB");
                System.out.print("Rekomendasi ram : 16 GB");
            }
        }

      }
    }
}
