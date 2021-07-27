/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp8_ej5;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp8_ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        double cambiodolar,cambioeuro,cambioreal,dolar,euro,pesos,real;
	int opcion;
            dolar = 57;
            real = 13.6;
            euro = 61.8;
                                    
	System.out.println("Ingrese cantidad de pesos a convertir");
        
        pesos = teclado.nextDouble();
        cambiodolar = pesos/dolar;
		cambioeuro = pesos/euro;
		cambioreal = pesos/real;
		System.out.println("INGRESE el numero 1 para convertir a dolares; "
                                   + "2 para Euros, "
                                   + "3 para Reales "
                                   + "o ingrese 0 para Salir :");
        opcion = teclado.nextInt();
        switch (opcion) {
		case 1:
			System.out.println("Los pe$os ingresados en dolares son U$$ "+cambiodolar);
			break;
		case 2:
			System.out.println("Los pe$os ingresados en euros son EU$ "+cambioeuro);
			break;
		case 3:
			System.out.println("Los pe$os ingresados en reales son R$ "+cambioreal);
			break;
		default:
			System.out.println("CHAU!!");
        
        }
    }
}
