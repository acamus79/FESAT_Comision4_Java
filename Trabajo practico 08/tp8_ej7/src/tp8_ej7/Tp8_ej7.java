/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej7;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
	n1 = 0;
	n2 = 0;
	n3 = 0;
		System.out.println("Ingrese el primer numero");
		n1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		n2 = teclado.nextInt();
		System.out.println("Ingrese el tercer numero");
		n3 = teclado.nextInt();
		if (n1==n2 && n1==n3) {
			System.out.println("Los 3 numeros son iguales: "+n1+"-"+n2+"-"+n3);
		} else {
			if (n1==n3) {
				System.out.println("El primer numero es igual al tercero "+n1+"-"+n3);
			} else {
				if (n1==n2) {
					System.out.println("El primer numero es igual al segundo "+n1+"-"+n2);
				} else {
					if (n2==n3) {
						System.out.println("Los segundo numero es igual al tercero: "+n2+"-"+n3);
					} else {
						System.out.println("Los 3 numeros son distintos: "+n1+"-"+n2+"-"+n3);
					}
				}
			}
		}
    }
    
}
