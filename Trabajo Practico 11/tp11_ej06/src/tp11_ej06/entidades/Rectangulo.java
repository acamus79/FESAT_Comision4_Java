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
public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo() {
        super.nombre = "Rectangulo";
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        super.nombre = "Rectangulo";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        super.perimetro = (2 * base) + (2 * altura);
    }

    @Override
    public void calculoArea() {
        super.area = base * altura;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
