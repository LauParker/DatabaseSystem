package gui;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelDisplay extends JPanel {

	private JTextArea sqlArea;
	public PanelDisplay() {
		sqlArea = new JTextArea();
		sqlArea.setText("SQL query return");
		this.setLayout(new FlowLayout());
		this.add(sqlArea);
	}
	
	public void setSqlText(String txt) {
		sqlArea.setText(txt);
	}
}
