/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */

package tp10_ej09;

/**
 * 
 * @author Adrian E. Camus
 */
public class Persona {
    public int telefono,id=1;
    public String nombre,domicilio,email;

    
//Geeters & Setters    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id= i;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
 //Sobreescribir el metodo toString
    @Override
    public String toString(){
        
        return "\n"
                + "Nombre : "+this.nombre+" \n"
                + "Domicilio : "+this.domicilio+"\n"
                + "Telefono : "+this.telefono+"\n"
                + "E-mail : "+this.email+"\n";
    }

    
}
