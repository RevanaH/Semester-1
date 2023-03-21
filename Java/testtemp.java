import java.util.Scanner;

public class testtemp {
    public static void main(String[] args) {
        while(true){
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Pilih:\n" + "1.Celcius\n" + "2.Fahrenheit\n" + "3.Reamur\n" + "4.Kelvin\n");

            int data = scanner.nextInt();
             
            
            // if Celcius
            if (data == 1) {
                System.out.println("\nUbah ke:\n" + "1.Fahrenheit\n" + "2.Reamur\n" + "3.Kelvin\n");
            }
            // if Fahrenheit
            else if (data == 2) {
                System.out.println("\nUbah ke:\n" + "1.Celcius\n" + "2.Reamur\n" + "3.Kelvin\n");
            }
            // if Reamur
            else if (data == 3) {
                System.out.println("\nUbah ke:\n" + "1.Celcius\n" + "2.Fahrenheit\n" + "3.Kelvin\n");
            }
            // if Kelvin
            else if (data == 4) {
                System.out.println("\nUbah ke:\n" + "1.Celcius\n" + "2.Fahrenheit\n" + "3.Reamur\n");
            }
            else if (data < 1 || data > 4){continue;}

            int data2 = scanner.nextInt();

            // Celcius to
            if (data == 1 && data2 == 1) {
                System.out.println("\nBerikan suhu:\n");
            }
            if (data == 1 && data2 == 2) {
                System.out.println("\nBerikan suhu:\n");
            }
            if (data == 1 && data2 == 3) {
                System.out.println("\nBerikan suhu:\n");
            }

            // Fahrenheit to
            if (data == 2 && data2 == 1) {
                System.out.println("\nBerikan suhu:\n");
            }
            if (data == 2 && data2 == 2) {
                System.out.println("\nBerikan suhu:\n");
            }
            if (data == 2 && data2 == 3) {
                System.out.println("\nBerikan suhu:\n");
            }

            // Reamur to
            if (data == 3 && data2 == 1) {
                System.out.println("\nBerikan suhu:\n");
            }
            if (data == 3 && data2 == 2) {
                System.out.println("\nBerikan suhu:\n");
            }
            if (data == 3 && data2 == 3) {
                System.out.println("\nBerikan suhu:\n");
            }

            // Kelvin to
            if (data == 4 && data2 == 1) {
                System.out.println("\nBerikan suhu:\n");
            }
            if (data == 4 && data2 == 2) {
                System.out.println("\nBerikan suhu:\n");
            }
            if (data == 4 && data2 == 3) {
                System.out.println("\nBerikan suhu:\n");
            }

            float suhu = scanner.nextInt();

            // Celcius Converter
            if (data == 1 && data2 == 1) {
                System.out.printf("%.2f", (suhu * 9 / 5) + 32);
            }
            if (data == 1 && data2 == 2) {
                System.out.printf("%.2f", suhu * 4 / 5);
            }
            if (data == 1 && data2 == 3) {
                System.out.printf("%.2f", (suhu + 273));
            }

            // Fahrenheit Converter
            if (data == 2 && data2 == 1) {
                System.out.printf("%.2f", (suhu - 32) * 5 / 9);
            }

            if (data == 2 && data2 == 2) {
                System.out.printf("%.2f", (suhu - 32) * 4 / 9);
            }
            if (data == 2 && data2 == 3) {
                System.out.printf("%.2f", ((suhu - 32) * 5 / 9) + 273);
            }

            // Reamur Converter
            if (data == 3 && data2 == 1) {
                System.out.printf("%.2f", (suhu * 5 / 4));
            }
            if (data == 3 && data2 == 2) {
                System.out.printf("%.2f", (suhu * 9 / 4) + 32);
            }
            if (data == 3 && data2 == 3) {
                System.out.printf("%.2f", (suhu * 5 / 4) + 273);
            }

            // Kelvin Converter
            if (data == 4 && data2 == 1) {
                System.out.printf("%.2f", (suhu - 273));
            }
            if (data == 4 && data2 == 2) {
                System.out.printf("%.2f", ((suhu - 273) * 9 / 5) + 32);
            }
            if (data == 4 && data2 == 3) {
                System.out.printf("%.2f", (suhu - 273) * 4 / 5);
            }

        }

    }
    }
}