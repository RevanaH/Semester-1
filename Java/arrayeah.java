

public class arrayeah {
    public static void main(String args[]) {
        int [] numbers = new int [10];
        
        numbers[2] = 20;
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[3] = numbers[1] + numbers[2];

      //  numbers[10] = 90;
        
       // System.out.println(Arrays.toString(numbers));

       for(int i = 0 ; i < numbers.length; i++){
        System.out.printf("index ke - %d value = %d\n", i, numbers[i]);

       }
     
    
}
}
