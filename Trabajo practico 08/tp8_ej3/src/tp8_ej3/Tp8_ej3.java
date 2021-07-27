/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej3;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
     * Ejercicio 3:
     * Diseñar un programa que pida al usuario mediante su teclado que ingrese 
     * 5 números. Debe poder mostrar el promedio de los 5 números ingresados 
     * por pantalla con un mensaje final como 
     * “El promedio de los 5 números ingresados es .....“
     * @param args
     */

      Scanner teclado = new Scanner(System.in);
      int acumula=0, contador=0, num=0;
      double promedio=0;
      while (contador<5) {
			System.out.println("Ingrese un Numero");
			num = teclado.nextInt();
			acumula = acumula+num;
			contador++;
		}
      teclado.close();
      promedio = acumula/5;
	System.out.println("El promedio de los 5 numeros es: "+promedio);
        
    }
    
}