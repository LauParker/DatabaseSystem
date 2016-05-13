package gui;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import object.Date;


public class PanelEditDate extends JPanel{
	private JComboBox<String> dayCBox;
	private JComboBox<String> monthCBox;
	private JComboBox<String> yearCBox;

	public PanelEditDate(boolean editable) {
		this.setLayout(new GridLayout(2,6,1,1));
		String days[] = buildDaysList();
		dayCBox = new JComboBox<String>(days);
		String months[] = buildMonthsList();
		monthCBox = new JComboBox<String>(months);
		String years[] = buildYearsList();
		yearCBox = new JComboBox<String>(years);
		this.add(new JLabel("  DD:"));
		this.add(new JLabel("  MM:"));
		this.add(new JLabel("  YYYY:"));
		this.add(dayCBox);
		this.add(monthCBox);
		this.add(yearCBox);
		dayCBox.setEnabled(editable);
		monthCBox.setEnabled(editable);
		yearCBox.setEnabled(editable);
		
	}
	
	public PanelEditDate(Date date, boolean editable) {
		this.setLayout(new GridLayout(2,6,1,1));
		String days[] = buildDaysList();
		dayCBox = new JComboBox<String>(days);
		String months[] = buildMonthsList();
		monthCBox = new JComboBox<String>(months);
		String years[] = buildYearsList();
		yearCBox = new JComboBox<String>(years);
		this.add(new JLabel("  DD:"));
		this.add(new JLabel("  MM:"));
		this.add(new JLabel("  YYYY:"));
		this.add(dayCBox);
		this.add(monthCBox);
		this.add(yearCBox);
		dayCBox.setSelectedIndex(date.getDay() -1);
		monthCBox.setSelectedIndex(date.getMonth() -1);
		yearCBox.setSelectedIndex(2014 - date.getYear());
		dayCBox.setEnabled(editable);
		monthCBox.setEnabled(editable);
		yearCBox.setEnabled(editable);
	}
	
	public static String[] buildDaysList() {
		
		String[] daysList = new String[31];
		for (int i = 0; i < 31; i++)
			daysList[i] = String.valueOf(i + 1); 
		return daysList;
	}

	public static String[] buildMonthsList() {
		String[] monthList = new String[12];
		for (int i = 0; i < 12; i++)
			monthList[i] = String.valueOf(i + 1); 
		return monthList;
	}
	public static String[] buildYearsList() {
		String[] yearList = new String[65];
		for (int i = 0; i < 65; i++)
			yearList[i] = String.valueOf(2014 - i); 
		return yearList;
	}
	
	public Date getDate() {
		Date date = new Date((dayCBox.getSelectedIndex()+1),
				(monthCBox.getSelectedIndex()+1),(dayCBox.getSelectedIndex()+1));
		return date;
	}
}
