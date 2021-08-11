/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

1) Empleado
Atributos:
- nombre: tipo cadena (Debe ser nombre y apellido)
- cedula: tipo cadena
- edad : entero (Rango entre 18 y 45 años)
- casado: boolean
- salario: tipo numérico doble
- Constructor con y sin parámetros de entrada

- Método que permita mostrar la clasificación según la edad
de acuerdo al siguiente algoritmo:
Si edad es menor o igual a 21, Principiante
Si edad es >=22 y <=35, Intermedio
Si edad es >35, Senior.-
- Un método que permita aumentar el salario en un porcentaje que
sería pasado como parámetro al método.

 */
package tp11_ej04.entidades;

/**
 *
 * @author Adrian E. Camus
 */
public class Empleado {

    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String clasificacion() {
        String clasificacion = new String();

        if (this.edad > 35) {
            clasificacion = "Senior";
        } else if (this.edad > 22) {
            clasificacion = "Intermedio";
        } else {
            clasificacion = "Principiante";
        }

        return clasificacion;
    }

    public void aumentoSalario(double porcentaje) {
        double nuevoSalario = (this.salario * porcentaje) / 100;
        this.salario = nuevoSalario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado: ").append(nombre).append(" ").append(apellido).append("\n");
        sb.append("Cédula: ").append(cedula).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Casado: ").append(casado).append("\n");
        sb.append("Sueldo: $ ").append(salario).append("\n");
        sb.append("Clasificación: ").append(clasificacion()).append("\n");
        return sb.toString();
    }

    
    
    
}
