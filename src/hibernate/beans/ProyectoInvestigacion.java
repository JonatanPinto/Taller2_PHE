/**
 * 
 */
package hibernate.beans;

/**
 * @author Jonatan
 *
 */
public class ProyectoInvestigacion {

	private String idProyectoInvestigacion;
	private String nombre;
	private String areaClaveArea;

	public ProyectoInvestigacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idProyectoInvestigacion
	 * @param nombre
	 * @param areaClaveArea
	 */
	public ProyectoInvestigacion(String idProyectoInvestigacion, String nombre, String areaClaveArea) {
		super();
		this.idProyectoInvestigacion = idProyectoInvestigacion;
		this.nombre = nombre;
		this.areaClaveArea = areaClaveArea;
	}

	/**
	 * @return the idProyectoInvestigacion
	 */
	public String getIdProyectoInvestigacion() {
		return idProyectoInvestigacion;
	}

	/**
	 * @param idProyectoInvestigacion the idProyectoInvestigacion to set
	 */
	public void setIdProyectoInvestigacion(String idProyectoInvestigacion) {
		this.idProyectoInvestigacion = idProyectoInvestigacion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the areaClaveArea
	 */
	public String getAreaClaveArea() {
		return areaClaveArea;
	}

	/**
	 * @param areaClaveArea the areaClaveArea to set
	 */
	public void setAreaClaveArea(String areaClaveArea) {
		this.areaClaveArea = areaClaveArea;
	}

	@Override
	public String toString() {
		return idProyectoInvestigacion + "," + nombre + "," + areaClaveArea;
	}
}
