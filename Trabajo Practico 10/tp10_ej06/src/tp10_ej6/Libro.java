/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp10_ej6;

/**
 * 
 * @author Adrian E. Camus
 */
public class Libro {

    public String titulo;
    public String autor;
    public String disponible;

    public String isDisponible() {
        return disponible;
    }
            
    public void prestamo(){
        this.disponible = "Prestado";
    }
    
    public void devolucion(){
        this.disponible = "Disponible";
    }
    
    //Sobreescribir el metodo toString
    @Override
    public String toString(){
        
        return "LIBRO:  \n"
                + "Titulo: "+this.titulo+" \n"
                + "Autor : "+this.autor+"\n"
                + "Estado: "+this.disponible+"\n";
    }

    
    //GETTERS and SETTERS
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

}
