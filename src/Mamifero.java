
abstract class Mamifero implements Animal {
    protected String nombre;
    protected int edad;

    public Mamifero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void comer() {
        System.out.println("Comiendo alimento para mamíferos.");
    }
}