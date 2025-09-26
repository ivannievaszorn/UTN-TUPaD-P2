package tp2;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/* Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
// Menor de 12 años: "Niño"
// Entre 12 y 17 años: "Adolescente"
// Entre 18 y 59 años: "Adulto"
// 60 años o más: "Adulto mayor"
*/

public class Punto3 {
   public static void main(String[] args) throws Exception {
        // Reconfigura para UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if ((edad <12)){
            System.out.println("Niño");
        } else if ((edad <18)){
            System.out.println("Adoslescente");
        } else if ((edad <=59)){
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }               
    }
}
