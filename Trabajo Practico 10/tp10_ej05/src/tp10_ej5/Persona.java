/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp10_ej5;

import java.util.ArrayList;

/**
 *
 * @author Adrian E. Camus
 */


public class Persona {

    public String nombre;
    public String dni;

// una lista (array list) de clases cuentas
    public ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

//metodo para agregar cuentas al arraylist
    public void agregarCuenta(Cuenta c) {

        if (cuentas.size() < 3) {
            cuentas.add(c);
        }else{
            System.out.println("La persona no puede tener mas cuentas");
        }

    }

//Verificar si es tiene saldo en rojo    
    public void verificaDeuda (){
        
        Cuenta aux = new Cuenta();
        for (int i=0; i<cuentas.size();i++){
    //asigno al objeto auxiliar la cuenta de arrayList que concide con i
            aux = cuentas.get(i); 
    //verifico si tiene saldo
            if (aux.getSaldo() < 0){
                System.out.println(aux.getNroCuenta()+" ATENCION la cuenta tiene descubierto");
            } else{
                System.out.println(aux.getNroCuenta()+" Sin deuda, tiene un saldo de $ "+aux.getSaldo());
            }
            
        }
        
    }
    
//getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
