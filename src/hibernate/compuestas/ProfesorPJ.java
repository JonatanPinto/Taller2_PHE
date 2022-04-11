/**
 * 
 */
package hibernate.compuestas;

/**
 * @author Jonatan
 *
 */
public class ProfesorPJ {

	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String gradoAcademico;
	
	/**
	 * 
	 */
	public ProfesorPJ() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param name
	 * @param primerApellido
	 * @param segundoApellido
	 */
	public ProfesorPJ(String nombre, String primerApellido, String segundoApellido) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the name to set
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
		return nombre + "," + primerApellido + "," + segundoApellido + "," + gradoAcademico;
	}
}
