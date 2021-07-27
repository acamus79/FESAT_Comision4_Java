/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Realizar un programa que pueda administrar la lista de contactos de varias 
    personas.Esta lista será posible modificar los datos de contactos, 
    eliminar/agregarun contacto, poder listarlos de forma ordenada según 
    nombres, números, calle donde vive o mails de cada uno de ellos.


 */
package tp10_ej09;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp10_ej09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Contacto misContactos = new Contacto();
        
        Persona c1 = new Persona();
        c1.setId(1);
        c1.setNombre("Homero Simpson");
        c1.setDomicilio("Av. Siempreviva 742");
        c1.setEmail("amantedelacomida53@aol.com");
        c1.setTelefono(76483226);
        misContactos.agregarContacto(c1);
        
        Persona c2 = new Persona();
        c2.setId(2);
        c2.setNombre("Ned Flanders");
        c2.setDomicilio("Av. Siempreviva 744");
        c2.setEmail("ned@mundoizquierdo.com");
        c2.setTelefono(76484366);
        misContactos.agregarContacto(c2);
        
        Persona c3 = new Persona();
        c3.setId(3);
        c3.setNombre("Maurice Lester Szyslak");
        c3.setDomicilio("Calle Wualnut 125");
        c3.setEmail("moe@tabernademoe.com");
        c3.setTelefono(76484377);
        misContactos.agregarContacto(c3);
        
        misContactos.mostrarContactos();
        
        System.out.println("Ingrese el nombre a buscar");
        misContactos.buscaContacto(leer.nextLine());

        
        
        }
    
}
