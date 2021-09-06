/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Programar en Java el código del método buscarBicicleta en la clase Bicicleteria.
El mismo recibirá por parámetros una variable llamada nroDeSerie de tipo String
y retornará la bicicleta con dicho nroDeSerie. En caso de no encontrarlo deberá 
retornar null.

 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Adrian E. Camus
 */
public class Bicicleteria {

    private ArrayList<Bicicleta> bibicletas;
    private float ganancias;
    private Integer cantVentas;

    public Bicicleteria() {
        this.bibicletas = new ArrayList();
        this.cantVentas = 0;
        this.ganancias = 0;
    }

    public void venderBicicleta(Bicicleta bici) {
        this.bibicletas.remove(bici);
        this.cantVentas++;
        this.ganancias += bici.getPrecio();
    }

    public void addBicicleta(Bicicleta bici) {
        this.bibicletas.add(bici);
    }

    public Bicicleta buscarBicicleta(String nroDeSerie) {
        Bicicleta bici = new Bicicleta();
        boolean bandera = true;

        for (Bicicleta aux : bibicletas) {
            if (aux.getNroSerie().equalsIgnoreCase(nroDeSerie)) {
                bici = aux;
                bandera = true;
            } else {
                bandera = false;
            }
        }
        if (bandera) {
            return bici;
        } else {
            return null;
        }

    }

    public float inversionTotal() {
        float ret = 0;
        for (int i = 0; i < this.bibicletas.size(); i++) {
            ret += this.bibicletas.get(i).getPrecio();
        }
        return ret;
    }

    public ArrayList<Bicicleta> getBibicletas() {
        return bibicletas;
    }

    
}
