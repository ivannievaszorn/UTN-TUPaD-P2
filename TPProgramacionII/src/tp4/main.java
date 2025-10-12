/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

/**
 *
 * @author djgri
 */
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Empleado e1 = new Empleado(1, "Ivan", "Administracion", 950000.0);
        Empleado e2 = new Empleado("Cynthia", "Ventas");
        Empleado e3 = new Empleado("Florencia", "Operativa");
        Empleado e4 = new Empleado(4, "Daniel", "Operativa", 900000.0);
        System.out.println("Total empleados creados: " + Empleado.mostrarTotalEmpleados());
               
        e1.mostrarEstado();
        e1.actualizarSalario(8.0); // Aumentamos 8% el salario de e1
        e1.mostrarEstado(); // Verificamos aumento
        e2.mostrarEstado();
        e2.actualizarSalario(68000);
        e2.mostrarEstado();
        e3.mostrarEstado();
        e3.actualizarSalario(5.0);
        e3.mostrarEstado();
        e4.mostrarEstado();
        e4.actualizarSalario(45000);
        e4.mostrarEstado();
        
    }        
}
