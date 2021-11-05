
package lab4p2_karinmartinez;

public class Soldados {
    //atributos
    public String nombre,rango;
    public int edad, tiempo,vida; 
    
    //Comstructores

    public Soldados() {
    }

    public Soldados(String nombre, String rango, int edad, int tiempo, int vida) {
        this.nombre = nombre;
        this.rango = rango;
        this.edad = edad;
        this.tiempo = tiempo;
        this.vida = vida;
    }
    
    //mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    //AMD

    @Override
    public String toString() {
        return "Soldados{" + "nombre=" + nombre + ", rango=" + rango + ", edad=" + edad + ", tiempo=" + tiempo + ", vida=" + vida + '}';
    }
    
}
