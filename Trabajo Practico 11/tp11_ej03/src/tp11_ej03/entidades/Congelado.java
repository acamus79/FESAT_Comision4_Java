/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los productos congelados deben llevar la fecha de envasado, el
país de origen y la temperatura de mantenimiento recomendada.

 */
package tp11_ej03.entidades;

import java.time.LocalDate;

/**
 *
 * @author Adrian E. Camus
 */
public class Congelado extends Fresco {

    private int tempMante;

    public Congelado() {
    }

    
    
    @Override
    public String toString() {
        return "Congelado\n"
                + super.toString()
                + "\nTemperatura de Mantenimiento: " + tempMante + " ° C";
    }

}
