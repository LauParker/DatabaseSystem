package gui;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Calendar;
import java.util.Date;

public class PanelEditDate extends JPanel{
	private JComboBox<String> dayCBox;
	private JComboBox<String> monthCBox;
	private JComboBox<String> yearCBox;

	/**
	 * editable Date panel with blank fields
	 * @param editable
	 */
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
	
	/**
	 * date panel with pre-loaded data
	 * @param date
	 * @param editable
	 */
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
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		dayCBox.setSelectedIndex(cal.DAY_OF_MONTH -1);
		monthCBox.setSelectedIndex(cal.MONTH);
		yearCBox.setSelectedIndex(2016 - cal.YEAR);
		dayCBox.setEnabled(editable);
		monthCBox.setEnabled(editable);
		yearCBox.setEnabled(editable);
	}
	
	/**
	 * build day list for combo box
	 * @return
	 */
	private static String[] buildDaysList() {
		
		String[] daysList = new String[31];
		for (int i = 0; i < 31; i++)
			daysList[i] = String.valueOf(i + 1); 
		return daysList;
	}

	/**
	 * build month list for combo box
	 * @return
	 */
	private static String[] buildMonthsList() {
		String[] monthList = new String[12];
		for (int i = 0; i < 12; i++)
			monthList[i] = String.valueOf(i + 1); 
		return monthList;
	}
	
	/**
	 * build year list for combo box
	 * @return
	 */
	private static String[] buildYearsList() {
		String[] yearList = new String[65];
		for (int i = 0; i < 65; i++)
			yearList[i] = String.valueOf(2014 - i); 
		return yearList;
	}
	
	/**
	 * 
	 * @return current date in date panel display
	 */
	public Date getDate() {
		Calendar cal = Calendar.getInstance();
		cal.set(yearCBox.getSelectedIndex()+1, 
				monthCBox.getSelectedIndex()+1, 
				dayCBox.getSelectedIndex()+1);
		return cal.getTime();
	}
}
