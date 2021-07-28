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
public class Oficial extends Operario {

    public Oficial() {
    }

    public Oficial(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> Oficial ";
    }

}
