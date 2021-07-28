/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Los productos refrigerados deben llevar el código del organismo de supervisión
alimentaria, la fecha de envasado, la temperatura de mantenimiento 
recomendada y el país de origen.

 */
package tp11_ej03.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Refrigerado extends Congelado {

    private long codOSA;
       

    public Refrigerado() {
    }

    
    @Override
    public String toString() {
        return "Refrigerado\n"
                + super.toString()
                + "\nCodigo O.S.Alim: " + codOSA;
               
    }

}
