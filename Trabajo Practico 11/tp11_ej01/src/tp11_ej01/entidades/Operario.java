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
public class Operario extends Empleado{

    public Operario() {
    }

    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+" -> Operario ";
    }
    

}
