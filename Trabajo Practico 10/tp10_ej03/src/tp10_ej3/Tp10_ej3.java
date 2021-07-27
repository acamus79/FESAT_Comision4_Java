/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 Crear una clase Auto, a través de la cual se pueda conocer el color del auto,
 la marca, el modelo, el número de patente, el número de puertas y la matrícula.
 Crear el constructor del coche, así como los métodos que considere necesarios.
 */
package tp10_ej3;

import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp10_ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo un objeto 'teclado' de la clase Scanner importada de java.util
        
        Scanner teclado = new Scanner(System.in);
        
// Creo un Objeto 'a' de la clase Auto con su contructor
        Auto a = new Auto();
        
//Pido algunos atributos del objeto 'a' mediante teclado y los guardo en variables
        //System.out.println("Ingrese marca y modelo");
        //String ma = teclado.next();
        //String mo = teclado.next();
////Utilizo los metodos set con el valor ingresado por teclado        
//        a.setMarca(ma);
//        a.setModelo(mo);
//
//                System.out.println(a.getMarca());
//                System.out.println(a.getModelo());        
        
        
//Pido los atributos del objeto 'a' mediante teclado y los guardo en variables        
        System.out.println("Ingrese marca");
        a.setMarca(teclado.next());
        System.out.println("Ingrese modelo");
        a.setModelo(teclado.next());
        System.out.println("Ingrese Patente");
        a.setPatente(teclado.next());
        System.out.println("Ingrese Color");
        a.setColor(teclado.next());
        System.out.println("Ingrese cant. de Puertas");
        a.setPuertas(teclado.nextInt());
            
//Cierro el objeto 'teclado' porque ya no lo utilizo mas        
        teclado.close();

//Muestro los atributos del objeto auto creado con los metodos get
        System.out.println("<<<< AUTOMOVIL >>>>");
        System.out.println("Marca: "+a.getMarca());
        System.out.println("Modelo: "+a.getModelo());
        System.out.println("Dominio: "+a.getPatente());
        System.out.println("Color: "+a.getColor());
        System.out.println("Cant. Puertas: "+a.getPuertas());
        

        
        
        
        
    }
    
}
