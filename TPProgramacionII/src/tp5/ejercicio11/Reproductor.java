package tp5.ejercicio11;

public class Reproductor {
    private String modelo; 

    public Reproductor(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() { return modelo; }

    // DEPENDENCIA DE USO: Recibe el objeto Cancion como parámetro, pero no lo guarda.
    public void reproducir(Cancion cancion) {
        System.out.println("-> " + this.modelo + " está reproduciendo...");
        System.out.println(cancion.getTitulo() + " de " + cancion.getArtista().getNombre());
    }
}