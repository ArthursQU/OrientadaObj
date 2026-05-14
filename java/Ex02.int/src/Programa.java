import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new Televisao());
        dispositivos.add(new Computador());

        for (Dispositivo d : dispositivos) {
            d.ligar();
            d.desligar();
        }
    }
}