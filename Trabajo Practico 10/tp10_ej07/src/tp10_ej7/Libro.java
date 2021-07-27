/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    crear la clase Libro, cuyos atributos son el
    título, el autor, el número de páginas y la calificación que le damos
    entre 0 y 10. Crear los métodos típicos para poder modificar y obtener
    los atributos si tienen sentido.

 */

package tp10_ej7;

/**
 * 
 * @author Adrian E. Camus
 */
public class Libro {

    public String titulo;
    public String autor;
    public int paginas;
    public int estrellas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        
        if (estrellas>=0 || estrellas<=10){
            this.estrellas = estrellas;
        }
                
    }
    
    
    
}
