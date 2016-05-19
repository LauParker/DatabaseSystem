package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.DatabaseMain;
import object.Address;

@SuppressWarnings("serial")
public class PanelEditAddress extends JPanel
{
	private JTextField houseTF;
	private JTextField firstTF;
	private JTextField secondTF;
	private JTextField townTF;
	private JTextField cityTF;
	private JTextField countyTF;
	private JTextField postTF;
	private JTextField countryTF;
	
	public PanelEditAddress(Address editAddress, boolean editable, int accountNum) {
		JLabel houseLb = new JLabel("House Number / Name");
		JLabel firstLb = new JLabel("First line");
		JLabel secondLb = new JLabel("Second Line");
		JLabel townLb = new JLabel("Town");
		JLabel cityLb = new JLabel("City");
		JLabel countyLb = new JLabel("County");
		JLabel postLb = new JLabel("Postcode");
		JLabel countryLb = new JLabel("Country");
		houseTF = new JTextField("h");
		firstTF = new JTextField("1");
		secondTF = new JTextField("2");
		townTF = new JTextField("t");
		cityTF = new JTextField("ci");
		countyTF = new JTextField("coun");
		postTF = new JTextField("p");
		countryTF = new JTextField("ntry");
		
		try {
			if (accountNum <= 0) {
				houseTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress().getHouseNameNum());
				firstTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress().getFirstLine());
				secondTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress().getSecondLine());
				townTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress().getTown());
				cityTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress().getCity());
				countyTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress().getCounty());
				postTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress().getPostcode());
				countryTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress().getCountry());
			}
		} catch(NullPointerException e) {
		}
		this.add(houseTF,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(firstTF,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(secondTF,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(townTF,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(cityTF,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(countyTF,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(postTF,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(countryTF,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(houseLb,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(firstLb,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(secondLb,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(townLb,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(cityLb,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(countyLb,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(postLb,DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(countryLb,DatabaseMain.setLayoutConstraints(0, 0, 0));

		houseTF.setEnabled(editable);
		firstTF.setEnabled(editable);
		secondTF.setEnabled(editable);
		townTF.setEnabled(editable);
		cityTF.setEnabled(editable);
		countyTF.setEnabled(editable);
		postTF.setEnabled(editable);
		countryTF.setEnabled(editable);
	}

	public Address getAddress() {
		Address addressResult = null;
		addressResult = new Address(
				houseTF.getText(),
				firstTF.getText(),
				secondTF.getText(),
				townTF.getText(),
				cityTF.getText(),
				countyTF.getText(),
				postTF.getText(),
				countryTF.getText());
		return addressResult;
	}

}
