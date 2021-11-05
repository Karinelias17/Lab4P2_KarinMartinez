
package lab4p2_karinmartinez;

public class Escuadron {
    //Atributos
    public String nombre;
    
    //Constructores
    public Escuadron(){
    }

    public Escuadron(String nombre) {
        this.nombre = nombre;
    }
    //mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos de ADM

    @Override
    public String toString() {
        return "Escuadron{" + "nombre=" + nombre + '}';
    }
    
}
