/**
 * 
 */
package hibernate.beans;

import java.util.Date;

/**
 * @author Jonatan
 *
 */
public class ProyectoTerminal {

	private int idProyectoTerminal;
	private String titulo;
	private int cantitadAlumnos;
	private Date fechaInicio;
	private Date fechaFinalizacion;
	private int puntos;
	private String estado;
	private String proyectoInvestigacionIdProyectoInvestigacion;

	public ProyectoTerminal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idProyectoTerminal
	 * @param titulo
	 * @param cantitadAlumnos
	 * @param fechaInicio
	 * @param fechaFinalizacion
	 * @param puntos
	 * @param estado
	 * @param proyectoInvestigacionIdProyectoInvestigacion
	 */
	public ProyectoTerminal(int idProyectoTerminal, String titulo, int cantitadAlumnos, Date fechaInicio,
			Date fechaFinalizacion, int puntos, String estado, String proyectoInvestigacionIdProyectoInvestigacion) {
		super();
		this.idProyectoTerminal = idProyectoTerminal;
		this.titulo = titulo;
		this.cantitadAlumnos = cantitadAlumnos;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.puntos = puntos;
		this.estado = estado;
		this.proyectoInvestigacionIdProyectoInvestigacion = proyectoInvestigacionIdProyectoInvestigacion;
	}

	/**
	 * @return the idProyectoTerminal
	 */
	public int getIdProyectoTerminal() {
		return idProyectoTerminal;
	}

	/**
	 * @param idProyectoTerminal the idProyectoTerminal to set
	 */
	public void setIdProyectoTerminal(int idProyectoTerminal) {
		this.idProyectoTerminal = idProyectoTerminal;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the cantitadAlumnos
	 */
	public int getCantitadAlumnos() {
		return cantitadAlumnos;
	}

	/**
	 * @param cantitadAlumnos the cantitadAlumnos to set
	 */
	public void setCantitadAlumnos(int cantitadAlumnos) {
		this.cantitadAlumnos = cantitadAlumnos;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFinalizacion
	 */
	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	/**
	 * @param fechaFinalizacion the fechaFinalizacion to set
	 */
	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the proyectoInvestigacionIdProyectoInvestigacion
	 */
	public String getProyectoInvestigacionIdProyectoInvestigacion() {
		return proyectoInvestigacionIdProyectoInvestigacion;
	}

	/**
	 * @param proyectoInvestigacionIdProyectoInvestigacion the
	 *                                                     proyectoInvestigacionIdProyectoInvestigacion
	 *                                                     to set
	 */
	public void setProyectoInvestigacionIdProyectoInvestigacion(String proyectoInvestigacionIdProyectoInvestigacion) {
		this.proyectoInvestigacionIdProyectoInvestigacion = proyectoInvestigacionIdProyectoInvestigacion;
	}

	@Override
	public String toString() {
		return idProyectoTerminal + "," + titulo + "," + cantitadAlumnos + "," + fechaInicio + "," + fechaFinalizacion
				+ "," + puntos + "," + estado + "," + proyectoInvestigacionIdProyectoInvestigacion;
	}
}
