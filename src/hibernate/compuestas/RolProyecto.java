/**
 * 
 */
package hibernate.compuestas;

/**
 * @author Jonatan
 *
 */
public class RolProyecto {

	// Nombre del Proyecto de Investigación, el Nombre, Primer Apellido, Segundo
	// Apellido y el Grado Académico
	private String nombreProyecto;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String gradoAcademico;

	/**
	 * 
	 */
	public RolProyecto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombreProyecto
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param gradoAcademico
	 */
	public RolProyecto(String nombreProyecto, String nombre, String primerApellido, String segundoApellido,
			String gradoAcademico) {
		super();
		this.nombreProyecto = nombreProyecto;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.gradoAcademico = gradoAcademico;
	}

	/**
	 * @return the nombreProyecto
	 */
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	/**
	 * @param nombreProyecto the nombreProyecto to set
	 */
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
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

	@Override
	public String toString() {
		return nombreProyecto + "," + nombre + "," + primerApellido + "," + segundoApellido + "," + gradoAcademico;
	}
}
