/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp11_ej03.servicios;

import java.util.Scanner;
import tp11_ej03.entidades.Congelado;
import tp11_ej03.entidades.Fresco;
import tp11_ej03.entidades.Refrigerado;

/**
 *
 * @author Adrian E. Camus
 */
public class ServicioFRC {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nom;
    private String cadu;
    private String env;
    private int lot, temp;
    private String pais;
    
    private void creaProducto() {
        System.out.println("\nIngrese el nombre del producto");
        nom = leer.next();
        System.out.println("Ingrese fecha de Vencimiento dd/MM/aaaa");
        cadu = leer.next();
        System.out.println("Ingresa la fecha de envasado dd/MM/aaaa");
        env = leer.next();
        System.out.println("Ingrese el numero de Lote");
        lot = leer.nextInt();
    }

    public Fresco crearFresco() {
        System.out.println("");
        creaProducto();
        System.out.println("Ingrese el Pais de Origen del producto");
        pais = leer.next();
        return new Fresco(pais, nom, cadu, env, lot);
    }

    public Congelado crearCongelado() {
        System.out.println("");
        crearFresco();
        System.out.println("Ingrese la Temperatura de Mantenimiento");
        temp = leer.nextInt();
        return new Congelado(temp, pais, nom, cadu, env, lot);

    }

    public Refrigerado crearRefrigerado() {
        System.out.println("");
        crearCongelado();
        System.out.println("Ingrese el codigo del organismo de supervisión alimentaria");
        String cod = leer.next();
        return new Refrigerado(cod, temp, pais, nom, cadu, env, lot);

    }
}
