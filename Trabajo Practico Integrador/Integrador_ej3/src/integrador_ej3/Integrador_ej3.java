/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package integrador_ej3;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class Integrador_ej3 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

//genero 3 objetos Agenda      
Agenda Agenda1 = new Agenda ();
Agenda Agenda2 = new Agenda ();
Agenda Agenda3 = new Agenda ();

//Le doy valores a los objetos Agenda con el metodo generarAgenda y los parametros que lleva el metodo
Agenda1.generarAgenda(25, 5, 21, "Pedro Pinchaso", 1, 2);
Agenda2.generarAgenda(26, 5, 21, "Carlos Torneti", 1, 5);
Agenda3.generarAgenda(27, 5, 21, "Jose Sacamuela", 1, 1);

//Creo un Vector "recorre" de tipo Agenda con 3 elementos
Agenda[] recorre = new Agenda[3];

//Asigno los elementos del vector con los objetos Agenda 1,2,3
recorre[0]=Agenda1;
recorre[1]=Agenda2;
recorre[2]=Agenda3;

//genero 3 objetos odontologo
Odontologo odon1 = new Odontologo ();
Odontologo odon2 = new Odontologo ();
Odontologo odon3 = new Odontologo ();
//Le doy valores a los objetos Odontologo con el metodo valorConsulta y los parametros que lleva el metodo
odon1.valorConsulta("Odontopediatra", 1800);
odon2.valorConsulta("Endodoncista  ", 2000);
odon3.valorConsulta("Ortodoncista  ", 2500);
//Creo un Vector "vecOdon" de tipo Odontologo con 3 elementos
Odontologo[] vecOdon = new Odontologo[3];
//Asigno los elementos del vector con los objetos Agenda 1,2,3
vecOdon[0]=odon1;
vecOdon[1]=odon2;
vecOdon[2]=odon3;

// Menu
      Scanner teclado = new Scanner(System.in);
      int opcion;
		do {
			System.out.println("\n\n\n\n\n");
                        System.out.println("*** CONSULTORIO ODONTOLOGICO ***");
			System.out.println("** 1 Generar Agenda Mensual   **");
			System.out.println("** 2 Gestion de Odontologos   **");
			System.out.println("** 3 Asignar Turnos           **");
			System.out.println("** 0 para SALIR               **");
			System.out.println("********************************");
			System.out.println("Ingrese una opción del 0 al 3");
                opcion = teclado.nextInt();
                if (opcion==1) {
				
				System.out.println("\n\n\n\n\n\n");
                                //Utilizo un for each con una variable "j", instanciando el vector "recorre"
                                for(Agenda j: recorre){
                                    //Muestro la variable "j" del for each con el metodo .mostrarAgenda 
                                    System.out.println(j.mostrarAgenda());
                                    
                                    //Otra forma
                                    //System.out.println(Agenda1.mostrarAgenda());
                                    //System.out.println(Agenda2.mostrarAgenda());
                                    //System.out.println(Agenda3.mostrarAgenda());
                }
				System.out.println("Presione la tecla ENTER para continuar");
				System.in.read(); 
                                } else {
				if (opcion==2) {
					
					System.out.println("\n\n\n\n\n\n");
                                        for(Odontologo i:vecOdon){
                                            System.out.println(i.mostrarConsulta());
                                        }
					System.out.println("Presione la tecla ENTER para continuar");
					System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
				} else {
					if (opcion==3) {
						
						System.out.println("\n\n\n\n\n\n");
                                                
						System.out.println("Presione la tecla ENTER para continuar");
						System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
					}
				}
			}
			// Fin Menu por opcion 0
		} while (opcion!=0);
		teclado.close();
                System.out.println("\n\n\n\n\n\n");
                System.out.println("\n\n\n\n\n\n");
                System.out.println("*** CHAU!!! ***");
    }
}
    
