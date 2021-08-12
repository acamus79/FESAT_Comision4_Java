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
public class Triangulo extends Figura {

    private int ladoA, ladoB, ladoC;

    public Triangulo() {
        super.nombre = "TRIANGULO";
    }

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        super.nombre = "TRIANGULO";
    }

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public void calculoPerimetro() {
        super.perimetro = ladoA + ladoB + ladoC;
    }

    @Override
    public void calculoArea() {
        /* Formula de Heron obtiene el area de un triangulo solo con sus lados
    con la mitad del perimetro del triangulo (Semiperimetro) se saca la raiz
    cuadrada del semiperimetro multiplicado por el semiperimetro menos cada lado */
        double sPer = (ladoA + ladoB + ladoC) / 2;
        super.area = Math.sqrt(sPer * (sPer - ladoA) * (sPer - ladoB) * (sPer - ladoC));
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
