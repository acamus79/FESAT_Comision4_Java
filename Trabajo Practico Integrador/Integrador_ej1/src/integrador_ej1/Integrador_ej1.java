/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package integrador_ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Integrador_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Enunciado: Escribir código de Java. Una escuela tiene un total de 3 aulas
        con la siguiente capacidad: Sabiendo la cantidad de bancos de cada aula, 
        escribir el programa para que el usuario ingresela cantidad de alumnos
        inscriptos para cursar tercer grado y el sistema deberá determinar
        qué aula es la indicada para la cantidad ingresada. 
        La escuela ya sabe que la máxima capacidad de sus aulas es de 
        40 alumnos, por lo tanto, la cantidad de alumnos inscriptos 
        que ingresa el usuario siempre será un número menor o igual 
        a 40. Listas necesarias para resolver el problema:
        Azul Verde Amarillo 40 35 30 
        */ 
        
        Scanner teclado = new Scanner(System.in);
        int cantidad = 0;
        //ArrayList<Integer> aulas = new ArrayList<>();
        //aulas.add(40);
        //aulas.add(35);
        //aulas.add(30);
           
        do{
            System.out.println(" INGRESE LA CANTIDAD DE ALUMNOS PARA 3ER GRADO ");
            cantidad = teclado.nextInt();}
        while (cantidad >40);
        
        if (cantidad<30)
            System.out.println("La mejor aula para los alumnos inscriptos es la AMARILLO");
        else
            if (cantidad>35)
                System.out.println("La mejor aula para los alumnos inscriptos es la AZUL");
                else
                System.out.println("La mejor aula para los alumnos inscriptos es la VERDE");
    }
    
}
