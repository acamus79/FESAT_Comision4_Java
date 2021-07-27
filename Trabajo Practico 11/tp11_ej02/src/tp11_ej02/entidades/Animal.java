/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp11_ej02.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Animal {
    String nombre;
    String tipoDeAlimentacion;
    int edad;

    public Animal() {
    }

    public Animal(String nombre, String tipoDeAlimentacion, int edad) {
        this.nombre = nombre;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nAlimentacion: " + tipoDeAlimentacion + "\nEdad: " + edad;
    }
    
    
}
