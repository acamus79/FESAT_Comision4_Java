/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej8;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej8 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
   Scanner teclado = new Scanner(System.in);
        int alumnos,contador;
	double n1, n2,n3,promedio;
            
            System.out.println("INGRESE CANTIDAD DE ALUMNOS");
		alumnos = teclado.nextInt();
		for (contador=1;contador<=alumnos;contador++) {
		    System.out.println("\n\n"); 
                    System.out.println("Alumno "+contador);
                    System.out.println("\n"); 
                    System.out.println("Primera Nota");
                    n1 = teclado.nextDouble();
                    System.out.println("\n"); 
                    System.out.println("Segunda Nota");
                    n2 = teclado.nextDouble();
                    System.out.println("\n"); 
                    System.out.println("Tercer Nota");
                    n3 = teclado.nextDouble();
                    promedio = ((n1+n2+n3)/3);
			if ((promedio<7)) {
				System.out.println("Promedio del Alumno "+contador+" DESAPROBADO, debe rendir final, promedio "+promedio);
			} else {
				System.out.println("El alumno ** APROBO ** con un promedio de "+promedio);
			}
			System.out.println("PRESIONE LA TECLA ENTER PARA CONTINUAR");
			System.in.read(); // espera un Enter, no cualquier tecla
			System.out.println("\n\n"); 
		}
	}
        
}
