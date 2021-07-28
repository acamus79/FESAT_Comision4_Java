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

    private String codOSA;

    public Refrigerado() {
    }

    public Refrigerado(String codOSA,int tempMante,String paisOrigen,String nombre, String caducidad, String envasado, int nroLote) {
        super(tempMante,paisOrigen,nombre,caducidad,envasado,nroLote);
        this.codOSA = codOSA;
    }

    public String getCodOSA() {
        return codOSA;
    }

    public void setCodOSA(String codOSA) {
        this.codOSA = codOSA;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCodigo O.S.Alim: " + codOSA;
    }

}
