/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Bicicleta {
    private String nroSerie;
    private String modelo;
    private int anio;
    private float precio;

    public Bicicleta() {
    }

    public Bicicleta(String nroSerie, String modelo, int anio, float precio) {
        this.nroSerie = nroSerie;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNroSerie() {
        return nroSerie;
    }

    @Override
    public String toString() {
        return "Bicicleta " + modelo + ", año de Fabricacion " + anio + "\nPrecio: $" + precio + "\nNumero de Serie "+nroSerie;
    }

    
    
}
