/**
 * 
 */
package gui.table;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * @author Jonatan
 *
 */
public class Row extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public Row(String...textList) {
		JLabel label;
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = 1;
		gbc.gridy = 0;
		for (int i = 0; i < textList.length; i++) {
			label = new JLabel(textList[i]);
			label.setAlignmentX(CENTER_ALIGNMENT);
			label.setBackground(Color.white);
			label.setBorder(new LineBorder(Color.black));
			label.setSize(50, 10);
			gbc.gridx = i;
			this.add(label, gbc);
		}
	}
}
