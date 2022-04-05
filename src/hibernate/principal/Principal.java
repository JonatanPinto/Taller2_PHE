package hibernate.principal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import hibernate.beans.Area;
import hibernate.beans.Profesor;
import hibernate.beans.ProfesorProyectoInvestigacion;
import hibernate.beans.ProyectoInvestigacion;
import hibernate.conexion.CrearConexion;
import hibernate.operaciones.Inserciones;
import utilities.TextReader;

/**
 * 
 * @author Jonatan
 *
 */
public class Principal {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader("config.properties"));
			System.out.println("Iniciando Conexion");
			String PATH_FILE = properties.getProperty("pathFile");
			System.out.println("\nCargando Areas");
			System.out.println("Areas cargadas: " + cargarAreas(TextReader.read(PATH_FILE + "llenado_area.txt")));
			
			System.out.println("\nCargando Profesores");
			System.out.println("Profesores cargados: " + cargarProfesores(TextReader.read(PATH_FILE + "llenado_profesores.txt")));
			
			System.out.println("\nCargando Proyectos");
			System.out.println("Proyectos cargadas: " + cargarProyectos(TextReader.read(PATH_FILE + "llenado_proyecto.txt")));
			
			System.out.println("\nAsignando Proyectos a Profesores");
			System.out.println("Asignaciones cargadas: " + cargarProfesorProyectos(TextReader.read(PATH_FILE + "llenado_profesor_proyecto.txt")));
			
			CrearConexion.closeSessionFactory();
			System.out.println("\nFinalizando Conexion");
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());			
		}
	}

	/**
	 * @param data
	 */
	private static int cargarProfesorProyectos(ArrayList<String> data) {
		Inserciones inserciones = new Inserciones();
		int count = 0;
		for (String string : data) {
			String[] temp = string.split(",");
			count++;
			inserciones.insertarProfesorProyectoInvestigacion(new ProfesorProyectoInvestigacion(temp[2], temp[0], temp[1]));
		}
		return count;
	}

	/**
	 * @param data
	 * @return 
	 */
	private static int cargarProyectos(ArrayList<String> data) {
		Inserciones inserciones = new Inserciones();
		int count = 0;
		for (String string : data) {
			String[] temp = string.split(",");
			count++;
			inserciones.insertarProyectoInvestigacion(new ProyectoInvestigacion(temp[0], temp[1], temp[2]));
		}
		return count;
	}

	/**
	 * @param read
	 */
	private static int cargarProfesores(ArrayList<String> data) {
		Inserciones inserciones = new Inserciones();
		int count = 0;
		for (String string : data) {
			String[] temp = string.split(",");
			count++;
			inserciones.insertarProfesor(new Profesor(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]));
		}
		return count;
	}

	/**
	 * 
	 * @param data
	 * @return 
	 */
	private static int cargarAreas(ArrayList<String> data) {
		Inserciones inserciones = new Inserciones();
		int count = 0;
		for (String string : data) {
			String[] temp = string.split(",");
			count++;
			inserciones.insertarArea(new Area(temp[0], temp[1]));
		}
		return count;
	}

}