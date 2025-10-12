package tp3.punto5;

class NaveEspacial {
    private String nombre;
    private int combustible;
    private int consumoDespegue;
    
    public NaveEspacial(String nombre, int combustible, int consumoDespegue){
        this.nombre = nombre;
        this.combustible = combustible;
        this.consumoDespegue = consumoDespegue;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCombustible(){
        return combustible;
    }
    
    public void setCombustible(int combustible) {
        if (combustible >= 0 && combustible <= 100) {
            this.combustible = combustible;
        } else {
            System.out.println("Valor de combustible inválido");
        }
    }
    
    public int getConsumoDespegue() {
        return consumoDespegue;
    }

    public void setConsumoDespegue(int consumoDespegue) {
        if (consumoDespegue >= 0) {
            this.consumoDespegue = consumoDespegue;
        } else {
            System.out.println("Consumo de despegue inválido");
        }
    }
    
    public void mostrarEstado(){
        System.out.println(this.toString());
    }
    
    public void despegar() {
        setCombustible(getCombustible() - consumoDespegue);
        System.out.println("Nave despegada. Combustible actual: " + getCombustible() + " unidades");
    }
    
    public void avanzar(int distancia) {
        int consumoPorUnidad = 1;
        int consumoViaje = distancia * consumoPorUnidad;
        int totalNecesario = getConsumoDespegue() + consumoViaje;

        if (getCombustible() >= totalNecesario) {
            despegar(); // resta consumoDespegue
            setCombustible(getCombustible() - consumoViaje); // resta avance
            System.out.println("La nave avanzó " + distancia + " unidades. Combustible restante: " + getCombustible());
        } else {
            int combustibleFaltante = totalNecesario - getCombustible();
            System.out.println("No hay suficiente combustible para despegar y avanzar " + distancia + " unidades. "
                    + "Faltan " + combustibleFaltante + " unidades de combustible.");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        if (cantidad > 0) {
            int nuevoCombustible = getCombustible() + cantidad;
            if (nuevoCombustible <= 100) {
                setCombustible(nuevoCombustible);
                System.out.println("Nave recargada con: " + cantidad + ". Combustible actual: " + getCombustible());
            } else {
                System.out.println("No se puede recargar por encima de la capacidad de 100 unidades");
            }
        } else {
            System.out.println("No se puede ingresar un número negativo para la carga de combustible");
        }
    }
    
        @Override
        
        
        public String toString() {
            return "---- Estado de la Nave ----\n" +
                   "Nombre: " + nombre + "\n" +
                   "Combustible: " + combustible + " unidades\n" +
                   "----------------------------";
        }
}