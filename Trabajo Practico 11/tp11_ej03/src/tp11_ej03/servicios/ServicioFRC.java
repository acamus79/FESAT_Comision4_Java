/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp11_ej03.servicios;

import java.time.*;
import java.time.format.DateTimeFormatter;
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
    private long lot;
    
    
    private void creaProducto() {
        System.out.println("\nIngrese el nombre del producto");
        nom = leer.next();
        System.out.println("Ingrese fecha de Vencimiento dd/MM/aaaa");
        cadu = leer.next();
        System.out.println("Ingresa la fecha de envasado dd/MM/aaaa");
        env = leer.next();
        System.out.println("Ingrese el numero de Lote");
        lot = leer.nextLong();
    }

    public Fresco crearFresco() {
        //String paisOrigen, LocalDate fechaCaducidad, LocalDate fechaEnvasado, long nroLote
        creaProducto();
        System.out.println("Ingrese el Pais de Origen del producto");
        String pais = leer.next();
        return new Fresco(pais,nom,cadu,env,lot);
    }
    
    public Congelado crearCongelado() {
        crearFresco();
        System.out.println("Ingrese la Temperatura de Mantenimiento");
        int temp = leer.nextInt();
        return new Congelado(temp);

    }

    public Refrigerado crearRefrigerado() {
        crearCongelado();
        System.out.println("Ingrese el codigo del organismo de supervisión alimentaria");
        long cod = leer.nextLong();
        return new Refrigerado(cod);

    }
}
