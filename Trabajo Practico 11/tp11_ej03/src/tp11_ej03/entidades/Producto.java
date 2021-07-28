/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Todos los productos llevan información en común: fecha de caducidad y número 
de lote. A su vez, cada tipo de producto lleva alguna información específica.
 */
package tp11_ej03.entidades;

import java.time.LocalDate;

/**
 *
 * @author Adrian E. Camus
 */
public class Producto {
    String nombre;
    LocalDate fechaCaducidad;
    private LocalDate fechaEnvasado;
    long nroLote;

    public Producto() {
    }

    public Producto(String nombre,LocalDate fechaCaducidad, LocalDate fechaEnvasado, long nroLote) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
        this.fechaEnvasado = fechaEnvasado;
        this.nroLote = nroLote;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public long getNroLote() {
        return nroLote;
    }

    public void setNroLote(long nroLote) {
        this.nroLote = nroLote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        
    @Override
    public String toString() {
        return "\nNumero de Lote: " + nroLote + "\n"
                + "Fecha de Envasado: " + fechaEnvasado
                + "Fecha de Elaboracion: " + fechaCaducidad;

    }

}
