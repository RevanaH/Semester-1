import java.util.Scanner;

public class roshamboo {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String roshambo1= scanner.nextLine();
            String roshambo2 = scanner.nextLine();

            // Guting kertas match

            if (roshambo1.equals("Dengklek gunting") && roshambo2.equals("Ayas kertas")) {
                System.out.println("Dengklek menang");
            }
            else if (roshambo1.equals("Dengklek kertas") && roshambo2.equals("Ayas gunting")) {
                System.out.println("Ayas menang");
            }

            // batu kertas match
            else if (roshambo1.equals("Dengklek batu") && roshambo2.equals("Ayas kertas")) {
                System.out.println("Ayas menang");
            }
            else if (roshambo1.equals("Dengklek kertas") && roshambo2.equals("Ayas batu")) {
                System.out.println("Dengklek menang");
            }

            // batu gunting match
            else if (roshambo1.equals("Dengklek batu") && roshambo2.equals("Ayas gunting")) {
                System.out.println("Dengklek menang");
            }
            else if (roshambo1.equals("Dengklek gunting") && roshambo2.equals("Ayas batu")) {
                System.out.println("Ayas menang");
            }

        
            // tie matches
            else if (roshambo1.equals("Dengklek kertas") && roshambo2.equals("Ayas kertas")) {
                System.out.println("Dengklek dan Ayas seri");
            }else if (roshambo1.equals("Dengklek gunting") && roshambo2.equals("Ayas gunting")) {
                System.out.println("Dengklek dan Ayas seri");
            }else if (roshambo1.equals("Dengklek batu") && roshambo2.equals("Ayas batu")) {
                System.out.println("Dengklek dan Ayas seri");
            }





    }
    
}}
