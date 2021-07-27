/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Posteriormente, crear una clase ConjuntoLibros o Biblioteca, 
    que almacena un conjunto de libros (con un array de un tamaño fijo 
    o variable). Se pueden añadir libros que no existan (siempre que 
    haya espacio), eliminar libros por título o autor,
    mostrar por pantalla los libros con la mayor y menor calificación
    dada y, por último, mostrar un contenido de todo el conjunto.

 */

package tp10_ej7;
import java.util.ArrayList;

/**
 * 
 * @author Adrian E. Camus
 */
public class Biblioteca {

    public ArrayList<Libro> libros = new ArrayList();
    
    public void agregarLibro(Libro l){
        this.libros.add(l);
    }
    
    public void borrarLibro(Libro l){
        this.libros.remove(l);
    }
    
     public void mostrarBiblioteca(){
         
         libros.forEach((Libro i) -> {
             System.out.println("LIBRO:     "+i.getEstrellas()+" estrellas\n"
                     + "Titulo: "+i.getTitulo()+" \n"
                             + "Autor : "+i.getAutor()+"\n"
                                     + "Estado: "+i.getPaginas()+"\n");
        });
                 
         
         
     }
}
