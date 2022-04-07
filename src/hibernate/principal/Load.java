/**
 * 
 */
package hibernate.principal;

import java.util.ArrayList;

import hibernate.beans.Area;
import hibernate.beans.Profesor;
import hibernate.beans.ProfesorProyectoInvestigacion;
import hibernate.beans.ProyectoInvestigacion;
import hibernate.operaciones.Inserciones;

/**
 * @author Jonatan
 *
 */
public class Load {

	/**
	 * @param data
	 */
	public int cargarProfesorProyectos(ArrayList<String> data) {
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
	public int cargarProyectos(ArrayList<String> data) {
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
	public int cargarProfesores(ArrayList<String> data) {
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
	public int cargarAreas(ArrayList<String> data) {
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