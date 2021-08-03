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
public class Division extends Operacion {

    private double division;

    public Division(double numero1, double numero2) {
        super(numero1, numero2, '/');
        this.division = numero1 / numero2;
        this.setResultado(division);
    }

}
