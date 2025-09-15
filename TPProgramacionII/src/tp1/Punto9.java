import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Punto9 {
    public static void main(String[] args) throws Exception {
        // Reconfigura para UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre);
    }
}
