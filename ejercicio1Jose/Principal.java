
public class Principal {

    public static void main(String[] args) {

        Perro perro = new Perro(" Jawa ");
        Animal animalPerro = new Perro(" Palo");

        Animal[] animales = new Animal[3];
        animales[0] = new Perro(" Pepe ");
        animales[1] = new Perro(" Sapo ");
        animales[2] = new Perro(" Palo ");

        for (int i = 0; i < 3; i++) {
            animales[i].hazSonido();
            animales[i].infoAnimal();
            System.out.println("Especie:  " + animales[i].getEspecie());
        }
    }
}