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
public class Congelado extends Fresco {

    private int tempMante;

    public Congelado() {
    }

    public Congelado(int tempMante,String paisOrigen,String nombre, String caducidad, String envasado, int nroLote) {
        super(paisOrigen,nombre, caducidad, envasado, nroLote);
        this.tempMante = tempMante;
        
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
    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public int getNroLote() {
        return nroLote;
    }

    @Override
    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    @Override
    public String toString() {
        return "Congelado\n"
                + super.toString()
                + "\nTemperatura de Mantenimiento: " + tempMante + " ° C";
    }

}
