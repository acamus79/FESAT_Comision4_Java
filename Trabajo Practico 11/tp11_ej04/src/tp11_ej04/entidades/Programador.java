/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Programador (Especialización de Empleado). Clase que hereda
de Empleado todos los atributos y métodos.

Atributos:
- lineasDeCodigoPorHora : tipo entero
- lenguajeDominante: tipo cadena

Métodos:
- Constructor con y sin parámetros de entrada.

 */

package tp11_ej04.entidades;

/**
 * 
 * @author Adrian E. Camus
 */
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        super(nombre, apellido, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return "Programador :" + "lineas de Codigo por Hora " + lineasDeCodigoPorHora + ", lenguaje Dominante: "+ lenguajeDominante;
    }
    
       

}
