/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los productos congelados deben llevar la fecha de envasado, el
país de origen y la temperatura de mantenimiento recomendada.

 */
package tp11_ej03.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Congelado extends Fresco {

    private int tempMante;

    public Congelado() {
    }

    public Congelado(int tempMante, String paisOrigen, String nombre, String caducidad, String envasado, int nroLote) {
        super(paisOrigen, nombre, caducidad, envasado, nroLote);
        this.tempMante = tempMante;

    }

    public int getTempMante() {
        return tempMante;
    }

    public void setTempMante(int tempMante) {
        this.tempMante = tempMante;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTemperatura de Mantenimiento: " + tempMante + " ° C";
    }

}
