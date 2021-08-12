/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Realizar la codificación del siguiente diagrama de clases
con  algún método que compartan entre las mismas


              FIGURA

CIRCULO     RECTANGULO      TRIANGULO

 */

package tp11_ej06;

import tp11_ej06.servicios.FiguraService;

/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraService fs = new FiguraService();
        fs.menu();
        
        
    }

}
