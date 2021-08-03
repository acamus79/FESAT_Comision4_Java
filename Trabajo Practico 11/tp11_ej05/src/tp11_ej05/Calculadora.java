/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Traducir el diagrama de clases a entidades codificadas en Java  utilizando 
Netbeans

Diagrama de la calculadora


 */

package tp11_ej05;

import tp11_ej05.entidades.Division;
import tp11_ej05.entidades.Multiplicacion;
import tp11_ej05.entidades.Resta;
import tp11_ej05.entidades.Suma;

/**
 *
 * @author Adrian E. Camus
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui va todo el código
        double n1 = 10;
        double n2 = 5;
        
        //suma
        Suma sum = new Suma(n1,n2);
        sum.mostrarResultado();
                
        //resta
        Resta res = new Resta(n1,n2);
        res.mostrarResultado();
        
        //multiplicacion
        Multiplicacion mul = new Multiplicacion(n1,n2);
        mul.mostrarResultado();
        
        //division
        Division div = new Division(n1,n2);
        div.mostrarResultado();
        
        
        
        
    }

}
