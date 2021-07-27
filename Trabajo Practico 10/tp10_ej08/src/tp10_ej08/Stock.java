/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp10_ej08;

import java.util.ArrayList;

/**
 * 
 * @author Adrian E. Camus
 */
 @SuppressWarnings("unchecked")
public class Stock {

    public ArrayList<Bebida> stock = new ArrayList();
    
    public void agregarProducto(Bebida l){
        this.stock.add(l);
    }
    
    public void borrarProducto(Bebida l){
        this.stock.remove(l);
    }
        
    //Verificar si es tiene stock de bebida  
    public void verificaStock (){
        
        Bebida aux = new Bebida();
        
        for (int i=0; i<stock.size();i++){
    //asigno al objeto auxiliar la bebida de arrayList que concide con i
            aux = stock.get(i); 
    //verifico si tiene stock
            if (aux.getStock()== 0){
                System.out.println(aux.getTipo()+" "+aux.getMarca()+" ATENCION SIN STOCK");
            } else{
                System.out.println(aux.getTipo()+" "+aux.getMarca()+" Queda en Stock "+aux.getStock());
            }
            
        }
        
    }
    
    //Mostrar todo el Stock
    public void mostrarStock(){
        stock.stream().sorted();
    for (Bebida elemento : stock) {
            System.out.println("Bebida: \n"
                    +"Tipo  : "+elemento.getTipo()+"\n"
                    +"Marca : "+elemento.getMarca()+"\n"
                    +"Envase: "+elemento.getTamanio()+" cm3 \n"
                    +"Stock : "+elemento.getStock()+"\n"
                    +"Precio:$"+elemento.getPrecio()+"\n");
                       
        }
    }
    
    public void buscaStock(String n){
               
        for (int i=0; i< this.stock.size();i++){
            Bebida e = this.stock.get(i);
                if (n.equalsIgnoreCase(e.getTipo())){
                    System.out.println("Producto encontrado: "+e.toString());
                    
                }
        
        }
        
    }
    
}
