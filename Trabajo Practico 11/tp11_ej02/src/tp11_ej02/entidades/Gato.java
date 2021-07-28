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
        super.setEdad(edad);
        super.setNombre(nombre);
        super.setTipoDeAlimentacion(tipoDeAlimentacion);
        this.familia = familia;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public String toString() {
        return "Animal Gato: " + "de la familia de los " + familia 
        +super.toString();
    }
    
    

}
