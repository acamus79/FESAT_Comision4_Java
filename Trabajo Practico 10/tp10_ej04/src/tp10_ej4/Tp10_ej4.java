/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package tp10_ej4;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp10_ej4 {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    
    public static void main(String[] args) throws InterruptedException {
        boolean bandera = true;
           
        Tiempo reloj = new Tiempo(00,00,00);
        
        do{ 
            TimeUnit.SECONDS.sleep(1);
        if (reloj.segundo<60)
            reloj.incrementaSegundo();
        else
            if (reloj.minuto<60)
               reloj.incrementaMinuto();
            else
                if (reloj.hora<24) reloj.incrementaHora();
                else
                    if (reloj.hora == 24)
                        bandera = false;
        
        System.out.println("TIME: "+reloj.getHora()+":"+reloj.getMinuto()+":"+reloj.getSegundo());  
        
        }while (10!=reloj.minuto);
       
    }
    
}
