
package lab4p2_karinmartinez;

public class Zonas {
    //Atributos
    public String nombre;
    public int tamaño, x,y;
    
    //constructores

    public Zonas() {
    }

    public Zonas(String nombre, int tamaño, int x, int y) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.x = x;
        this.y = y;
    }
    //Mutadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //AMD

    @Override
    public String toString() {
        return "Zonas{" + "nombre=" + nombre + ", tama\u00f1o=" + tamaño + ", x=" + x + ", y=" + y + '}';
    }
    
}
