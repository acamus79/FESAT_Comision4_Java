/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Se quiere crear una clase Cuenta la cual se caracteriza por tener
asociado un número de cuenta y un saldo disponible. Además, se
puede consultar el saldo disponible en cualquier momento, recibir
abonos y pagar recibos.

Crear además una clase Persona, que se caracteriza por un DNI y 
un array de cuentas bancarias. La Persona puede tener asociada 
hasta 3 cuentas bancarias, y debe tener un método que permite 
añadir cuentas (hasta 3 que es el máximo).
También debe contener un método que devuelva si la persona es
morosa, i.e., si tienen alguna cuenta con saldo negativo. 

Crear una clase PruebaCuentas que instancie un objeto Persona con un dni
cualquiera, así como dos objetos cuenta, una sin saldo inicial y otra
con 700 euros. La persona recibe la nómina mensual, por lo que
ingresa 1100 pesos en la primera cuenta, pero tiene que pagar el
alquiler de 750 euros con la segunda. Imprimir por pantalla el si la
persona es morosa. Posteriormente hacer una transferencia de una
cuenta a otra y comprobar mostrándolo por pantalla que cambia el
estado de la persona.

 */
package tp10_ej5;

import java.util.ArrayList;

/**
 *
 * @author Adrian E. Camus
 */
public class PruebaCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona cliente1 = new Persona();
        cliente1.setDni("27449881");
        cliente1.setNombre("Ramon");
                     
        Cuenta c1 = new Cuenta();
        c1.setNroCuenta("AA1125776");
        c1.setSaldo(700);
        cliente1.agregarCuenta(c1);
        Cuenta c2 = new Cuenta();
        c2.setNroCuenta("BB1125776");
        c2.setSaldo(0);
        cliente1.agregarCuenta(c2);
        Cuenta c3 = new Cuenta();
        c3.setNroCuenta("CC1125776");
        c3.setSaldo(0);
        cliente1.agregarCuenta(c3);
      
                              
        System.out.println("El cliente "+cliente1.getDni()+" Recibe el sueldo de 1100 euros");
        System.out.println("En la cuenta "+c2.getNroCuenta());
        c2.deposito(1100);
        System.out.println("SALDO TOTAL DE LA CUENTA "+c2.getSaldo());
        System.out.println("");
        System.out.println("Pagar Alquiler con cuenta "+c1.getNroCuenta());
        System.out.println("Monto alquiler a debitar 750 de un saldo de "+c1.getSaldo());
        
        
        
//        if (c1.getSaldo()<750){
//                System.out.println("Saldo insuficiente");
//            }else {
//                c1.pago(750);
//                System.out.println("Alquiler pagado");
//                System.out.println("SALDO "+c1.getSaldo());
//            }
        
        c1.pago(750);
        cliente1.verificaDeuda();




    }

        
        
    }
    

