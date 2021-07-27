/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej6;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej6 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        /*Realice las modificaciones necesarias al ejercicio 5 de esta guía
        práctica para poder ingresar reiteradas veces valores en pesos y 
        convertirlos a otra moneda o bien poder elegir 
        la opción 0 para salir del programa.*/ 
    Scanner teclado = new Scanner(System.in);
        double cambiodolar,cambioeuro,cambioreal,dolar,euro,pesos,real;
	int opcion;
            dolar = 97.42;
            real = 16.49;
            euro = 110.99;
    // Menu
		do {
			System.out.println("\n\n\n\n\n");
                        System.out.println("*** MENU DE CONVERSION ***");
			System.out.println("** 1 de Pesos a Dolares **");
			System.out.println("** 2 de Pesos a Euros   **");
			System.out.println("** 3 de Pesos a Reales  **");
			System.out.println("** 0 para SALIR         **");
			System.out.println("**************************");
			System.out.println("Ingrese una opción del 0 al 3");
                opcion = teclado.nextInt();
                if (opcion==1) {
				pesos = 0;
				cambiodolar = 0;
				System.out.println("\n\n\n\n\n\n");
                                System.out.println("Ingrese cantidad de pesos a convertir");
				System.out.println("\n\n\n");
                                pesos = teclado.nextDouble();
				cambiodolar = pesos/dolar;
				System.out.println("\n");
                                System.out.println("$"+pesos+" pesos en dolares es: U$$ "+cambiodolar);
				System.out.println("\n");
				System.out.println("Presione la tecla ENTER para continuar");
				System.in.read(); 
                                } else {
				if (opcion==2) {
					pesos = 0;
					cambioeuro = 0;
					System.out.println("\n\n\n\n\n\n");
                                        System.out.println("Ingrese cantidad de pesos a convertir");
					System.out.println("\n\n\n\n");
                                        pesos = teclado.nextDouble();
					cambioeuro = pesos/euro;
					System.out.println("\n");
                                        System.out.println("$"+pesos+" pesos en Euros es EU$ "+cambioeuro);
					System.out.println("\n");
					System.out.println("Presione la tecla ENTER para continuar");
					System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				} else {
					if (opcion==3) {
						pesos = 0;
						cambioreal = 0;
						System.out.println("\n\n\n\n\n\n");
                                                System.out.println("Ingrese cantidad de pesos a convertir");
						System.out.println("\n\n\n\n");
                                                pesos = teclado.nextDouble();
						cambioreal = pesos/real;
						System.out.println("\n");
                                                System.out.println("$"+pesos+" pesos en Reales es R$ "+cambioreal);
						System.out.println("\n");
						System.out.println("Presione la tecla ENTER para continuar");
						System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
					}
				}
			}
			// Fin Menu por opcion 4
		} while (opcion!=0);
		System.out.println("\n\n\n\n\n\n");
                System.out.println("\n\n\n\n\n\n");
                System.out.println("*** CHAU!!! ***");
    }
}