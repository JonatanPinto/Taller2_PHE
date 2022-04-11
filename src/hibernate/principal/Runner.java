/**
 * 
 */
package hibernate.principal;

import controller.Controller;
import gui.main.Application;
import hibernate.operaciones.Selecciones;

public class Runner {

	public static void main(String[] args) {
		Controller.getInstance().setController(new Application(), new Selecciones());
	}
}