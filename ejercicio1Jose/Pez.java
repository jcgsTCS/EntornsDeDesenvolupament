public class Pez extends Animal {
    public Pez(){
        super("Sin nombre");
    }

    public Pez(String nombre){
        super(nombre);
    }

    @Override
    public String getEspecie() {
        return "Pez";
    }
}

