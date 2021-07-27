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
public class Odontologo {
        private String nombreApellido;
	private int matricula;
	private String especialidad;
	private double valorConsulta;
	private boolean confAgenda;
        public Paciente m_Paciente;
	public Consultorio m_Consultorio;

	public Odontologo(){

	}

 
    public void valorConsulta(String especialidad, double valorConsulta){
            this.especialidad = especialidad;
            this.valorConsulta = valorConsulta;

	}
        
        public String mostrarConsulta(){
            return ("Especialidad " +especialidad+" Precio de la Consulta $ "+valorConsulta);
        }

	public void declararDiasHoras(){

	}
        public void confirmarAgenda(boolean confAgenda){
            this.confAgenda = confAgenda;

	}
}//end Odontologo