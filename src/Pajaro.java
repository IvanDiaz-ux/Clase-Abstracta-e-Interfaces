public class Pajaro implements Animal {
        private String colorPlumaje;

        public Pajaro(String colorPlumaje) {
            this.colorPlumaje = colorPlumaje;
        }

        @Override
        public void hacerRuido() {
            System.out.println("pio");
        }

        @Override
        public void comer() {
            System.out.println("Comer semillas.");
        }
    }
