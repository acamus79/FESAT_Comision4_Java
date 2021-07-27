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

    LocalDate fechaCaducidad;
    long nroLote;

    public Producto() {
    }

    public Producto(LocalDate date, long nroLote) {
        this.fechaCaducidad = date;
        this.nroLote = nroLote;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getNroLote() {
        return nroLote;
    }

    public void setNroLote(long nroLote) {
        this.nroLote = nroLote;
    }

    @Override
    public String toString() {
        return "\nNumero de Lote: " + nroLote + "\n"
                + "Fecha de Elaboracion: " + fechaCaducidad;
                
    }

}
