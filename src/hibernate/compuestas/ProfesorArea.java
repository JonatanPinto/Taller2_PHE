/**
 * 
 */
package hibernate.compuestas;

/**
 * @author Jonatan
 *
 */
public class ProfesorArea {

	private String primerNombre;
	private String primerApellido;
	private String segundoApellido;
	private String nombreArea;
	
	/**
	 * 
	 */
	public ProfesorArea() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param primerNombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param nombreArea
	 */
	public ProfesorArea(String primerNombre, String primerApellido, String segundoApellido, String nombreArea) {
		super();
		this.primerNombre = primerNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.nombreArea = nombreArea;
	}

	/**
	 * @return the primerNombre
	 */
	public String getPrimerNombre() {
		return primerNombre;
	}

	/**
	 * @param primerNombre the primerNombre to set
	 */
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the nombreArea
	 */
	public String getNombreArea() {
		return nombreArea;
	}

	/**
	 * @param nombreArea the nombreArea to set
	 */
	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	@Override
	public String toString() {
		return primerNombre + "," + primerApellido + "," + segundoApellido + "," + nombreArea;
	}
	
	
}
