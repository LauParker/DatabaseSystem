package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelErrorMessage extends JPanel{

	/**
	 * display error message to the user
	 */
	public PanelErrorMessage(String message) {
		JPanel panelMessage= new JPanel(new GridLayout(2,2));
		JLabel labelMessage = new JLabel(message);
		
		panelMessage.add(labelMessage,0);

		JOptionPane.showConfirmDialog(null, panelMessage, "Error Message",
				JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
	}
}