/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp11_ej06.servicios;

import java.util.Scanner;
import tp11_ej06.entidades.Circulo;
import tp11_ej06.entidades.Rectangulo;
import tp11_ej06.entidades.Triangulo;

/**
 *
 * @author Adrian E. Camus
 */
public class FiguraService {

    private static Scanner leer;

    public FiguraService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    private void creaT() {
        Triangulo t = new Triangulo();
        System.out.println("Ingrese el lado A");
        t.setLadoA(leer.nextInt());
        System.out.println("Ingrese el lado B");
        t.setLadoB(leer.nextInt());
        System.out.println("Ingrese el lado C");
        t.setLadoC(leer.nextInt());
        t.calculoPerimetro();
        t.calculoArea();
        System.out.println(t);

    }

    private void creaR() {
        Rectangulo r = new Rectangulo();
        System.out.println("Ingrese la Base");
        r.setBase(leer.nextDouble());
        System.out.println("Ingrese la Altura");
        r.setAltura(leer.nextDouble());
        r.calculoPerimetro();
        r.calculoArea();
        System.out.println(r);

    }

    private void creaC() {
        Circulo c = new Circulo();
        System.out.println("Ingrese el Radio");
        c.setRadio(leer.nextDouble());
        c.calculoPerimetro();
        c.calculoArea();
        System.out.println(c);

    }

    public void menu() {
        int op = 0;
        do {
            System.out.println("***** F I G U R A S *****");
            System.out.println("** 1. TRIANGULO        **");
            System.out.println("** 2. RECTANGULO       **");
            System.out.println("** 3. CIRCULO          **");
            System.out.println("*************************");
            System.out.println("** 4. PARA SALIR       **");
            System.out.println("*************************");
            System.out.println("Ingrese la opcion...\n");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    creaT();
                    break;
                case 2:
                    creaR();
                    break;
                case 3:
                    creaC();
                    break;
                case 4:
                    System.out.println("CHAU!!  \n");
                    break;
                default:
                    System.out.println("Ingresó una opcion no validad");
                    op = 0;
                    break;

            }

        } while (op != 4);
    }

}
