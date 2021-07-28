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
public class Servicio_FRC {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private String nom;
    LocalDate fechaCadu;
    LocalDate fechaEnv;
    private long lot;
    
    
    private void creaProducto() {
        System.out.println("Ingrese el nombre del producto");
        nom = leer.next();
        System.out.println("Ingrese fecha de Vencimiento dd/MM/aaaa");
        String cadu = leer.next();
        fechaCadu = LocalDate.parse(cadu, dtf);
        System.out.println("Ingresa la fecha de envasado dd/MM/aaaa");
        String env = leer.next();
        fechaEnv = LocalDate.parse(env, dtf);
        System.out.println("Ingrese el numero de Lote");
        lot = leer.nextLong();
    }

    public Fresco crearFresco() {
        //String paisOrigen, LocalDate fechaCaducidad, LocalDate fechaEnvasado, long nroLote
        creaProducto();
        System.out.println("Ingrese el Pais de Origen del producto");
        String pais = leer.next();
        return new Fresco(pais,nom,fechaCadu,fechaEnv,lot);

    }

    public Congelado crearCongelado() {
        return null;

    }

    public Refrigerado crearRefrigerado() {
        return null;

    }
}
