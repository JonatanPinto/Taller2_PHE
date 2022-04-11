/**
 * 
 */
package gui.main;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 *
 */
public class OptionPane {
	
	/**
	 * Metodo que permite escoger un numero dentro de una lista de numeros
	 * @param frame Componente padre
	 * @param list Lista de numeros
	 * @return Numero seleccionado
	 */
	public static int conseguirNumero(JFrame frame, Object[] list) {
		return (int) JOptionPane.showInputDialog(frame, "Seleccione el numero de proyecto", "Numero de Proyecto", JOptionPane.QUESTION_MESSAGE, null, list, list[0]);
	}
	
	/**
	 * Metodo que permite escoger un valor de cadena de texto dentro de una lista
	 * @param frame Componente padre
	 * @param list Lista de Strings
	 * @return String seleccionado de la lista
	 */
	public static String conseguirRol(JFrame frame, Object[] list) {
		return (String) JOptionPane.showInputDialog(frame, "Seleccione el rol de proyecto", "Rol de Proyecto", JOptionPane.QUESTION_MESSAGE, null, list, list[0]);
	}
	
	public static void mostrarTexto(JFrame frame, String text, String title) {
		JOptionPane.showMessageDialog(frame, text, title, JOptionPane.INFORMATION_MESSAGE);
	}
}