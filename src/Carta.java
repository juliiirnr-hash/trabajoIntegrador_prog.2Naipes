import enums.EnumsBaraja;

public class Carta {
    private EnumsBaraja.Palo palo;
    private int num;

    //arreglo q contiene los numeros
    private static final String[] nums = {
            "", "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
            "", "", "Sota", "Caballo", "Rey"
    };

    //constructor de palo y numero
    public Carta(int num,EnumsBaraja.Palo palo) {
        this.palo = palo;
        this.num = num;
    }

    //getters y setters de palo y numero
    public EnumsBaraja.Palo getPalo() {
        return palo;
    }

    public void setPalo(EnumsBaraja.Palo palo) {
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString(){
        return num + " de " + palo;
    }

}
