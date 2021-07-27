/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    7 - Queremos mantener una colección de los libros que hemos ido
    leyendo, poniéndoles una calificación según nos haya gustado más o
    menos al leerlo. Para ello, crear la clase Libro, cuyos atributos son el
    título, el autor, el número de páginas y la calificación que le damos
    entre 0 y 10. Crear los métodos típicos para poder modificar y obtener
    los atributos si tienen sentido. Posteriormente, crear una clase
    ConjuntoLibros o Biblioteca, que almacena un conjunto de libros (con
    un array de un tamaño fijo o variable). Se pueden añadir libros que no
    existan (siempre que haya espacio), eliminar libros por título o autor,
    mostrar por pantalla los libros con la mayor y menor calificación
    dada y, por último, mostrar un contenido de todo el conjunto.
    Crear una clase, que realice varias pruebas con las clases creadas. 

 */

package tp10_ej7;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp10_ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui va todo el código
        
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Biblioteca misLibros = new Biblioteca();
        
        libro1.setAutor("Leon Tolstoi");
        libro1.setTitulo("Guerra y paz");
        libro1.setEstrellas(7);
        misLibros.agregarLibro(libro1);
                
        libro2.setAutor("Estanislao del Campo");
        libro2.setTitulo("Fausto");
        libro2.setEstrellas(9);
        misLibros.agregarLibro(libro2);
        
        libro3.setAutor("Nicolas Maquiavelo");
        libro3.setTitulo("El principe");
        libro3.setEstrellas(4);
        misLibros.agregarLibro(libro3);
        
        //Muestro la Biblioteca "misLibros" invocando al metodo mostrarBiblioteca
        misLibros.mostrarBiblioteca();
        
    }

}
