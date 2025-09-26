package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) throws Exception {
        // Reconfigura para UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresá el año: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0) && (year %100 != 0 || year %400==0)){
        System.out.println(year + " es bisiesto");
                } else {
            System.out.println(year + " no es bisiesto");
        }
    }
}