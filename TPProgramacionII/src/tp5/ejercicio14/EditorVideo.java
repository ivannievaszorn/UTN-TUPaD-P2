package tp5.ejercicio14;

public class EditorVideo {
    private String software; 

    public EditorVideo(String software) {
        this.software = software;
    }

    public String getSoftware() { return software; }

    // DEPENDENCIA DE CREACIÓN: Crea la instancia de Render DENTRO del método.
    // El EditorVideo NO guarda el Render como atributo propio.
    public void exportar(String formato, Proyecto proyecto) {
        System.out.println("-> El editor " + this.software + " está exportando proyecto: " + proyecto.getNombre());
        
        // CREACIÓN: Crea el objeto Render (el resultado temporal)
        Render resultado = new Render(formato, proyecto); 
        
        // Uso y Visualización del objeto creado
        System.out.println("   Render Finalizado en formato: " + resultado.getFormato());
    }
}