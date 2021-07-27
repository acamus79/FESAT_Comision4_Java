/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej2;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Diseñar un programa para calcular y mostrar el área de un rectángulo.
        El programa tiene que solicitar los datos de entrada necesarios para poder 
        realizar la operación adecuadamente.*/
        double altura=0,area=0,base=0;
        
        Scanner teclado = new Scanner(System.in); // creo un objeto "teclado" de tipo scanner
        
        System.out.println("Ingrese la base del rectangulo en cm");
        base = teclado.nextDouble(); // a la variable base le asigno el proximo valor numerico doble de teclado
        System.out.println("Ingrese la altura del rectangulo en cm");
        altura = teclado.nextDouble();// a la variable altura le asigno el proximo valor numerico doble de teclado
        area = base * altura;
        System.out.println("El area del rectangulo es: "+area+" cm2");
    }
    
}
