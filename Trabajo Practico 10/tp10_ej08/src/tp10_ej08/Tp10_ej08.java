/*
 * Licencia Libre.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

    Desarrollar una aplicación que le permita a una tienda de bebidas, conocer 
    el estado referido al stock de sus productos.
    El comerciante tiene como necesidad saber qué valor tiene sus bebidas, 
    la cantidad de stock y obviamente su precio como también la cantidad de
    mililitros de las botellas. El programa debe poder consultar el stock, 
    debe poder descontar de acuerdo a las compras que se realicen por un 
    cliente. También si existe el caso de que el stock no es suficiente, 
    puede sugerir la opción de poder comprar otra bebida o bien 
    cerrar el pedido

 */

package tp10_ej08;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Tp10_ej08 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {
        // Aqui va todo el código
        int opcion;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Stock miChupi = new Stock();
                       
        Bebida c1 = new Bebida();
        c1.setTipo("Gaseosa");
        c1.setMarca("Coca Cola");
        c1.setStock(6);
        c1.setTamanio((float) 2.5);
        c1.setPrecio((float) 229.9);
        miChupi.agregarProducto(c1);
        
        Bebida c2 = new Bebida();
        c2.setTipo("Cerveza Negra");
        c2.setMarca("Stella Artois");
        c2.setStock(12);
        c2.setTamanio((float) 970.0);
        c2.setPrecio((float) 240.0);
        miChupi.agregarProducto(c2);
        
        Bebida c3 = new Bebida();
        c3.setTipo("Fernet");
        c3.setMarca("Branca");
        c3.setStock(3);
        c3.setTamanio((float) 750);
        c3.setPrecio((float) 580);
        miChupi.agregarProducto(c3);
        
		do { 
			System.out.println("\n");
                        System.out.println("*********************");
                        System.out.println("*** MiCHUPI STORE ***");
			System.out.println("*********************");
                        System.out.println("** 1 BUSCAR        **");
                        System.out.println("** 2 VENDER        **");
			System.out.println("** 3 STOCK         **");
			System.out.println("** 4 AGREGAR       **");
			System.out.println("** 5 para SALIR    **");
			System.out.println("*********************");
			System.out.println("Elija Opcion:");
                opcion = leer.nextInt();
                
		switch (opcion){
                    case 1:
                        System.out.println("Tipo de producto a buscar");
                        String c = new String();
                        c = leer.next();
                        miChupi.buscaStock(c);
                        break;
                    case 2:
                        break;
                    case 3:  miChupi.mostrarStock();
                        break;
                    case 4:
                        Bebida bc = new Bebida();
                        System.out.println("Ingresa el tipo de Bebida");
                        bc.setTipo(leer.nextLine());
                        System.out.println("Ingresa la marca de la Bebida");
                        bc.setMarca(leer.nextLine());
                        System.out.println("Ingresa el Stock");
                        bc.setStock(leer.nextInt());
                        System.out.println("Tamaño de la botella");
                        bc.setTamanio(leer.nextFloat());
                        System.out.println("Precio por botella");
                        bc.setPrecio(leer.nextFloat());
                        break;
                    case 5:
                       System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                       String confirma = leer.next();
                       
                       if ("s".equals(confirma.substring(0,1).toLowerCase())){
                           opcion = 0;
                           break;
                       }
                        
                    default:
                            System.out.println("Ingresaste una opción errónea");
                            System.out.println("Presione ENTER para continuar");
                            System.in.read();// a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
                
                }
    
		} while (opcion!=0);// Fin Menu por opcion 5
		leer.close();
                System.out.println("\n\n\n\n\n\n");
                System.out.println("\n\n\n\n\n\n");
                System.out.println("*** CHAU!!! ***");
        
        
        
        
        
        
                
        
        
        
       
        
        
        
    }
}