/**
 * 
 */
package hibernate.beans;

/**
 * @author Jonatan
 *
 */
public class Profesor {

	private String numeroEconomico;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String gradoAcademico;
	private String areaClaveArea;

	public Profesor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroEconomico
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param gradoAcademico
	 * @param areaClaveArea
	 */
	public Profesor(String numeroEconomico, String nombre, String primerApellido, String segundoApellido,
			String gradoAcademico, String areaClaveArea) {
		super();
		this.numeroEconomico = numeroEconomico;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.gradoAcademico = gradoAcademico;
		this.areaClaveArea = areaClaveArea;
	}

	/**
	 * @return the numeroEconomico
	 */
	public String getNumeroEconomico() {
		return numeroEconomico;
	}

	/**
	 * @param numeroEconomico the numeroEconomico to set
	 */
	public void setNumeroEconomico(String numeroEconomico) {
		this.numeroEconomico = numeroEconomico;
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
	 * @return the gradoAcademico
	 */
	public String getGradoAcademico() {
		return gradoAcademico;
	}

	/**
	 * @param gradoAcademico the gradoAcademico to set
	 */
	public void setGradoAcademico(String gradoAcademico) {
		this.gradoAcademico = gradoAcademico;
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
		return "Profesor= " + numeroEconomico + ", " + nombre + ", " + primerApellido + ", " + segundoApellido + ", "
				+ gradoAcademico + ", " + areaClaveArea;
	}
}
