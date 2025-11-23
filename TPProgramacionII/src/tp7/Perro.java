package tp7;

public class Perro extends Animal {
    public Perro() {
        super("Perro");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau! Guau!");
    }
}