/**
 * 
 */
package hibernate.operaciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.beans.Profesor;
import hibernate.compuestas.ProfesorArea;
import hibernate.compuestas.ProfesorPJ;
import hibernate.compuestas.RolProyecto;
import hibernate.conexion.CrearConexion;

/**
 * @author Jonatan
 *
 */
public class Selecciones {

	private final static Logger log = Logger.getLogger(Selecciones.class);

	/**
	 * 
	 * @param clave
	 * @return
	 */
	public Profesor consultarProfesor(String clave) {
		PropertyConfigurator.configure("logger.properties");
		Profesor profesor;
		Session sesion = null;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (ExceptionInInitializerError ex) {
			System.err.println("No se pudo crear la sesion ");
			throw new ExceptionInInitializerError(ex);
		}
		log.info("CONSULTANDO PROFESOR CON PK " + clave);
		profesor = sesion.get(Profesor.class, clave);
		return profesor;
	}

	/**
	 * Primera consulta
	 */
	@SuppressWarnings("unchecked")
	public List<Profesor> consultarProfesores() {
		PropertyConfigurator.configure("logger.properties");
		List<Profesor> profesores;
		Session sesion = null;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (ExceptionInInitializerError ex) {
			System.err.println("No se pudo crear la sesion ");
			throw new ExceptionInInitializerError(ex);
		}
		log.info("SELECCIONANDO LAS LICENCIATURAS");
		/* El nombre de la clase de la cuál se llenará la lista List */
		String sentencia = "FROM hibernate.beans.Profesor";
		profesores = sesion.createQuery(sentencia).list();
		return profesores;
	}
	
	/**
	 * Segunda consulta
	 */
	@SuppressWarnings("unchecked")
	public List<ProfesorArea> consultarProfesorArea() {
		List<Object[]> tempList;
		List<ProfesorArea> listaProfesorArea = new LinkedList<ProfesorArea>();
		Session sesion = null;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (ExceptionInInitializerError ex) {
			System.err.println("No se pudo crear la sesion ");
			throw new ExceptionInInitializerError(ex);
		}
		String sentencia = "SELECT PR.nombre, PR.primerApellido, "
				+ "PR.segundoApellido, AR.nombre FROM Profesor as PR, Area"
				+ " as AR WHERE AR.claveArea = PR.areaClaveArea";
		@SuppressWarnings("deprecation")
		Query query = sesion.createQuery(sentencia);
		tempList = query.list(); 
		for (int i = 0; i < tempList.size(); i++) {
			Object[] datosRecuperados = tempList.get(i);
			ProfesorArea profesorArea = new ProfesorArea();
			profesorArea.setPrimerNombre((String) datosRecuperados[0]);
			profesorArea.setPrimerApellido((String) datosRecuperados[1]);
			profesorArea.setSegundoApellido((String) datosRecuperados[2]);
			profesorArea.setNombreArea((String) datosRecuperados[3]);
			listaProfesorArea.add(profesorArea);
		}
		return listaProfesorArea;
	}
	
	/**
	 * Tercera Consulta
	 * @param idProyecto
	 * @return
	 */
	public List<ProfesorPJ> consultarProfesorDeProyecto(int idProyecto) {
		PropertyConfigurator.configure("logger.properties");
		List<ProfesorPJ> listaProfesoresPJ = new ArrayList<ProfesorPJ>();
		Session sesion = null;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (ExceptionInInitializerError ex) {
			System.err.println("No se pudo crear la sesion ");
			throw new ExceptionInInitializerError(ex);
		}
		log.info("SELECCIONANDO LOS PROFESORES DEL PROYECTO: " + idProyecto);
		String sentencia = "SELECT PR.nombre, PR.primerApellido, PR.segundoApellido, PR.gradoAcademico "
				+ "FROM ProfesorProyectoInvestigacion PJ , Profesor PR WHERE PJ.profesorNumeroEconomico = PR.numeroEconomico "
				+ "AND PJ.idProfesorProyectoInvestigacion = " + idProyecto
				+ "ORDER BY PR.primerApellido";
		Query query = sesion.createQuery(sentencia);
		// query.setParameter("clave", licenciatura);
		List<Object[]> tempList;
		tempList = query.list(); 
		for (int i = 0; i < tempList.size(); i++) {
			Object[] datosRecuperados = tempList.get(i);
			ProfesorPJ profesorProyecto = new ProfesorPJ();
			profesorProyecto.setNombre((String) datosRecuperados[0]);
			profesorProyecto.setPrimerApellido((String) datosRecuperados[1]);
			profesorProyecto.setSegundoApellido((String) datosRecuperados[2]);
			profesorProyecto.setGradoAcademico((String) datosRecuperados[3]);
			listaProfesoresPJ.add(profesorProyecto);
		}
		return listaProfesoresPJ;
	}
	
	//Nombre del Proyecto de Investigación, el Nombre, Primer Apellido, Segundo Apellido y el Grado Académico
	/**
	 * Cuarta Consulta
	 * @param rol
	 * @return
	 */
	public List<RolProyecto> consultarRolesEnProyectos(String rol) {
		PropertyConfigurator.configure("logger.properties");
		List<RolProyecto> listaProfesores = new ArrayList<RolProyecto>();
		Session sesion = null;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (ExceptionInInitializerError ex) {
			System.err.println("No se pudo crear la sesion ");
			throw new ExceptionInInitializerError(ex);
		}
		log.info("SELECCIONANDO LOS PROFESORES QUE CUMPLEN EL ROL DE : " + rol);
		String sentencia = "SELECT PJ.nombre, PR.nombre, PR.primerApellido, PR.segundoApellido, PR.gradoAcademico "
				+ "FROM ProfesorProyectoInvestigacion PI , Profesor PR, ProyectoInvestigacion PJ "
				+ "WHERE PI.profesorNumeroEconomico = PR.numeroEconomico AND PI.proyectoInvestigacionIdProyectoInvestigacion = PJ.idProyectoInvestigacion "
				+ "AND PI.rol = '" + rol
				+ "' ORDER BY PR.primerApellido";
		Query query = sesion.createQuery(sentencia);
		// query.setParameter("clave", licenciatura);
		List<Object[]> tempList;
		tempList = query.list(); 
		for (int i = 0; i < tempList.size(); i++) {
			Object[] datosRecuperados = tempList.get(i);
			RolProyecto rolProfesor = new RolProyecto();
			rolProfesor.setNombreProyecto((String) datosRecuperados[0]);
			rolProfesor.setNombre((String) datosRecuperados[1]);
			rolProfesor.setPrimerApellido((String) datosRecuperados[2]);
			rolProfesor.setSegundoApellido((String) datosRecuperados[3]);
			rolProfesor.setGradoAcademico((String) datosRecuperados[4]);
			listaProfesores.add(rolProfesor);
		}
		return listaProfesores;
	}
}