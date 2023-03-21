import java.util.Scanner;

public class jalantol {
    

    // NAMA    : I GUSTI NGURAH RYO ADI TARTA
    // NIM     : 225150200111011
    // Dilarang menggunakan array, looping, dan method.
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try (Scanner input = new Scanner(System.in)){
        String s=input.nextLine(); 
        String kapan=input.nextLine(); 
        int satu, dua, tiga; 
        satu=input.nextInt(); 
        dua=input.nextInt(); 
        tiga=input.nextInt(); 
        int sepi, ramai, sedang; 
        String psepi="", psedang="", pramai=""; 
        
        if(satu>=dua&&satu>=tiga){
            if(dua>=tiga){
                sedang=dua; 
                sepi=tiga;
                pramai+="kiri"; 
                psedang+="tengah"; 
                psepi+="kanan"; 
            }else{
                sedang=tiga; 
                sepi=dua; 
                pramai+="kiri"; 
                psedang+="kanan"; 
                psepi+="tengah"; 
            }
            ramai=satu; 
            
        }else if(dua>=satu&&dua>=tiga){
            if(satu>=tiga){
                sedang=satu;
                sepi=tiga; 
                pramai+="tengah"; 
                psedang+="kiri"; 
                psepi+="kanan"; 
            }else{
                sedang=tiga; 
                sepi=satu; 
                pramai+="tengah"; 
                psedang+="kanan"; 
                psepi+="kiri"; 
            }
            ramai=dua; 
        }else{
            if(satu>=dua){
                sedang=satu; 
                sepi=dua; 
                pramai+="kanan"; 
                psedang+="kiri"; 
                psepi+="tengah"; 
            }else{
                sedang=dua; 
                sepi=satu; 
                pramai+="kanan"; 
                psedang+="tengah"; 
                psepi+="kiri"; 
            }
            ramai=tiga; 
        } 
        int p1,p2; 
        p1=input.nextInt(); 
        p2=input.nextInt(); 
        
        if(p1>p2){
            if(kapan.equals("pagi")){
                System.out.println(s+" lewat gerbang "+psepi); 
            }else if(kapan.equals("siang")||kapan.equals("malam")){
                System.out.println(s+" lewat gerbang "+pramai); 
            }else{
                System.out.println(s+" lewat gerbang "+psedang); 
            }
        }else if(p1==p2){
            sepi++;
            if(sepi==sedang){
                System.out.println(s+" lewat gerbang "+psedang); 
            }else{
                System.out.println(s+" lewat gerbang "+psepi); 
            }
            
        }else if(p1<p2){
            sepi++; 
            if(sepi==sedang||sepi==ramai){
                System.out.println(s+" lewat gerbang "+psedang);
            }else{
                System.out.println(s+" lewat gerbang "+psepi); 
            }
      }
    }
}
}


