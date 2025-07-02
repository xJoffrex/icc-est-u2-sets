package src.Models;

public class Contacto {
    private String nombre, apellido, telefono;

    


    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + " " + apellido + " - " + telefono + "]";
    }

    @Override
    public int hashCode() {
        return nombre.hashCode() + apellido.hashCode();
    } 

    

    

    

    



    


    
}
