package tp6.caso3;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que modela un Profesor y su lista de Cursos (lado N).
 */
public class Profesor {

    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // Colección de Cursos que dicta

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); // Inicialización de la colección
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public List<Curso> getCursos() { return cursos; }
    
    // Métodos de gestión y sincronización

    /**
     * Agrega un curso a la lista del profesor y sincroniza el lado del Curso.
     * @param c El curso a agregar.
     */
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            System.out.println("🔗 Sincronizando: Curso '" + c.getNombre() + "' agregado a la lista de " + nombre);
            
            // Invariante de Asociación (Actualiza el lado del Curso)
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }

    /**
     * Quita un curso de la lista del profesor y sincroniza el lado del Curso.
     * @param c El curso a eliminar.
     */
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            System.out.println("❌ Sincronizando: Curso '" + c.getNombre() + "' removido de la lista de " + nombre);

            // Invariante de Asociación (Actualiza el lado del Curso)
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }

    // Métodos sugeridos
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("    [No dicta cursos actualmente]");
            return;
        }
        System.out.println("    - Cursos dictados:");
        for (Curso c : cursos) {
            System.out.println("      > [" + c.getCodigo() + "] " + c.getNombre());
        }
    }
    
    public void mostrarInfo() {
        String info = String.format("👤 Profesor ID: %s | Nombre: %s | Especialidad: %s | Cursos: %d", 
                                    id, nombre, especialidad, cursos.size());
        System.out.println(info);
        listarCursos();
    }
    
    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
}