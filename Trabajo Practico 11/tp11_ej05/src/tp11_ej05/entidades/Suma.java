/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp11_ej05.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Suma extends Operacion {
    
    private final String op = "Suma";

    public Suma() {
    }

    public Suma(double numero1, double numero2, String operacion) {
        super(numero1, numero2, operacion);
    }
        
}
