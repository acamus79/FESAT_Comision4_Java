/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej9;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");                                                         
        n = teclado.nextInt();
        System.out.println("*** Tabla del " + n+" ***");
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
}