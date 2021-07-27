/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los productos congelados deben llevar la fecha de envasado, el
país de origen y la temperatura de mantenimiento recomendada.

 */
package tp11_ej03.entidades;

import java.time.LocalDate;

/**
 *
 * @author Adrian E. Camus
 */
public class Congelado extends Producto {

    private LocalDate fechaEnvasado;
    private String paisOrigen;
    private int tempMante;

    public Congelado() {
    }

    public Congelado(LocalDate fechaEnvasado, String paisOrigen, int tempMante, LocalDate date, long nroLote) {
        super(date, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.tempMante = tempMante;
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

    public int getTempMante() {
        return tempMante;
    }

    public void setTempMante(int tempMante) {
        this.tempMante = tempMante;
    }

    @Override
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public void setFechaCaducidad(LocalDate date) {
        this.fechaCaducidad = date;
    }

    @Override
    public long getNroLote() {
        return nroLote;
    }

    @Override
    public void setNroLote(long nroLote) {
        this.nroLote = nroLote;
    }

    @Override
    public String toString() {
        return "Producto Congelado\n"
                + super.toString()
                + "\nFecha de Envasado: " + fechaEnvasado
                + "\nPais de Origen: " + paisOrigen
                + "\nTemperatura de Mantenimiento: " + tempMante + " ° C";
    }

}
