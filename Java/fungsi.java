public class fungsi {
    public static void main(String[] args){
    // args = arguments param = parameter (di file ini param nya 'nama')
    System.out.println(sayHai("Kevin", 20));
    System.out.println(penjumlahan( 20 , 30));
    System.out.println(fungsiX(2));
    grafik(20);
    System.out.println(faktorial(5));
    
    }
    public static String sayHai(String nama, int umur){
        return "Hai " + nama + " Umurmu " + umur;
    }
    public static int penjumlahan(int a, int b){
        int hasil = a + b;
        return hasil;


    }
    public static int fungsiX(int x){
        int a = x * x;
        int b = 5 * x;
        int c = 20;
        int result = a + b + c;
        return result;

    }

    public static void grafik(int banyakInterval){
        for (int i = 0; i < banyakInterval; i++){
            System.out.println(i + " = " + fungsiX(i));
        }
        
        
    }
    public static int faktorial(int bil){
        if (bil == 1)
            return 1;
        else
            return (bil * faktorial(bil - 1));
    }
    public static int faktorialLoop(int bil){
        int hasil = 1;
        for (int i = bil; i >= 1; i--){
            hasil*=1;

        }
        return hasil;
    }
}
