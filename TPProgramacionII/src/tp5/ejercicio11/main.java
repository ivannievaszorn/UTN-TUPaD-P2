package tp5.ejercicio11;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        System.out.println("--- PRUEBA: EJERCICIO 11 (Dependencia de Uso) ---");

        Artista miArtista = new Artista("Rammstein", "Metal Industrial");
        Cancion miCancion = new Cancion("Du Hast", miArtista);
        Reproductor miReproductor = new Reproductor("Spotify");
        
        System.out.println("Canción lista: " + miCancion.getTitulo());
        
        // Se llama al método, se le pasa la canción (Dependencia)
        miReproductor.reproducir(miCancion);

        System.out.println("\n--- FIN EJERCICIO 11 ---");
    }
}