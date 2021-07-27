/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */ 

 /*Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda 
   ser construida indicando los tres atributos, sólo la hora y minuto o sólo 
   la hora. Debe poder aumentar/restar sus valores de acuerdo a cambios en 
   la hr, minutos o segundos. */

package tp10_ej4;

/**
 *
 * @author Adrian E. Camus
 */
public class Tiempo {
   
    public int hora;
    public int minuto;
    public int segundo;

//CONSTRUCTORES    

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tiempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
//  METODOS        
    public void incrementaHora() {
        hora = hora+1;
    }
    
    public void incrementaMinuto() {
        minuto = minuto+1;
    }
    
    public void incrementaSegundo(){
        segundo = segundo+1;
    }
    
    
//    GETTERS y SETTERS

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
}
