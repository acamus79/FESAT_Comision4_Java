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
public class Gato extends Animal{
    
    String familia;

    public Gato() {
    }

    public Gato(String familia) {
        this.familia = familia;
    }

    public Gato(String familia, String nombre, String tipoDeAlimentacion, int edad) {
        super(nombre, tipoDeAlimentacion, edad);
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
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
    
    

}
