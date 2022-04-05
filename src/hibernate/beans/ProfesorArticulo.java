/**
 * 
 */
package hibernate.beans;

/**
 * @author Jonatan
 *
 */
public class ProfesorArticulo {

	private int idProfesorArticuloInvestigacion;
	private int articuloInvestigacionIdArticuloInvestigacion;
	private String profesorNumeroEconomico;

	public ProfesorArticulo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idProfesorArticuloInvestigacion
	 * @param articuloInvestigacionIdArticuloInvestigacion
	 * @param profesorNumeroEconomico
	 */
	public ProfesorArticulo(int idProfesorArticuloInvestigacion, int articuloInvestigacionIdArticuloInvestigacion,
			String profesorNumeroEconomico) {
		super();
		this.idProfesorArticuloInvestigacion = idProfesorArticuloInvestigacion;
		this.articuloInvestigacionIdArticuloInvestigacion = articuloInvestigacionIdArticuloInvestigacion;
		this.profesorNumeroEconomico = profesorNumeroEconomico;
	}

	/**
	 * @return the idProfesorArticuloInvestigacion
	 */
	public int getIdProfesorArticuloInvestigacion() {
		return idProfesorArticuloInvestigacion;
	}

	/**
	 * @param idProfesorArticuloInvestigacion the idProfesorArticuloInvestigacion to
	 *                                        set
	 */
	public void setIdProfesorArticuloInvestigacion(int idProfesorArticuloInvestigacion) {
		this.idProfesorArticuloInvestigacion = idProfesorArticuloInvestigacion;
	}

	/**
	 * @return the articuloInvestigacionIdArticuloInvestigacion
	 */
	public int getArticuloInvestigacionIdArticuloInvestigacion() {
		return articuloInvestigacionIdArticuloInvestigacion;
	}

	/**
	 * @param articuloInvestigacionIdArticuloInvestigacion the
	 *                                                     articuloInvestigacionIdArticuloInvestigacion
	 *                                                     to set
	 */
	public void setArticuloInvestigacionIdArticuloInvestigacion(int articuloInvestigacionIdArticuloInvestigacion) {
		this.articuloInvestigacionIdArticuloInvestigacion = articuloInvestigacionIdArticuloInvestigacion;
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

	@Override
	public String toString() {
		return "ProfesorArticulo= " + idProfesorArticuloInvestigacion + ", "
				+ articuloInvestigacionIdArticuloInvestigacion + ", " + profesorNumeroEconomico;
	}
}
