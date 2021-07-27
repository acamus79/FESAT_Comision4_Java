/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej4;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        int acumula,contador,nota;
	double xpromedio;
	contador = 0;
	acumula = 0;

        while (contador<3) {
		System.out.println("Ingrese Nota a promediar");
		nota = teclado.nextInt();
		acumula = acumula+nota;
		contador++;
		}
		xpromedio = acumula/3;
		if (xpromedio>=6) {
			System.out.println("El alumno aprobo con un promedio de: "+xpromedio);
		} else {
			System.out.println("El alumno NO aprobo por tener un promedio de: "+xpromedio);
		}
    }
    
}
