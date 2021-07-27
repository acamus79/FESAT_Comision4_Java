/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Diseñar un algoritmo que determine cuál es el mayor número de una serie ingresada por teclado.
        Se debe pedir al usuario la cantidad de números a ingresar antes de que ingrese la serie de datos.
        Además el programa debe determinar cuál es el menor valor de todos los datos ingresados*/
        
        Scanner teclado = new Scanner(System.in);
        int cantidad,contador;
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
           
        System.out.println(" INGRESE LA CANTIDAD DE NUMEROS PARA ANALIZAR ");
        cantidad = teclado.nextInt();
        
        for (contador=1;contador<=cantidad;contador++) {
            System.out.println(" INGRESE UN NUMERO ");
            listaDeNumeros.add(teclado.nextInt());
             
        }
            teclado.close();
            System.out.println("\n\n\n");
            System.out.println("La cantidad de numeros ingresados fueron: "+cantidad);
            System.out.println("Los numeros ingresados fueron:");
            listaDeNumeros.forEach(System.out::println);
            System.out.println("EL NUMERO MAYOR ES: " +Collections.max(listaDeNumeros));
            System.out.println("EL NUMERO MENOR ES: " +Collections.min(listaDeNumeros));
            
    }
 
}
