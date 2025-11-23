package tp7;

public class Animal {
    private String tipo;

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }
    
    public void describirAnimal() {
        System.out.print("[" + tipo + "] ");
    }
}