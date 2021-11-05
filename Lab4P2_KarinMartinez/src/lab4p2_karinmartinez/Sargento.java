
package lab4p2_karinmartinez;


public class Sargento extends Soldados {
    private Armas arma =new Armablanca();

    public Sargento() {
        super();
    }

    public Sargento(Armablanca arma, String nombre, String rango, int edad, int tiempo, int vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.arma = arma;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armablanca arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Sargento{" + "arma=" + arma + '}';
    }
}
