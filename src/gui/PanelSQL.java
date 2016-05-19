package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.junit.Test;

import main.DatabaseMain;

@SuppressWarnings("serial")
public class PanelSQL extends JPanel {

	public PanelSQL() {
		JTextField tableTF = new JTextField();
		JTextField whereTF = new JTextField();
		JButton selectBtn = new JButton("SELECT");
		tableTF.setText("table");
		whereTF.setText("where");
		
		this.setLayout(new FlowLayout());
		
		selectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//test
				//testTextInput(tableTF,whereTF);
				
				if (((!tableTF.getText().trim().toLowerCase().equals("table")) && (!tableTF.getText().trim().equals(null)))
						&& ((!whereTF.getText().trim().toLowerCase().equals("where")) && (!whereTF.getText().trim().equals(null)))) {
					DatabaseMain.query(tableTF.getText().toLowerCase().trim(),whereTF.getText().toLowerCase().trim());
				} else {
					DatabaseMain.queryError(tableTF.getText().toLowerCase().trim(),whereTF.getText().toLowerCase().trim());
				}
			}
		});
		this.add(tableTF);
		this.add(whereTF);
		this.add(selectBtn);
	}
	
	@Test
	private void testTextInput(JTextField testTable, JTextField testWhere) {
		System.out.println("table: " + testTable.getText());
		System.out.println("where: " + testWhere.getText());
		System.out.println("table != default: " + !testTable.getText().trim().toLowerCase().equals("table") );
		System.out.println("table != null: " + !testTable.getText().trim().equals(null));
		System.out.println("where != default: " + !testWhere.getText().trim().toLowerCase().equals("where") );
		System.out.println("where != null: " + !testWhere.getText().trim().equals(null));
		System.out.println("table != default AND !null: " + String.valueOf((!testTable.getText().trim().toLowerCase().equals("table")) && (!testTable.getText().trim().equals(null))));
		System.out.println("where != default AND !null: " + String.valueOf((!testWhere.getText().trim().toLowerCase().equals("where")) && (!testWhere.getText().trim().equals(null))));
		System.out.println("table != default AND !null AND where != default AND !null: " + String.valueOf(((!testTable.getText().trim().toLowerCase().equals("table")) && (!testTable.getText().trim().equals(null)))
				&& ((!testWhere.getText().trim().toLowerCase().equals("where")) && (!testWhere.getText().trim().equals(null)))));
	}
}
