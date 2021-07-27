/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package integrador_ej2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Integrador_ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Enunciado: Escribir código de Java. Escribir  el programa
        para  realizar  la  búsqueda  del  nombre  de  un  cliente  en  
        un arreglo que contiene  5  clientes  en  total.  El  cliente  
        a  buscar  será  ingresado  por  pantalla  por  el  usuario.  
        El programa deberá devolver, en caso de que ese nombre exista, 
        la posición en donde se encuentra dicho cliente dentro del arreglo.
        */ 
   int i; 
        boolean condicion = true;
        String nombreIngresado;
        String compara;
        ArrayList<String> clientes = new ArrayList<>();
        
        Scanner teclado = new Scanner(System.in);
        
        for (i=0;i<5;i++) {
        
            System.out.println(" INGRESE UN CLIENTE ");
           
            clientes.add(teclado.nextLine());
        }

        System.out.println("Ingrese el cliente a buscar");
            nombreIngresado = teclado.nextLine();
                              
                for (i=0; i<clientes.size();i++){
                    compara = clientes.get(i);
           
                    if (nombreIngresado.equalsIgnoreCase(compara))
                        System.out.println("El Cliente se encontro en la lista, en la posicion "+i);
                    else
                        condicion = false;
                }
        teclado.close(); 
            if (condicion==false) {
                System.out.println("El Cliente NO EXISTE en la lista");
   } 
}
}