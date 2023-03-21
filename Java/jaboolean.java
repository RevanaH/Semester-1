public class jaboolean {
    
    public static void main(String args[]) {

    boolean data = 100 > 10 ;
    boolean status = 79 >= 80;
    boolean statusDua = 69 >= 69;

    System.out.println(data);
    System.out.println(!data);
    // ! membalikan true menjadi false dan sebaliknya

    System.out.println(data && status);
    // And = True && True  = True, False & True = False
    
    System.out.println(data || status);
    // OR = False || True = True, False || False = False, True || True = True

    System.out.println(!(data && status) || (status && statusDua) || status);
} }