package hibernate.principal;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import hibernate.beans.Profesor;
import hibernate.compuestas.ProfesorArea;
import hibernate.compuestas.ProfesorPJ;
import hibernate.compuestas.RolProyecto;
import hibernate.conexion.CrearConexion;
import hibernate.operaciones.Selecciones;
import reader.TextReader;

public class Principal{
	
	private static final String[] roles = {"RESPONSABLE","PARTICIPANTE"};

	public static void main(String[] args) {
		Properties properties = new Properties();
//		Load load = new Load();
//		try {
//			properties.load(new FileReader("config.properties"));
//			System.out.println("Iniciando Conexion");
//			String PATH_FILE = properties.getProperty("pathFile");
//			System.out.println("\nCargando Areas");
//			System.out.println("Areas cargadas: " + load.cargarAreas(TextReader.read(PATH_FILE + "llenado_area.txt")));
//			
//			System.out.println("\nCargando Profesores");
//			System.out.println("Profesores cargados: " + load.cargarProfesores(TextReader.read(PATH_FILE + "llenado_profesores.txt")));
//			
//			System.out.println("\nCargando Proyectos");
//			System.out.println("Proyectos cargadas: " + load.cargarProyectos(TextReader.read(PATH_FILE + "llenado_proyecto.txt")));
//			
//			System.out.println("\nAsignando Proyectos a Profesores");
//			System.out.println("Asignaciones cargadas: " + load.cargarProfesorProyectos(TextReader.read(PATH_FILE + "llenado_profesor_proyecto.txt")));
//			
//			CrearConexion.closeSessionFactory();
//			System.out.println("\nFinalizando Conexion");
//		} catch (FileNotFoundException e) {
//			System.err.println(e.getMessage());
//		} catch (IOException e) {
//			System.err.println(e.getMessage());			
//		}
		consultarListaProfesores();
		System.out.println("\n-----------------------------------------------------------------------------------\n");
		consultarProfesorArea();
		System.out.println("\n-----------------------------------------------------------------------------------\n");
		consultarProfesorPorProyecto(5);
		System.out.println("\n-----------------------------------------------------------------------------------\n");
		consultarRolesDeProyecto(roles[0]);
	}

	/**
	 * Primera consulta
	 */
	private static void consultarListaProfesores() {
		Selecciones selecciones = new Selecciones();
		List<Profesor> lista = selecciones.consultarProfesores();
		if (lista != null) {
			for (int i = 0; i < lista.size(); i++)
				System.out.println(lista.get(i).toString());
		} else {
			System.out.println("No hay elementos");
		}
	}
	
	/**
	 * Segunda consulta
	 */
	private static void consultarProfesorArea() {
		Selecciones selecciones = new Selecciones();
		List<ProfesorArea> lista = selecciones.consultarProfesorArea();
		if (lista.size() != 0) {
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i).toString());
			}
		} else {
			System.out.println("NO HAY ELEMENTOS");
		}
	}
	
	/**
	 * Tercera Consulta
	 * @param idProyecto
	 * @return
	 */
	private static void consultarProfesorPorProyecto(int numProyecto) {
		Selecciones selecciones = new Selecciones();
		List<ProfesorPJ> lista = selecciones.consultarProfesorDeProyecto(numProyecto);
		if (lista != null) {
			if (lista.size() != 0) {
				for (int i = 0; i < lista.size(); i++)
					System.out.println(lista.get(i).toString());
			} else {
				System.out.println("No hay elementos");
			}
		}
	}
	
	/**
	 * Cuarta Consulta
	 * @param rol
	 * @return
	 */
	private static void consultarRolesDeProyecto(String rol) {
		Selecciones selecciones = new Selecciones();
		List<RolProyecto> lista = selecciones.consultarRolesEnProyectos(rol);
		if (lista != null) {
			if (lista.size() != 0) {
				for (int i = 0; i < lista.size(); i++)
					System.out.println(lista.get(i).toString());
			} else {
				System.out.println("No hay elementos");
			}
		}
	}
}