public class Gato extends Mamifero {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("miau");
    }
}
