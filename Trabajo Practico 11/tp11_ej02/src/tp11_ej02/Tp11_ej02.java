/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Tenemos nuestra Clase Padre llamada:
∙ Animal
y las Clases Hijas llamadas:
∙ Perro
∙ Caballo
∙ Gato
Cada una de las clases hijas tiene diferente raza, pero comparten
las mismas propiedades de un Animal.
Nombre, tipoDeAlimentacion, Edad.
Codifica y agrega los métodos que veas necesarios para distinguir
a cada uno.


 */

package tp11_ej02;

import tp11_ej02.entidades.Caballo;
import tp11_ej02.entidades.Gato;
import tp11_ej02.entidades.Perro;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp11_ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui va todo el código
        
        
        Caballo c1 = new Caballo();
        c1.setFamilia("Equinos");
        c1.setNombre("Rosinante");
        c1.setTipoDeAlimentacion("pasto");
        c1.setEdad(5);
        Gato g1 = new Gato("Caninos","Asrael","alimento",3);
        Perro p1 = new Perro("Caninos","Duque","alimento",7);
        System.out.println(c1);
        System.out.println(g1);
        System.out.println(p1);
        
        
        
        
        
        
        
        
        
    }

}
