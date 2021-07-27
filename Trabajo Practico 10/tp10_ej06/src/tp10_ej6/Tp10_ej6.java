/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    6– Crea una clase Libro con los métodos préstamo, devolución y
    toString. La clase contendrá un constructor por defecto, un
    constructor con parámetros y los métodos getters y setters.

 */

package tp10_ej6;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp10_ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui va todo el código
                
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        
        libro1.setAutor("Leon Tolstoi");
        libro1.setTitulo("Guerra y paz");
        libro1.devolucion();
        
        libro2.setAutor("Estanislao del Campo");
        libro2.setTitulo("Fausto");
        libro2.prestamo();
        
        libro3.setAutor("Nicolas Maquiavelo");
        libro3.setTitulo("El principe");
        libro3.devolucion();
                
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
    }

}
