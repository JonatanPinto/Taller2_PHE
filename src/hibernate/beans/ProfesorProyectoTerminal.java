/**
 * 
 */
package hibernate.beans;

/**
 * @author Jonatan
 *
 */
public class ProfesorProyectoTerminal {

	private int idProfesorProyectoTerminal;
	private String profesorNumeroEconomico;
	private int proyectoTerminalIdProyectoTerminal;

	public ProfesorProyectoTerminal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idProfesorProyectoTerminal
	 * @param profesorNumeroEconomico
	 * @param proyectoTerminalIdProyectoTerminal
	 */
	public ProfesorProyectoTerminal(int idProfesorProyectoTerminal, String profesorNumeroEconomico,
			int proyectoTerminalIdProyectoTerminal) {
		super();
		this.idProfesorProyectoTerminal = idProfesorProyectoTerminal;
		this.profesorNumeroEconomico = profesorNumeroEconomico;
		this.proyectoTerminalIdProyectoTerminal = proyectoTerminalIdProyectoTerminal;
	}

	/**
	 * @return the idProfesorProyectoTerminal
	 */
	public int getIdProfesorProyectoTerminal() {
		return idProfesorProyectoTerminal;
	}

	/**
	 * @param idProfesorProyectoTerminal the idProfesorProyectoTerminal to set
	 */
	public void setIdProfesorProyectoTerminal(int idProfesorProyectoTerminal) {
		this.idProfesorProyectoTerminal = idProfesorProyectoTerminal;
	}

	/**
	 * @return the profesorNumeroEconomico
	 */
	public String getProfesorNumeroEconomico() {
		return profesorNumeroEconomico;
	}

	/**
	 * @param profesorNumeroEconomico the profesorNumeroEconomico to set
	 */
	public void setProfesorNumeroEconomico(String profesorNumeroEconomico) {
		this.profesorNumeroEconomico = profesorNumeroEconomico;
	}

	/**
	 * @return the proyectoTerminalIdProyectoTerminal
	 */
	public int getProyectoTerminalIdProyectoTerminal() {
		return proyectoTerminalIdProyectoTerminal;
	}

	/**
	 * @param proyectoTerminalIdProyectoTerminal the
	 *                                           proyectoTerminalIdProyectoTerminal
	 *                                           to set
	 */
	public void setProyectoTerminalIdProyectoTerminal(int proyectoTerminalIdProyectoTerminal) {
		this.proyectoTerminalIdProyectoTerminal = proyectoTerminalIdProyectoTerminal;
	}

	@Override
	public String toString() {
		return "ProfesorProyectoTerminal= " + idProfesorProyectoTerminal + ", " + profesorNumeroEconomico + ", "
				+ proyectoTerminalIdProyectoTerminal;
	}
}
