public class Ejemplo {
    public String nombre;
    public String descripcion;

    public Ejemplo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {return nombre;}
    public String getDescripcion() {return descripcion;}

    @Override
    public String toString() {
        return "Ejemplo: " + nombre + "\nDescripción: " + descripcion;
    }
}
