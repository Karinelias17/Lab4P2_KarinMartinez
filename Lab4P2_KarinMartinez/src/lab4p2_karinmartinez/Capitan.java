
package lab4p2_karinmartinez;

public class Capitan extends Soldados{
    private Armas arma =new Escopeta();

    public Capitan() {
        super();
    }

    public Capitan(Escopeta arma, String nombre, String rango, int edad, int tiempo, int vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.arma = arma;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Escopeta arma) {
        this.arma = arma;
    }
}
