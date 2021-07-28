/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los productos frescos deben llevar la fecha de envasado y el país de origen.

 */
package tp11_ej03.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Fresco extends Producto {

    private String paisOrigen;

    public Fresco() {
    }

    public Fresco(String paisOrigen, String nombre, String caducidad, String envasado, int nroLote) {
        super(nombre, caducidad, envasado, nroLote);
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Producto Fresco\n"
                + super.toString()
                + "\nPais de Origen: " + paisOrigen;
    }

}
