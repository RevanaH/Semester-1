public class forloop2 {
   public static void main(String[] args) {
       int i = 1;
       for(;;){// i--, i*2, 
         i+=1;
         if (i == 16){
            break;
         } else if(i == 5){
            continue;
         }
         System.out.println(i);

       }
      
      
}
}