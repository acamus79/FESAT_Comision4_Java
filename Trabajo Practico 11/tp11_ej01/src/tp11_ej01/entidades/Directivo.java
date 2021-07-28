/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp11_ej01.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Directivo extends Empleado{

    public Directivo() {
    }

    public Directivo(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" -> Directivo ";
    }

}
