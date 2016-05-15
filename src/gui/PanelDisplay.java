package gui;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelDisplay extends JPanel {

	private JTextArea sqlArea;
	
	/**
	 * display panel for sql feedback
	 */
	public PanelDisplay() {
		sqlArea = new JTextArea();
		sqlArea.setText("SQL query return");
		this.setLayout(new FlowLayout());
		this.add(sqlArea);
	}
	
	/**
	 * called to change the text on the display area
	 * @param txt
	 */
	public void setSqlText(String txt) {
		sqlArea.setText(txt);
	}
}
