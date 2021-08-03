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
public class Resta extends Operacion {

    private double resta;

    public Resta(double numero1, double numero2) {
        super(numero1, numero2, '-');
        this.resta = numero1 - numero2;
        this.setResultado(resta);

    }

}
