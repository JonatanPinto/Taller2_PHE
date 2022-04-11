/**
 * 
 */
package gui.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jonatan
 *
 */
public class JDWindow extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel label;
	private JPanel panel, panel2;
	
	/**
	 * 
	 */
	public JDWindow(String labelText, ArrayList<String> textList, String[] headers, JFrame frame) {
		this.setLayout(new BorderLayout());
		label = new JLabel("\n\n" + labelText + "\n\n");
		panel = new JPanel();
		panel.add(label);
		this.add(panel, BorderLayout.NORTH);
		panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		table(textList,headers);
		this.add(panel2, BorderLayout.CENTER);
		this.setSize(new Dimension(600,300));
		this.setLocationRelativeTo(frame);
		this.setModal(true);
		this.setVisible(true);
	}

	/**
	 * 
	 */
	private void table(ArrayList<String> textList, String[] headers) {
		JTable table = new JTable(convertList(textList),headers);
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		defaultTableModel.setColumnIdentifiers(headers);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		panel2.add(scrollPane);
	}
	
	private String[][] convertList(ArrayList<String> list){
		String[][] temp = new String[list.size()][list.get(0).split(",").length];
		for (int i = 0; i < list.size(); i++) {
			String[] split = list.get(i).split(",");
			for (int j = 0; j < split.length; j++) {
				temp[i][j] = split[j];
			}
		}
		return temp;
	}
}
