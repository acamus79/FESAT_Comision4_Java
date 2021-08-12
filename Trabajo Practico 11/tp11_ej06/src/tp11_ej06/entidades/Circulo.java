/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp11_ej06.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Circulo extends Figura {

    private double radio;

    @Override
    public void calculoPerimetro() {
        super.perimetro = (2 * Math.PI) * radio;
        System.out.println("El Perimetro del circulo es: " + super.perimetro + "\n");
    }

    @Override
    public void calculoArea() {
        super.area = Math.PI * (radio * radio);
        System.out.println("El Area del circulo es: " + super.area + "\n");
    }

}
