public class Perro extends Animal{
    public Perro(){
        super("Sin nombre");
    }

    public Perro(String nombre){
        super(nombre);
    }

    @Override
    public void hazSonido() {
        System.out.println("El perro está ladrando");;
    }

    @Override
    public String getEspecie() {
        return "Perro";
    }
}
