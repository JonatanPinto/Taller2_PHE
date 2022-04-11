/**
 * 
 */
package gui.main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Commands;
import controller.Controller;


/**
 * @author Jonatan
 *
 */
public class Application extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton buttonQuery1;
	private JButton buttonQuery2;
	private JButton buttonQuery3;
	private JButton buttonQuery4;
	
	/**
	 * 
	 */
	public Application() {
		JPanel buttonPane = new JPanel();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		buttonPane.setLayout(new FlowLayout());
		Dimension window = Toolkit.getDefaultToolkit().getScreenSize();
	    Dimension size = new Dimension(300, 280);
	    this.setBounds(window.height - size.height, window.width - size.width, size.height, size.width);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		init(buttonPane);	
		this.add(buttonPane);
		this.setVisible(true);
	}
	
	/**
	 * @param buttonPane 
	 * 
	 */
	private void init(JPanel buttonPane) { 
		buttonPane.add(Box.createRigidArea(new Dimension(100, 20)));
		buttonQuery1 = new JButton("Seleccionar Profesores");
		buttonQuery1.setActionCommand(Commands.OPCION1.toString());
		buttonQuery1.addActionListener(Controller.getInstance());
		buttonPane.add(buttonQuery1);
		
		buttonPane.add(Box.createRigidArea(new Dimension(100, 20)));
		buttonQuery2 = new JButton("Seleccionar Profesores y sus Areas");
		buttonQuery2.setActionCommand(Commands.OPCION2.toString());
		buttonQuery2.addActionListener(Controller.getInstance());
		buttonPane.add(buttonQuery2);
		
		buttonPane.add(Box.createRigidArea(new Dimension(100, 20)));
		buttonQuery3 = new JButton("Seleccionar Profesores de un Proyecto");
		buttonQuery3.setActionCommand(Commands.OPCION3.toString());
		buttonQuery3.addActionListener(Controller.getInstance());
		buttonPane.add(buttonQuery3);
		
		buttonPane.add(Box.createRigidArea(new Dimension(100, 20)));
		buttonQuery4 = new JButton("Seleccionar Roles en los proyectos");
		buttonQuery4.setActionCommand(Commands.OPCION4.toString());
		buttonQuery4.addActionListener(Controller.getInstance());
		buttonPane.add(buttonQuery4);
		buttonPane.add(Box.createRigidArea(new Dimension(100, 20)));
	}
}
