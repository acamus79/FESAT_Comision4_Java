/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp10_ej1;

/**
 *
 * @author Adrian E. Camus
 */
public class Rectangulo {
    
    //Estos on los atributos
    public int base;
    public int altura;
    
    //Este es el contructor
    public Rectangulo(){}
    
    //Estos son los metodos
    public int area(){
        return base * altura;
    }
   
    public int perimetro(){
        int per;    
        per=(2*base)+(2*altura);
        return per;
    }
}

