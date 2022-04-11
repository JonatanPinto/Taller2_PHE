/**
 * 
 */
package hibernate.operaciones;

import javax.persistence.PersistenceException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;

import hibernate.beans.*;
import hibernate.conexion.CrearConexion;

/**
 * Clase que se encarga de realizar las inserciones en la base de datos
 *
 */
public class Inserciones {

	private final static Logger log = Logger.getLogger(Inserciones.class);

	/**
	 * 
	 * @param area
	 * @return Retorna un valor booleano dependiendo si se pudo llevar a cabo la insercion
	 */
	public boolean insertarArea(Area area) {
		PropertyConfigurator.configure("logger.properties");
		Session sesion = null;
		boolean resultado = false;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (Throwable ex) {
			System.err.println("No se pudo crear la sesion " + ex);
			throw new ExceptionInInitializerError(ex);
		}
		try {
			log.info("INSERTANDO AREA");
			sesion.beginTransaction();
			sesion.save(area);
			sesion.getTransaction().commit();
			resultado = true;
		} catch (PersistenceException e) {
			log.error("ERROR AL INSERTAR AREA");
		} finally {
			sesion.close();
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param articulo
	 * @return Retorna un valor booleano dependiendo si se pudo llevar a cabo la insercion
	 */
	public boolean insertarArticulo(Articulo articulo) {
		PropertyConfigurator.configure("logger.properties");
		Session sesion = null;
		boolean resultado = false;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (Throwable ex) {
			System.err.println("No se pudo crear la sesion " + ex);
			throw new ExceptionInInitializerError(ex);
		}
		try {
			log.info("INSERTANDO ARTICULO");
			sesion.beginTransaction();
			sesion.save(articulo);
			sesion.getTransaction().commit();
			resultado = true;
		} catch (PersistenceException e) {
			log.error("ERROR AL INSERTAR ARTICULO");
		} finally {
			sesion.close();
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param profesor
	 * @return Retorna un valor booleano dependiendo si se pudo llevar a cabo la insercion
	 */
	public boolean insertarProfesor(Profesor profesor) {
		PropertyConfigurator.configure("logger.properties");
		Session sesion = null;
		boolean resultado = false;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (Throwable ex) {
			System.err.println("No se pudo crear la sesion " + ex);
			throw new ExceptionInInitializerError(ex);
		}
		try {
			log.info("INSERTANDO PROFESOR");
			sesion.beginTransaction();
			sesion.save(profesor);
			sesion.getTransaction().commit();
			resultado = true;
		} catch (PersistenceException e) {
			log.error("ERROR AL INSERTAR PROFESOR");
		} finally {
			sesion.close();
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param revista
	 * @return Retorna un valor booleano dependiendo si se pudo llevar a cabo la insercion
	 */
	public boolean insertarRevista(Revista revista) {
		PropertyConfigurator.configure("logger.properties");
		Session sesion = null;
		boolean resultado = false;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (Throwable ex) {
			System.err.println("No se pudo crear la sesion " + ex);
			throw new ExceptionInInitializerError(ex);
		}
		try {
			log.info("INSERTANDO REVISTA");
			sesion.beginTransaction();
			sesion.save(revista);
			sesion.getTransaction().commit();
			resultado = true;
		} catch (PersistenceException e) {
			log.error("ERROR AL INSERTAR REVISTA");
		} finally {
			sesion.close();
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param proyecto
	 * @return Retorna un valor booleano dependiendo si se pudo llevar a cabo la insercion
	 */
	public boolean insertarProyectoInvestigacion(ProyectoInvestigacion proyecto) {
		PropertyConfigurator.configure("logger.properties");
		Session sesion = null;
		boolean resultado = false;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (Throwable ex) {
			System.err.println("No se pudo crear la sesion " + ex);
			throw new ExceptionInInitializerError(ex);
		}
		try {
			log.info("INSERTANDO PROYECTO DE INVESTIGACION");
			sesion.beginTransaction();
			sesion.save(proyecto);
			sesion.getTransaction().commit();
			resultado = true;
		} catch (PersistenceException e) {
			log.error("ERROR AL INSERTAR PROYECTO DE INVESTIGACION");
		} finally {
			sesion.close();
		}
		return resultado;
	}
	
	/**
	 * 
	 * @param profesorProyecto
	 * @return Retorna un valor booleano dependiendo si se pudo llevar a cabo la insercion
	 */
	public boolean insertarProfesorProyectoInvestigacion(ProfesorProyectoInvestigacion profesorProyecto) {
		PropertyConfigurator.configure("logger.properties");
		Session sesion = null;
		boolean resultado = false;
		try {
			sesion = CrearConexion.getSessionFactory().openSession();
		} catch (Throwable ex) {
			System.err.println("No se pudo crear la sesion " + ex);
			throw new ExceptionInInitializerError(ex);
		}
		try {
			log.info("INSERTANDO PROFESOR DE PROYECTO DE INVESTIGACION");
			sesion.beginTransaction();
			sesion.save(profesorProyecto);
			sesion.getTransaction().commit();
			resultado = true;
		} catch (PersistenceException e) {
			log.error("ERROR AL INSERTAR PROFESOR DE PROYECTO DE INVESTIGACION");
		} finally {
			sesion.close();
		}
		return resultado;
	}
}
