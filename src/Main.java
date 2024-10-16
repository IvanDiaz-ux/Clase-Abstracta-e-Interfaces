//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Animal perro = new Perro("Firulais", 3);
                Animal gato = new Gato("Michi", 2);
                Animal pajaro = new Pajaro("Amarillo");


                perro.hacerRuido();
                gato.hacerRuido();
                pajaro.hacerRuido();
            }
    }

//¿por qué usar métodos abstractos de Java?
//1.Evite la duplicación de esfuerzos
//2.Los métodos abstractos en Java permiten la definición de uso e implementación:
//3.Legibilidad y depuración
//https://codegym.cc/es/groups/posts/es.192.clases-y-metodos-abstractos-de-java
//¿Qué es una interfaz Java?
// se trata de una clase que no puede ser implementada por sí misma, sino que otras clases
// la heredan y la implementan. De este modo, al emplear las interfaces.
//una interfaz de Java presenta las siguientes características:
//*Puede contener encabezados de métodos y constantes públicas, nunca implementaciones.
//*La clase no puede ser instanciada, tan solo implementada por una clase.
//*No se puede extender.
//*Las interfaces pueden implementar otras interfaces.
//*Una clase puede implementar varias interfaces.
//*Se pueden declarar métodos estáticos (Static).