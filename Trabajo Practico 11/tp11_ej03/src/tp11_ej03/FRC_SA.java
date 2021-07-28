/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Se plantea desarrollar un programa Java que permita la gestión de una 
empresa de agroalimentos la cual trabaja con tres tipos de productos: 

productos frescos, productos refrigerados y productos congelados.

Todos los productos llevan información en común: fecha de caducidad y número 
de lote. A su vez, cada tipo de producto lleva alguna información específica.

Los productos frescos deben llevar la fecha de envasado y el país de origen.

Los productos refrigerados deben llevar el código del organismo de supervisión
alimentaria, la fecha de envasado, la temperatura de mantenimiento 
recomendada y el país de origen.

Los productos congelados deben llevar la fecha de envasado, el
país de origen y la temperatura de mantenimiento recomendada.

Crear el código de las clases Java implementando una relación de herencia 
siguiendo estas indicaciones:
a) En primer lugar realizar un esquema con lápiz y papel donde se
represente cómo se van a organizar las clases cuando escribamos
el código. Estudiar los atributos de las clases y trasladar a la
superclase todo atributo que pueda ser trasladado.
Crear una clase con el método main donde se creen: dos productos
frescos, tres productos refrigerados y cinco productos congelados .
Mostrar la información de cada producto por pantalla.


 */

package tp11_ej03;

import tp11_ej03.entidades.Congelado;
import tp11_ej03.entidades.Fresco;
import tp11_ej03.entidades.Refrigerado;
import tp11_ej03.servicios.ServicioFRC;

/**
 *
 * @author Adrian E. Camus
 */
public class FRC_SA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui va todo el código
        
       ServicioFRC sp = new ServicioFRC();
        Fresco f1 = sp.crearFresco();
        System.out.println(f1);
        //Fresco f2 = sp.crearFresco();
        //String paisOrigen, String nombre, String caducidad, String envasado, long nroLote
        Fresco f2 = new Fresco("Argentina","Papa","21/08/2021","10/07/2021",054476);
        System.out.println(f2);
        Refrigerado r1 = sp.crearRefrigerado();
        System.out.println(r1);
//        Refrigerado r2 = sp.crearRefrigerado();
//        Refrigerado r3 = sp.crearRefrigerado();
        Congelado c1 = sp.crearCongelado();
        System.out.println(c1);
//        Congelado c2 = sp.crearCongelado();
//        Congelado c3 = sp.crearCongelado();
//        Congelado c4 = sp.crearCongelado();
//        Congelado c5 = sp.crearCongelado();
        
    }

}
