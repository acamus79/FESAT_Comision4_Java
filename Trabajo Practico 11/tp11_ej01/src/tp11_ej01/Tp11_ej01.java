/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp11_ej01;

import tp11_ej01.entidades.Directivo;
import tp11_ej01.entidades.Empleado;
import tp11_ej01.entidades.Oficial;
import tp11_ej01.entidades.Operario;
import tp11_ej01.entidades.Tecnico;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp11_ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui va todo el código
        Empleado E1 = new Empleado("Rafa");
        Directivo D1 = new Directivo("Mario");
        Operario OP1 = new Operario("Alfonso");
        Oficial OF1 = new Oficial("Luis");
        Tecnico T1 = new Tecnico("Pablo");

        System.out.println(E1);
        System.out.println(D1);
        System.out.println(OP1);
        System.out.println(OF1);
        System.out.println(T1);

    }

}
