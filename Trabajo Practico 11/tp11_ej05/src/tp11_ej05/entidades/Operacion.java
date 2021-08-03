/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp11_ej05.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Operacion {
    private double numero1;
    private double numero2;
    private char operacion;
    private double resultado;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2, char operacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacion = operacion;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void mostrarResultado(){
        System.out.println(this.numero1+""+this.operacion+""+this.numero2+" = "+this.resultado);
    }
            
    
    
    
    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", operacion=" + operacion + ", resultado=" + resultado + '}';
    }
    
    

}
