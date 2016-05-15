package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Test;

import main.DatabaseMain;
public class PanelLogon extends JPanel{

	/**
	 * UI for user to log on
	 */
	public PanelLogon() {
		JPanel panelLogon = new JPanel(new GridLayout(2,2));
		JLabel labelUser= new JLabel("User Name: ");
		JTextField textUser = new JTextField("");
		JLabel lablePass = new JLabel("Password: ");
		JTextField textPass = new JTextField("");
		
		panelLogon.add(labelUser,0);
		panelLogon.add(textUser,1);
		panelLogon.add(lablePass,2);
		panelLogon.add(textPass,3);

		int result = JOptionPane.showConfirmDialog(null, panelLogon, "Sign In",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		if (result == JOptionPane.OK_OPTION) {	
			// TEST testConfirmation(textUser,textPass);
			if ((textUser.getText().length() > 5) && (textPass.getText().length() > 5)) {
				DatabaseMain.logOnAttempt(textUser.getText().trim(), textPass.getText().trim());
			} else {
				DatabaseMain.logOff();
			}
		} 
	}
	
	/**
	 * Console prints of the users inputs
	 * @param textUser
	 * @param textPass
	 */
	@Test
	private void testConfirmation(JTextField textUser, JTextField textPass) {
		System.out.println("user: " + textUser.getText());
		System.out.println("where: " + textPass.getText());
	}
}