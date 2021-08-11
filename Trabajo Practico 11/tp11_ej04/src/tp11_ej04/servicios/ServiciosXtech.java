/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp11_ej04.servicios;

import java.util.Scanner;
import tp11_ej04.entidades.Empleado;
import tp11_ej04.entidades.Programador;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosXtech {

    private Scanner leer;
    private Empleado e1;
    private Programador p1;

    public ServiciosXtech() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

//String nombre, String apellido, String cedula, int edad, boolean casado, double salario    
    public void crearEmpleado() {
        this.e1 = new Empleado();
        System.out.println("Ingrese el nombre del empleado");
        e1.setNombre(leer.next().toUpperCase());
        System.out.println("Ingrese el apellido");
        e1.setApellido(leer.next().toUpperCase());
        System.out.println("Cedula:");
        e1.setCedula(leer.next());
        System.out.println("Edad:");
        e1.setEdad(leer.nextInt());
        System.out.println("Casado? S/N");
        char casado = leer.next().toUpperCase().charAt(0);
        switch (casado) {
            case 'S':
                e1.setCasado(true);
                break;
            case 'N':
                e1.setCasado(false);
                break;
            default:
                System.out.println("Ingresó una opcion no validad");
        }
        System.out.println("Cual es el Salario?");
        e1.setSalario(leer.nextDouble());
    }

    public void creaProgramador() {
        this.p1 = new Programador();
        System.out.println("Ingrese el nombre del empleado");
        p1.setNombre(leer.next().toUpperCase());
        System.out.println("Ingrese el apellido");
        p1.setApellido(leer.next().toUpperCase());
        System.out.println("Cedula:");
        p1.setCedula(leer.next());
        System.out.println("Edad:");
        p1.setEdad(leer.nextInt());
        System.out.println("Casado? S/N");
        char casado = leer.next().toUpperCase().charAt(0);
        switch (casado) {
            case 'S':
                p1.setCasado(true);
                break;
            case 'N':
                p1.setCasado(false);
                break;
            default:
                System.out.println("Ingresó una opcion no validad");
        }
        System.out.println("Cual es el Salario?");
        p1.setSalario(leer.nextDouble());
        System.out.println("Lenjuage de Programacion Dominante:");
        p1.setLenguajeDominante(leer.next().toUpperCase());
        System.out.println("Lineas de codigo por Hora:");
        p1.setLineasDeCodigoPorHora(leer.nextInt());
    }

    public void mostrarEmpleado() {
        System.out.println(e1.toString());
        System.out.println("Desea aumentar el sueldo? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        switch (op) {
            case 'S':
                System.out.println("Ingrese el porcentaje de aumento");
                double aumento = leer.nextDouble();
                e1.aumentoSalario(aumento);
                break;
            case 'N':
                System.out.println("...es que no se lo merece\n\n");
                break;
            default:
                System.out.println("Ingresó una opcion no validad");
        }
    }

    public void mostrarProgramador() {
        System.out.println(p1.toString());
        System.out.println("Desea aumentar el sueldo? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        switch (op) {
            case 'S':
                System.out.println("Ingrese el porcentaje de aumento");
                double aumento = leer.nextDouble();
                p1.aumentoSalario(aumento);
                break;
            case 'N':
                System.out.println("...es que no se lo merece\n\n");
                break;
            default:
                System.out.println("Ingresó una opcion no validad");
        }
    }

}
