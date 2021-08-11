/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp11_ej04.servicios;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Menu {

    private Scanner leer;
    ServiciosXtech sx;

    public Menu() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.sx = new ServiciosXtech();
    }

    public void menu() {
        int op = 0;

        do {
            System.out.println("***** X T E C H Informatica ******");
            System.out.println("** 1. INGRESAR EMPLEADO         **");
            System.out.println("** 2. INFORMACION EMPLEADO      **");
            System.out.println("** 3. INGRESAR PROGRAMADOR      **");
            System.out.println("** 4. INFORMACION PROGRAMADOR   **");
            System.out.println("** 5. PARA SALIR                **");
            System.out.println("*********************************");
            System.out.println("Ingrese la opcion...\n");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    sx.crearEmpleado();
                    break;
                case 2:
                    sx.mostrarEmpleado();
                    break;
                case 3:
                    sx.creaProgramador();
                    break;
                case 4:
                    sx.mostrarProgramador();
                    break;
                case 5:
                    System.out.println("CHAU!!  \n");
                    break;
                default:
                    System.out.println("Ingresó una opcion no validad");
                    op = 0;
            }

        } while (op != 5);
    }
}
