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
public class Refrigerado extends Congelado {

    private long codOSA;

    public Refrigerado() {
    }

    public Refrigerado(long codOSA) {
        this.codOSA = codOSA;
    }

    public long getCodOSA() {
        return codOSA;
    }

    public void setCodOSA(long codOSA) {
        this.codOSA = codOSA;
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
    public long getNroLote() {
        return nroLote;
    }

    @Override
    public void setNroLote(long nroLote) {
        this.nroLote = nroLote;
    }

    @Override
    public String toString() {
        return "Refrigerado\n"
                + super.toString()
                + "\nCodigo O.S.Alim: " + codOSA;
    }

}
