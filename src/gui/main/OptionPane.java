/**
 * 
 */
package gui.main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Jonatan
 *
 */
public class OptionPane {
	
	public static int conseguirNumero(JFrame frame, Object[] list) {
		return (int) JOptionPane.showInputDialog(frame, "Seleccione el numero de proyecto", "Numero de Proyecto", JOptionPane.QUESTION_MESSAGE, null, list, list[0]);
	}
	
	public static String conseguirRol(JFrame frame, Object[] list) {
		return (String) JOptionPane.showInputDialog(frame, "Seleccione el rol de proyecto", "Rol de Proyecto", JOptionPane.QUESTION_MESSAGE, null, list, list[0]);
	}
}