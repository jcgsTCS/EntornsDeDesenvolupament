public class Gato extends Animal {

        public Gato(){
            super("Sin nombre");
        }

        public Gato(String nombre){
            super(nombre);
        }

        @Override
        public void hazSonido() {
            System.out.println("El Gato está ladrando");;
        }

        @Override
        public String getEspecie() {
            return "Gato";
        }
    }

