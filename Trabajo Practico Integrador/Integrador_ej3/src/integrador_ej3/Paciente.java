/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package integrador_ej3;

/**
 *
 * @author Adrian E. Camus
 */
public class Paciente {
      
        private String NombreApellido;
	private int dni;
	private int edad;
	private int telefono;
	private String domicilio;
	private String obraSocial;

	public Paciente(){

	}
        
	public void pedirTurno(String NombreApellido, int dni, int edad, int telefono){
            
            this.NombreApellido = NombreApellido;
            this.dni = dni;
            this.edad = edad;
            this.telefono = telefono;

	}

	public void cancelarTurno(){

	}

	public void pagarConsulta(){

	}
    
    
    
}
