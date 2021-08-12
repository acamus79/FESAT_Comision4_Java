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

    public Circulo() {
        super.nombre = "Circulo";
    }

    public Circulo(double radio) {
        this.radio = radio;
        super.nombre = "Circulo";
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

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

    @Override
    public String toString() {
        return super.toString();
    }

    
}
