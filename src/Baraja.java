import enums.EnumsBaraja;

import java.util.Random;

public class Baraja {

//la clase baraja va a tener metodos para las acciones(barajar,repartir,sacar etc)

    private Carta[] baraja;

    //metodo para crear el maso de cartas
    public Baraja() {
        baraja = new Carta[40];
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        int i = 0;
        for (EnumsBaraja.Palo palo : EnumsBaraja.Palo.values()) {
            for (int num : numeros) {
                baraja[i++] = new Carta(num, palo);
            }
        }
    }

    //metodo para mezlar cartas
    public void barajar() {
        Random rdm = new Random();
        for (int i = baraja.length - 1; i > 0; i--) {
            int j = rdm.nextInt(i + 1);
            Carta a = baraja[i];
            baraja[i] = baraja[j];
            baraja[j] = a;
        }
    }
    //metodo para sacar una carta
    public Carta SacarCarta () {
        return baraja[0];
        }
    }