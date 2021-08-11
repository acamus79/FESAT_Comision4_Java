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
        StringBuilder sb = new StringBuilder();
        String esposa;
        if (super.isCasado()){
            esposa = "Si";
        }else{
            esposa = "No";
        }
        sb.append("Programador: ").append(super.getNombre()).append(" ").append(super.getApellido()).append("\n");
        sb.append("Cédula: ").append(super.getCedula()).append("\n");
        sb.append("Edad: ").append(super.getEdad()).append("\n");
        sb.append("Casado: ").append(esposa).append("\n");
        sb.append("Sueldo: $ ").append(super.getSalario()).append("\n");
        sb.append("Lenguaje Dominante: ").append(lenguajeDominante).append("\n");
        sb.append("Lineas de Codigo por hora: ").append(lineasDeCodigoPorHora).append("\n");
        sb.append("Clasificación: ").append(super.clasificacion()).append("\n");
                
        return sb.toString();
        
    }

    
    
       

}
