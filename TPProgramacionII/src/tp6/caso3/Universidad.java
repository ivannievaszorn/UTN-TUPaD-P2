package tp6.caso3;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que administra las colecciones de Profesores y Cursos.
 */
public class Universidad {
    
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        System.out.println("🏛️ Universidad '" + nombre + "' inicializada.");
    }
    
    // Métodos de administración (simplificados)
    
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
            System.out.println("✅ Profesor agregado: " + p.getNombre());
        }
    }
    
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            System.out.println("✅ Curso agregado: " + c.getNombre());
        }
    }
    
    public Profesor buscarProfesor(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }
    
    public Curso buscarCurso(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }
    
    public void listarProfesoresYCursos() {
        System.out.println("\n--- 👥 LISTA DE PROFESORES Y SUS CARGAS ---");
        for (Profesor p : profesores) {
            p.mostrarInfo();
        }
        System.out.println("\n--- 📚 LISTA DE CURSOS Y PROFESOR ASIGNADO ---");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }
}