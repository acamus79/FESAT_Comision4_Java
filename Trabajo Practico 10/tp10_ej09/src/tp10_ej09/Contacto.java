/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp10_ej09;

import java.util.ArrayList;

/**
 *
 * @author Adrian E. Camus
 */
public class Contacto {
    public ArrayList<Persona> contactos = new ArrayList();
    
    
    //METODOS
    public void agregarContacto(Persona l){
        this.contactos.add(l);
    }
    
    public void borrarContacto(Persona l){
        this.contactos.remove(l);
    }
    
    public void buscaContacto(String n){
               
        for (int i=0; i< this.contactos.size();i++){
            Persona p = this.contactos.get(i);
                if (n.equalsIgnoreCase(p.getNombre())){
                    System.out.println("Contacto encontrado: "+p.toString());                      
                }
        
        }
        
    }
    
    public void mostrarContactos(){
        contactos.stream().sorted();
    for (Persona elemento : contactos) {
            System.out.println("Contacto Nro: "+elemento.getId()+"\n"+elemento.getNombre()+"\n"+elemento.getDomicilio()+"\n"+elemento.getEmail()+"\n"+elemento.getTelefono());
            System.out.println("");
        }
    }
    
//Getters and Setters    

    public ArrayList<Persona> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Persona> contactos) {
        this.contactos = contactos;
    }
  
}
