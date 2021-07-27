/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp10_ej08;

/**
 *
 * @author Adrian E. Camus
 */
public class Bebida {
public String tipo, marca;
public int stock;
public float precio,tamanio;

//Constructor

    public Bebida(){};

    public Bebida(String tipo, String marca, int stock, int tamanio, float precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.stock = stock;
        this.tamanio = tamanio;
        this.precio = precio;
    }

   //Metodos
    public void agregaStock(int add) {
        this.stock = stock + add;
    }
    
    public void restaStock(int add) {
        this.stock = stock - add;
    }
    
    //Sobreescribir el metodo toString
    @Override
    public String toString(){
        
        return "\n"
                + "Tipo    : "+this.tipo+" \n"
                + "Marca   : "+this.marca+"\n"
                + "Stock   : "+this.stock+"\n"
                + "Tamaño  : "+this.tamanio+" cm3\n"
                + "Precio $: "+this.precio+"\n";
    }
    
    
//Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getTamanio() {
        return tamanio;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
