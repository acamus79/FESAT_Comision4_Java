/*
 * Sin licencia .
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package integrador_ej3;

//import java.time.*;
//import java.time.format.DateTimeFormatter;


/**
 *
 * @author Adrian E. Camus
 */
public class Agenda {
    
        private int dia;
	private int mes;
	private int anio;
	private int hora;
        private String odontologo;
	private int nroAgenda;
	private int turno;
	public Turno m_Turno;

	public Agenda(){
              
	}

	public void generarAgenda(int dia, int mes, int anio, String odontologo,int nroAgenda, int turno){

               this.dia = dia;
               this.mes = mes;
               this.anio = anio;
               this.odontologo = odontologo;
               this.nroAgenda = nroAgenda;
               this.turno = turno;
            
	}
        public String mostrarAgenda(){
            return ("dia "+dia+"/"+mes+ "/"+anio+ " Profesional "+odontologo+"    Agenda Nro "+nroAgenda+" Turno "+turno);
            
	}
        public void modificarAgenda(int dia, int mes, int anio, String odontologo,int nroAgenda, int turno){
            
               this.dia = dia;
               this.mes = mes;
               this.anio = anio;
               this.odontologo = odontologo;
               this.nroAgenda = nroAgenda;
               this.turno = turno;
	}
        
        
        
        
}//end Agenda

//LocalDate dia=LocalDate.now();
//LocalDate mes=LocalDate.now();
//LocalDate anio=LocalDate.now();



