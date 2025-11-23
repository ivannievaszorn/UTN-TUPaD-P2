package tp6.caso3;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    
    public static void main(String[] args) {
        // Configuración UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Universidad unl = new Universidad("Universidad Nacional del Litoral");
        
        // 1. Creación de entidades
        System.out.println("\n--- 1. CREACIÓN DE ENTIDADES ---");
        Profesor profMateo = new Profesor("P101", "Mateo Pérez", "Matemáticas");
        Profesor profAna = new Profesor("P102", "Ana Gómez", "Informática");
        
        Curso cursoCalculo = new Curso("C201", "Cálculo I");
        Curso cursoProg = new Curso("C202", "Programación II");
        
        unl.agregarProfesor(profMateo);
        unl.agregarProfesor(profAna);
        unl.agregarCurso(cursoCalculo);
        unl.agregarCurso(cursoProg);
        
        // ----------------------------------------------------
        // TAREA A: ASIGNACIÓN INICIAL (Sincronización de Curso -> Profesor)
        // ----------------------------------------------------
        
        System.out.println("\n--- 2. ASIGNACIÓN INICIAL (Curso -> Profesor Mateo) ---");
        // Asignamos el Curso a Mateo. La lógica de setProfesor debe actualizar la lista de Mateo.
        cursoCalculo.setProfesor(profMateo); 
        
        System.out.println("\n--- VERIFICACIÓN A ---");
        cursoCalculo.mostrarInfo(); 
        profMateo.mostrarInfo(); // Debe tener 1 curso en su lista.
        
        // ----------------------------------------------------
        // TAREA B: CAMBIO DE PROFESOR (Sincronización de Curso -> Profesor)
        // ----------------------------------------------------
        
        System.out.println("\n--- 3. CAMBIO DE PROFESOR (Curso Prog -> Profesor Ana) ---");
        // Asignamos el Curso de Programación a Ana.
        cursoProg.setProfesor(profAna); 
        
        System.out.println("\n--- VERIFICACIÓN B.1 (Asignación) ---");
        cursoProg.mostrarInfo();
        profAna.mostrarInfo(); // Debe tener 1 curso en su lista.

        System.out.println("\n--- 4. TRANSFERENCIA (Cambio de Profesor en Curso Cálculo) ---");
        // Cambiamos el profesor de Cálculo I de Mateo a Ana.
        // La lógica de setProfesor debe: 1) Quitarlo de Mateo. 2) Añadirlo a Ana.
        cursoCalculo.setProfesor(profAna);
        
        System.out.println("\n--- VERIFICACIÓN B.2 (Transferencia) ---");
        cursoCalculo.mostrarInfo();
        profMateo.mostrarInfo(); // Debe tener 0 cursos.
        profAna.mostrarInfo();   // Debe tener 2 cursos.

        // ----------------------------------------------------
        // TAREA C: DESASIGNACIÓN (Profesor quita Curso)
        // ----------------------------------------------------
        
        System.out.println("\n--- 5. DESASIGNACIÓN (Profesor Ana quita Curso Prog) ---");
        // Usamos el método del Profesor para quitar el curso.
        // La lógica de eliminarCurso debe: 1) Quitar de su lista. 2) Poner profesor del curso en null.
        profAna.eliminarCurso(cursoProg);
        
        System.out.println("\n--- VERIFICACIÓN C ---");
        cursoProg.mostrarInfo(); // Debe decir [Sin asignar]
        profAna.mostrarInfo();   // Debe tener 1 curso.
    }
}