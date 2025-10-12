package tp4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int ultimoIdAsignado = 0;
    private static final double salarioPorDefecto = 850000;

    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        ultimoIdAsignado = this.id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        System.out.println("Empleado creado. Total de empleados: " + totalEmpleados);
    }
    
    public Empleado(String nombre, String puesto){
        this.id = ++ultimoIdAsignado;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salarioPorDefecto;
        totalEmpleados++;
        System.out.println("Empleado creado. Total de empleados: " + totalEmpleados);
    }
    
    public void actualizarSalario(double porcentajeDeAumento){
        double montoAumento = this.salario * (porcentajeDeAumento / 100);
        this.salario+= montoAumento;
        System.out.println("Se ha actualizado el salario de " + this.nombre + 
                ". El aumento fue de $" + montoAumento + 
                ". El salariuo nuevo es de $" + this.salario);
    }
    
    public void actualizarSalario(int cantidadAumento){
        double salarioSinAumento = this.salario;
        this.salario += cantidadAumento;
        double porcentajeDeAumento = ((this.salario - salarioSinAumento) / salarioSinAumento) * 100;
        System.out.println("Se ha actualizado el salario de " + this.nombre + 
                           ". El aumento fue de " + String.format("%.2f", porcentajeDeAumento) + "%" +
                           ". El salario nuevo es de $" + this.salario);
    }

    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    
    public void mostrarEstado(){
        System.out.println(this.toString());
    }    
   
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
        if(id > ultimoIdAsignado){
            ultimoIdAsignado = id;
        }
    }     
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }    
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }    
    
    
    @Override
    public String toString() {
        return "Empleado{" + "id: " + id + ", nombre: " + nombre + ", puesto: " + puesto + ", salario: $" + salario + '}';
    }
}
