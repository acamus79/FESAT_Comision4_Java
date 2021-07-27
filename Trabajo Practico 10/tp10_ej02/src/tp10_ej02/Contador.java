package tp10_ej02;

/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

/**
 *
 * @author Adrian E. Camus
 */
/* 2 -Crea una clase Contador con los métodos para incrementar y 
  decrementar el contador. La clase contendrá un constructor por defecto,
  un constructor con parámetros, un constructor copia y los 
  métodos getters y setters.*/


public class Contador {
    public int valor;
    
    public Contador(){}
    
    public Contador(int v){
    valor = v;
    }
    
//Estos son los metodos    
    
public void incrementar(){
    valor = valor+1;
}
public void decrementar(){
    valor = valor-1;
}    

    public int getContador() {
        return valor;
    }

    public void setContador(int v) {
        this.valor = v;
    }
    
}
