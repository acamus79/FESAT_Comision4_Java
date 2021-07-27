/*
 Crear una clase Auto, a través de la cual se pueda conocer el color del auto,
 la marca, el modelo, el número de patente, el número de puertas y la matrícula.
 Crear el constructor del coche, así como los métodos que considere necesarios.
 */
package tp10_ej3;

/**
 *
 * @author Adrian E. Camus <your.name at your.org>
 */
public class Auto {
    public String marca;
    public String color;
    public String modelo;
    public String patente;
    public int puertas;
    
    
    public Auto() {}

 
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
       
        
}
