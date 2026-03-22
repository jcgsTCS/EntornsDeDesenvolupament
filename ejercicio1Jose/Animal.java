public abstract class Animal {
private String nombre;

public Animal(String nombre){
    this.nombre = nombre;
}

public void hazSonido()
{
    System.out.println("El animal hace un sonido genérico");
}

    public void infoAnimal(){
        System.out.println(
                "El animal que se llama"+nombre+"es de la especie"+getEspecie()
        );
    }

    public abstract String getEspecie();

}
