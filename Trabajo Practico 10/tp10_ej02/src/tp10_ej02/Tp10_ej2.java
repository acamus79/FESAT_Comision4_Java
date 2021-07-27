/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp10_ej02;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp10_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//Creo un objeto 'teclado' de la clase Scanner importada de java.util
        
        Scanner teclado = new Scanner(System.in);
        
// Creo un Objeto 'r' de la clase Contador con su contructor
        Contador c = new Contador();
        
//Pido los atributos del objeto 'c' mediante teclado
        System.out.println("Ingrese Un valor");
        int v = teclado.nextInt();
//Utilizo los metodos get set incrementar y decrementar con el valor ingresado por teclado        
                c.setContador(v);
                c.decrementar();
                c.decrementar();
                c.incrementar();
                System.out.println(c.getContador());
                        
        
//Cierro el objeto 'teclado' porque ya no lo utilizo mas        
        teclado.close();
        
        
        
        
        
    }
    
}
