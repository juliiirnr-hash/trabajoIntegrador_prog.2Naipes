import java.util.Scanner;
public class Menu {

    public static void main(String[] args) {
        
        Scanner menu = new Scanner(System.in);
        int opcion;

        Baraja baraja = new Baraja(); //genero la baraja

        //menu
        do {
        System.out.println("\n¿Que quieres hacer?");
        System.out.println("1) Barajar\n 2)Sacar una carta\n " +
                "3)Ver cantidad de cartas\n 4)Repartir \n" +
                "5)Ver cartas repartidas \n 6)Ver cartas restantes \n7)Salir");
        opcion = menu.nextInt();

            switch (opcion) {
                case 1:
                    //mezclar cartas
                    baraja.barajar();
                    System.out.println("barajando...");
                    break;
                case 2:
                    System.out.println(baraja.SacarCarta());
                    break;
                case 3:
                    //ver cantidad de cartas
                    break;
                case 4:
                    //repartir
                    break;
                case 5:
                    //ver manos
                    break;
                case 6:
                    //ver cartas restantes
                    break;
                case 7:
                    //salir
                    System.out.println("¡¡ Gracias por jugar !!");
                    break;
                default:
                    //opcion invalida
                    System.out.println("Error,ingresa una opcion nuevamente");
            }

        } while (opcion != 7);

    }

}
