/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import gui.main.Application;
import gui.main.JDWindow;
import gui.main.OptionPane;
import hibernate.beans.Profesor;
import hibernate.compuestas.ProfesorArea;
import hibernate.compuestas.ProfesorPJ;
import hibernate.compuestas.RolProyecto;
import hibernate.conexion.CrearConexion;
import hibernate.operaciones.Selecciones;
import reader.PropertiesReader;

/**
 * Clase controlador que manejara los eventos de la aplicacion, 
 * El constructor esta implementado bajo el patron Singleton
 * Para acceder a los metodos de la clase se usa el metodo getInstance()
 */
public class Controller implements ActionListener{
	
	private static Controller instance;
	private static Application application;
	private static Selecciones selecciones;

	/**
	 * 
	 */
	private Controller() {
		CrearConexion.getSessionFactory();
	}
	
	

	/**
	 * @return the instance
	 */
	public static Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	public void setController(Application application, Selecciones selecciones) {
		Controller.selecciones = selecciones;
		Controller.application = application;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Commands.valueOf(e.getActionCommand())) {
		case OPCION1:
			consultarListaProfesores();
			break;
		case OPCION2:
			consultarProfesorArea();
			break;
		case OPCION3:
			consultarProfesorPorProyecto();
			break;
		case OPCION4:
			consultarRolesDeProyecto();

			break;

		default:
			break;
		}
	}

	/**
	 * Primera consulta
	 */
	private static void consultarListaProfesores() {
		List<Profesor> lista = selecciones.consultarProfesores();
		ArrayList<String> temp = new ArrayList<>();
		if (lista != null) {
			for (int i = 0; i < lista.size(); i++)
				temp.add(lista.get(i).toString());
		} else {
			System.out.println("No hay elementos");
		}
		PropertiesReader.getInstance();
		new JDWindow(PropertiesReader.getProperty("option1"), temp, PropertiesReader.getProperty("headersProfesor").split(","), application);
	}
	
	/**
	 * Segunda consulta
	 */
	private static void consultarProfesorArea() {
		List<ProfesorArea> lista = selecciones.consultarProfesorArea();
		ArrayList<String> temp = new ArrayList<>();
		if (lista.size() != 0) {
			for (int i = 0; i < lista.size(); i++) {
				temp.add(lista.get(i).toString());
			}
		} else {
			System.out.println("NO HAY ELEMENTOS");
		}
		new JDWindow(PropertiesReader.getProperty("option2"), temp, PropertiesReader.getProperty("headersProfesorArea").split(","), application);
	}
	
	/**
	 * Tercera Consulta
	 * @param idProyecto
	 * @return
	 */
	private static void consultarProfesorPorProyecto() {
		//int
		int numProyecto = OptionPane.conseguirNumero(application, selecciones.consultarNumerosDeProyecto().toArray());
		List<ProfesorPJ> lista = selecciones.consultarProfesorDeProyecto(numProyecto);
		ArrayList<String> temp = new ArrayList<>();
		if (lista.size() != 0) {
			for (int i = 0; i < lista.size(); i++) {
				temp.add(lista.get(i).toString());
			}
		} else {
			System.out.println("NO HAY ELEMENTOS");
		}
		new JDWindow(PropertiesReader.getProperty("option3") + numProyecto, temp, PropertiesReader.getProperty("headersProfesorProyecto").split(","), application);
	}
	
	/**
	 * Cuarta Consulta
	 * @param rol
	 * @return
	 */
	private static void consultarRolesDeProyecto() {
		// string
		String rol = OptionPane.conseguirRol(application, selecciones.consultarRolesDeProyecto().toArray());
		List<RolProyecto> lista = selecciones.consultarRolesEnProyectos(rol);
		ArrayList<String> temp = new ArrayList<>();
		if (lista.size() != 0) {
			for (int i = 0; i < lista.size(); i++) {
				temp.add(lista.get(i).toString());
			}
		} else {
			System.out.println("NO HAY ELEMENTOS");
		}
		new JDWindow(PropertiesReader.getProperty("option4") + rol, temp, PropertiesReader.getProperty("headersRolProyecto").split(","), application);
	}
}
