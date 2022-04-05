/**
 * 
 */
package hibernate.beans;

import java.util.Date;

/**
 * @author Jonatan
 *
 */
public class Articulo {

	private int idArticuloInvestigacion;
	private String titulo;
	private Date fechaPublicacion;
	private int puntos;
	private String estado;
	private String proyectoInvestigacionIdProyectoInvestigacion;
	private String revista_isbn;

	public Articulo() {
		// TODO Auto-generated constructor stub
	}

	public Articulo(int idArticuloInvestigacion, String titulo, Date fechaPublicacion, int puntos, String estado,
			String proyectoInvestigacionIdProyectoInvestigacion, String revista_isbn) {
		super();
		this.idArticuloInvestigacion = idArticuloInvestigacion;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
		this.puntos = puntos;
		this.estado = estado;
		this.proyectoInvestigacionIdProyectoInvestigacion = proyectoInvestigacionIdProyectoInvestigacion;
		this.revista_isbn = revista_isbn;
	}

	/**
	 * @return the idArticuloInvestigacion
	 */
	public int getIdArticuloInvestigacion() {
		return idArticuloInvestigacion;
	}

	/**
	 * @param idArticuloInvestigacion the idArticuloInvestigacion to set
	 */
	public void setIdArticuloInvestigacion(int idArticuloInvestigacion) {
		this.idArticuloInvestigacion = idArticuloInvestigacion;
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
	 * @return the fecha_publicacion
	 */
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	/**
	 * @param fecha_publicacion the fecha_publicacion to set
	 */
	public void setFechaPublicacion(Date fecha_publicacion) {
		this.fechaPublicacion = fecha_publicacion;
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

	/**
	 * @return the revista_isbn
	 */
	public String getRevista_isbn() {
		return revista_isbn;
	}

	/**
	 * @param revista_isbn the revista_isbn to set
	 */
	public void setRevista_isbn(String revista_isbn) {
		this.revista_isbn = revista_isbn;
	}

	@Override
	public String toString() {
		return "Articulo= " + idArticuloInvestigacion + ", " + titulo + ", " + fechaPublicacion + ", " + puntos + ", "
				+ estado + ", " + proyectoInvestigacionIdProyectoInvestigacion + ", " + revista_isbn;
	}
}
