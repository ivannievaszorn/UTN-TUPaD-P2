package tp5.ejercicio14;

public class Render {
    private String formato;
    private Proyecto proyecto; // Asociación Unidireccional

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    // Getters
    public String getFormato() { return formato; }
    public Proyecto getProyecto() { return proyecto; }
}