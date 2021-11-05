
package lab4p2_karinmartinez;

public class Supersoldado extends Soldados{
    private Armas arma =new Armablanca();

    public Supersoldado() {
        super();
    }

    public Supersolado(Armablanca arma, String nombre, String rango, int edad, int tiempo, int vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.arma = arma;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armablanca arma) {
        this.arma = arma;
    }
}
