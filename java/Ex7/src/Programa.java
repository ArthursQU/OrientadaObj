import java.util.ArrayList;

public class Programa {
    public static void ouvirAnimais(ArrayList<Pet>lista){
        for (Pet p : lista){
            p.fazerSom();
        }
    }

    public static void main(String[] args) {
        ArrayList<Pet> lista = new ArrayList<>();
        lista.add(new Arara());
        lista.add(new Cachorro());
        lista.add(new Gato());
        ouvirAnimais(lista);
    }
}
