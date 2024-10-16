public class Perro extends Mamifero {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("guau");
    }
}

