public class asdamn {
    public static void main(String[]args){
        recurCount(0);


    }
    
    static void recurCount(int n){
        if (n == 10){
            return;
        }
        recurCount(n+1);
        System.out.println(n);
    }
    
    
}
