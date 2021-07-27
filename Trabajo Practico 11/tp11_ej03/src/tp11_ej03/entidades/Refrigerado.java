/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los productos refrigerados deben llevar el código del organismo de supervisión
alimentaria, la fecha de envasado, la temperatura de mantenimiento 
recomendada y el país de origen.

 */
package tp11_ej03.entidades;

import java.time.LocalDate;

/**
 *
 * @author Adrian E. Camus
 */
public class Refrigerado extends Producto {

    private long codOSA;
    private LocalDate fechaEnvasado;
    private int tempMante;

    public Refrigerado() {
    }

    public Refrigerado(long codOSA, LocalDate fechaEnvasado, int tempMante, LocalDate date, long nroLote) {
        super(date, nroLote);
        this.codOSA = codOSA;
        this.fechaEnvasado = fechaEnvasado;
        this.tempMante = tempMante;
    }

    public long getCodOSA() {
        return codOSA;
    }

    public void setCodOSA(long codOSA) {
        this.codOSA = codOSA;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public int getTempMante() {
        return tempMante;
    }

    public void setTempMante(int tempMante) {
        this.tempMante = tempMante;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public void setDate(LocalDate date) {
        this.date = date;
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
        return "Producto Refrigerado\n"
                + super.toString()
                + "\nFecha de Envasado: " + fechaEnvasado
                + "\nCodigo O.S.Alim: " + codOSA
                + "\nTemperatura de Mantenimiento: " + tempMante + " ° C";

    }

}
