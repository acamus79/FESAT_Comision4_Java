/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Crear una clase Rectángulo, con atributos base y altura. Crear también 
    el constructor de la clase y los métodos necesarios para calcular el  
    área y el perímetro. Crear otra clase que pruebe varios rectángulos y 
    muestre por pantalla sus áreas y perímetros.

 */
package tp10_ej1;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp10_ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*   
 * POO con JAVA
 * 1 -Crear una clase Rectángulo, con atributos base y altura. 
 * Crear también el constructor de la clase y los métodos necesarios para 
 * calcular el  área y el perímetro. Crear otra clase que pruebe varios 
 * rectángulos y muestre por pantalla sus áreas y perímetros.
 */
        
        
//Creo un objeto 'teclado' de la clase Scanner importada de java.util
        Scanner teclado = new Scanner(System.in);
        
// Creo un Objeto 'r' de la clase Rectangulo con su contructor
        Rectangulo r = new Rectangulo();
        
//Pido los atributos del objeto 'r' mediante teclado
        System.out.println("Ingrese la Base del rectangulo");
                r.base= teclado.nextInt();
        System.out.println("Ingrese la Altura del rectangulo");
                r.altura=teclado.nextInt();

//Cierro el objeto 'teclado' porque ya no lo utilizo mas        
        teclado.close();

// Defino dos variables de tipo entero y les asignos lo que retornan los
// metodos de la clase Rectangulo
                int area = r.area();
                int perimetro = r.perimetro();
        System.out.println("El area del Rectangulo es "+area);
        System.out.println("El perimetro del Rectangulo es "+perimetro);
                
                
    }
    
}
