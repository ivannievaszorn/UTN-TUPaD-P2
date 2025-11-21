package tp5.ejercicio12;

public class Calculadora {
    
    public Calculadora() {
        // Constructor vacío
    }

    // DEPENDENCIA DE USO: Solo usa el objeto Impuesto para acceder a sus datos.
    public void calcular(Impuesto impuesto) {
        System.out.println("-> Iniciando cálculo de impuesto (Modelo de Dependencia)...");
        // Aquí se usaría el objeto 'impuesto' para realizar la lógica real.
        // En este ejemplo, solo verificamos el monto y el contribuyente.
        System.out.println("   Monto Base Verificado: $" + String.format("%.2f", impuesto.getMonto()));
        System.out.println("   Contribuyente: " + impuesto.getContribuyente().getNombre());
    }
}