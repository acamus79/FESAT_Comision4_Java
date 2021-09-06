/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package servicios;

import entidades.*;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosBicicleteria {

    Scanner leer;

    public ServiciosBicicleteria() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void menu(Bicicleteria bicis) {
        int op = 0;
        do
        {
            System.out.println("****** BICICLETERIA LUDMILA  *****");
            System.out.println("* 1. Ver Stock                   *");
            System.out.println("* 2. Agregar Bicicleta           *");
            System.out.println("* 3. Vender Bicicleta            *");
            System.out.println("* 4. Ver Inversion Total         *");
            System.out.println("* 5. Salir                       *");
            System.out.println("**********************************");
            System.out.println("\nSelecciona una opcion");
            op = leer.nextInt();

            switch (op)
            {
                case 1:
                    stock(bicis);
                    break;
                case 2:
                    agregaBici(bicis);
                    break;
                case 3:
                    venta(bicis);
                    break;
                case 4:
                    System.out.println("EL total vender es: $" + bicis.inversionTotal());
                    break;
                case 5:
                    System.out.println("CHAU!!!");
                default:
                    System.out.println("Ingreso una opcion no valida");
            }

        } while (op != 5);
    }

    private void agregaBici(Bicicleteria bicis) {
        System.out.println("Ingrese en Numero de Serie");
        String nro = leer.next().toUpperCase();
        System.out.println("Ingrese el Modelo");
        String mod = leer.next().toUpperCase();
        System.out.println("Ingrese el Año de Fabricacion");
        int anio = leer.nextInt();
        System.out.println("Cual es el precio de venta?");
        float precio = leer.nextFloat();
        Bicicleta b1 = new Bicicleta(nro, mod, anio,precio);
        bicis.addBicicleta(b1);
    }

    private void venta(Bicicleteria bicis) {
        System.out.println("Ingrese en Numero de Serie de la Bicicleta");
        String num = leer.next().toUpperCase();
        bicis.venderBicicleta(bicis.buscarBicicleta(num));
    }

    private void stock(Bicicleteria bicis){
        
        System.out.println("STOCK de Bicicletas a la Venta "+bicis.getBibicletas().size());
        
        bicis.getBibicletas().forEach(aux ->
        {
            System.out.println(aux);
        });
    }
    
}
