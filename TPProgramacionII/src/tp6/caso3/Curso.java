package tp6.caso3;

/**
 * Clase que modela un Curso y su Profesor responsable (lado 1).
 */
public class Curso {

    private String codigo;
    private String nombre;
    private Profesor profesor; // Profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    // Método central para la Invariante de Asociación
    
    /**
     * Asigna o cambia el profesor del curso, asegurando la sincronización en ambos lados.
     * @param nuevoProfesor El nuevo profesor a asignar (o null para desasignar).
     */
    public void setProfesor(Profesor nuevoProfesor) {
        
        // 1. Manejo del Profesor Anterior (Limpia el lado viejo)
        if (this.profesor != null && this.profesor != nuevoProfesor) {
            // Quita este curso de la lista del profesor anterior.
            this.profesor.getCursos().remove(this); 
            System.out.println("↪️ Limpiando: Curso '" + nombre + "' removido de la lista del Prof. " + this.profesor.getNombre());
        }

        // 2. Asignación del Nuevo Profesor
        this.profesor = nuevoProfesor;

        // 3. Manejo del Nuevo Profesor (Actualiza el lado nuevo)
        if (nuevoProfesor != null) {
            // Agrega este curso a la lista del nuevo profesor.
            // NOTA: Usamos el método agregarCurso() del Profesor para que él maneje su propia lista 
            // y evite bucles infinitos de sincronización (ya que agregarCurso llama a setProfesor).
            if (!nuevoProfesor.getCursos().contains(this)) {
                 nuevoProfesor.getCursos().add(this);
                 System.out.println("⬆️ Sincronizando: Curso '" + nombre + "' agregado a la lista del Prof. " + nuevoProfesor.getNombre());
            }
        }
    }

    // Métodos sugeridos

    public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "[Sin asignar]";
        System.out.println("📚 Curso: [" + codigo + "] " + nombre + " | Profesor: " + nombreProfesor);
    }
}