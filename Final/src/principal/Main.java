/*
 *
 *
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package principal;

import servicios.ServiciosBicicleteria;
import entidades.*;


/**
 *
 * @author Adrian E. Camus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        ServiciosBicicleteria sb = new ServiciosBicicleteria();
        
        Bicicleteria bicis = new Bicicleteria();
        
        bicis.getBibicletas().add(new Bicicleta("S25447","Aero",2019,28000f));
        bicis.getBibicletas().add(new Bicicleta("A25477","Aero",2015,28000f));
        bicis.getBibicletas().add(new Bicicleta("Z25647","Aero",2021,30000f));
        bicis.getBibicletas().add(new Bicicleta("R25555","Aero",2018,28000f));
        bicis.getBibicletas().add(new Bicicleta("R11457","Aero",2018,28000f));
        bicis.getBibicletas().add(new Bicicleta("AJ20204","Sport",2021,34000f));
        bicis.getBibicletas().add(new Bicicleta("AJ15471","Sport",2021,34000f));
        bicis.getBibicletas().add(new Bicicleta("AJ17879","Sport",2021,34000f));
        bicis.getBibicletas().add(new Bicicleta("AJ13247","Sport",2021,34000f));
        
        sb.menu(bicis);
        
                
    }
    
}
