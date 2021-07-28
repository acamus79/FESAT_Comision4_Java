/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Todos los productos llevan información en común: fecha de caducidad y número 
de lote. A su vez, cada tipo de producto lleva alguna información específica.
 */
package tp11_ej03.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Adrian E. Camus
 */
abstract class Producto {

    String nombre;
    LocalDate fechaCaducidad;
    private LocalDate fechaEnvasado;
    int nroLote;

    public Producto() {
    }

    public Producto(String nombre, String caducidad, String envasado, int nroLote) {
        this.nombre = nombre;
        this.nroLote = nroLote;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaCadu = LocalDate.parse(caducidad, dtf);
        LocalDate fechaEnv = LocalDate.parse(envasado, dtf);
        this.fechaCaducidad = fechaCadu;
        this.fechaEnvasado = fechaEnv;
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

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
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
        return nombre 
                + "\nFecha de Envasado: " + fechaEnvasado 
                + "\nFecha de Vencimiento: " + fechaCaducidad
                + "\nNumero de Lote: " + nroLote;

    }

}
