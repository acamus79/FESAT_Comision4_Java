/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los productos frescos deben llevar la fecha de envasado y el país de origen.

 */
package tp11_ej03.entidades;

import java.time.LocalDate;

/**
 *
 * @author Adrian E. Camus
 */
public class Fresco extends Producto {

    LocalDate fechaEnvasado;
    String paisOrigen;

    public Fresco() {
    }

    public Fresco(LocalDate fechaEnvasado, String paisOrigen, LocalDate date, long nroLote) {
        super(date, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getNroLote() {
        return nroLote;
    }

    public void setNroLote(long nroLote) {
        this.nroLote = nroLote;
    }

    @Override
    public String toString() {
        return "Producto Fresco\n"
                + super.toString()
                + "\nFecha de Envasado: " + fechaEnvasado
                + "\nPais de Origen: " + paisOrigen;
    }

}
