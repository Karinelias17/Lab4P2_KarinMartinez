
package lab4p2_karinmartinez;


public class Infanteriapesada extends Soldados{
    private Armas arma =new Bomba();

    public Infanteriapesada() {
        super();
    }

    public Infanteriapesada(Bomba arma, String nombre, String rango, int edad, int tiempo, int vida) {
        super(nombre, rango, edad, tiempo, vida);
        this.arma = arma;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Bomba arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Infanteriapesada{" + "arma=" + arma + '}';
    }
    
}
