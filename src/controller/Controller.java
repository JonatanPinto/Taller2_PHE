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
 * Clase controlador que manejara los eventos de la aplicacion, El constructor
 * esta implementado bajo el patron Singleton Para acceder a los metodos de la
 * clase se usa el metodo getInstance()
 */
public class Controller implements ActionListener {

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
	 * Metodo que retorna la instancia del Controlador para poder acceder a los
	 * metodos
	 * 
	 * @return Objeto de tipo Controller
	 */
	public static Controller getInstance() {
		if (instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	public void setController(Application application, Selecciones selecciones) {
		OptionPane.mostrarTexto(application, PropertiesReader.getInstance().getProperty("message"), PropertiesReader.getInstance().getProperty("welcome"));
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
	 * Primera consulta Accede a las selecciones y busca los profesores en la base
	 * de datos, posteriormente pasa los datos a la parte grafica para ser mostrados
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
		new JDWindow(PropertiesReader.getInstance().getProperty("option1"), temp,
				PropertiesReader.getInstance().getProperty("headersProfesor").split(","), application);
	}

	/**
	 * Segunda consulta Accede a las selecciones y busca los profesores junto a la
	 * area a la que pertenecen en la base de datos, posteriormente pasa los datos a
	 * la parte grafica para ser mostrados
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
		new JDWindow(PropertiesReader.getInstance().getProperty("option2"), temp,
				PropertiesReader.getInstance().getProperty("headersProfesorArea").split(","), application);
	}

	/**
	 * Tercera Consulta Accede a las selecciones y busca los profesores asignados a
	 * un numero de proyecto determinado en la base de datos, posteriormente pasa
	 * los datos a la parte grafica para ser mostrados
	 * 
	 * @param idProyecto Numero del proyecto que servira como parametro de busqueda
	 *                   El idProyecto no es necesario ser escrito debido a que se
	 *                   muestran los idProyectos existentes en la base de datos
	 */
	private static void consultarProfesorPorProyecto() {
		// int
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
		new JDWindow(PropertiesReader.getInstance().getProperty("option3") + numProyecto, temp,
				PropertiesReader.getInstance().getProperty("headersProfesorProyecto").split(","), application);
	}

	/**
	 * Cuarta Consulta Accede a las selecciones y busca los profesores asignados en
	 * todos los proyectos pero que esten con el rol deseado en la base de datos,
	 * posteriormente pasa los datos a la parte grafica para ser mostrados
	 * 
	 * @param rol Rol asignado a un profesor El rol no es necesario ser escrito
	 *            debido a que se muestran los roles existentes en la base de datos
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
		new JDWindow(PropertiesReader.getInstance().getProperty("option4") + rol, temp,
				PropertiesReader.getInstance().getProperty("headersRolProyecto").split(","), application);
	}
}
