import java.util.ArrayList;

public class Repartir {

    private ArrayList<Carta> cartasRepartidas;

    public Repartir() {
        cartasRepartidas = new ArrayList<>();
    }

    // Reparte la cantidad de cartas que diga el usuario
    public ArrayList<Carta> repartirCartas(Baraja baraja, int cantidad) {

        ArrayList<Carta> mano = new ArrayList<>();

        // Verifica si aun le queda cartas disponibles por repartir
        if (cantidad > baraja.cartasDisponibles()) {
            System.out.println("No tiene sufientes cartas para repartir.");
            return null;
        }

        for (int i = 0; i < cantidad; i++) {

            Carta carta = baraja.SacarCarta();

            if (carta == null) {
                System.out.println("No quedan más cartas.");
                break;
            }

            mano.add(carta);
            cartasRepartidas.add(carta);
        }

        return mano;
    }

    // Mostrar las cartas repartidas
    public void mostrarRepartidas() {

        if (cartasRepartidas.isEmpty()) {
            System.out.println("No se han repartido cartas.");
            return;
        }

        System.out.println("Cartas repartidas:");

        for (Carta carta : cartasRepartidas) {
            System.out.println(carta);
        }
    }
}
