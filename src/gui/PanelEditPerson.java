package gui;

import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.DatabaseMain;
import object.Address;
import object.Date;
import object.Employee;

public class PanelEditPerson extends JPanel{
	private int accNum;
	private JTextField titleTF;
	private JTextField firstNameTF;
	private JTextField lastNameTF;
	private JTextField genderTF;
	private PanelEditAddress addressPanel;
	private PanelEditDate dobPanel;
	private JTextField phoneTF;
	private JTextField email;
	
	public PanelEditPerson(int accountNum, boolean editable) {
		
		this.setLayout(new GridBagLayout());
		JLabel personlb = new JLabel("PERSON");
		JLabel firstnamelb = new JLabel("First Name");
		JLabel lastnamelb = new JLabel("Last Name");
		JLabel genderlb = new JLabel("Gender");	
		JLabel dateOBlb = new JLabel("Date of Birth");	
		JLabel addresslb = new JLabel("Address");
		JLabel phonelb = new JLabel("Phone No.");
		JLabel emaillb = new JLabel("Email");
		titleTF = new JTextField("first name");
		firstNameTF = new JTextField("first name");
		lastNameTF = new JTextField("last name");
		genderTF = new JTextField("gender");
		dobPanel = new PanelEditDate(editable);
		addressPanel = new PanelEditAddress(editable);
		phoneTF = new JTextField("phoneNo");
		email = new JTextField("national I No.");
		
		try { 
			if (accountNum >= 0){ 
				firstNameTF.setText(DatabaseMain.getNbGardens().getStaff(accountNum).getFirstName());
				lastNameTF.setText(DatabaseMain.getNbGardens().getStaff(accountNum).getLastName());
				genderTF.setText(String.valueOf(DatabaseMain.getNbGardens().getStaff(accountNum).getGender()));
				phoneTF.setText(String.valueOf(DatabaseMain.getNbGardens().getStaff(accountNum).getContactNo()));
				email.setText(DatabaseMain.getNbGardens().getStaff(accountNum).getEmail());
				dobPanel = new PanelEditDate(DatabaseMain.getNbGardens().getStaff(accountNum).getDateOfBirth(), editable);
				addressPanel = new PanelEditAddress(DatabaseMain.getNbGardens().getStaff(accountNum).getHomeAddress(),editable);
				email.setText(DatabaseMain.getNbGardens().getStaff(accountNum).getEmail());
			}
			else
				accountNum = 0;
		}
		catch (NullPointerException e){
		}
		this.add(email,Controller.setLayoutConstraints(2,6,4));
		this.add(phoneTF,Controller.setLayoutConstraints(2,5,4));
		this.add(addressPanel,Controller.setLayoutConstraints(2,4,6));
		this.add(dobPanel,Controller.setLayoutConstraints(2,3,7)); 
		this.add(genderTF,Controller.setLayoutConstraints(2,2,3));		
		this.add(firstNameTF,Controller.setLayoutConstraints(2,1,4));
		this.add(lastNameTF,Controller.setLayoutConstraints(2,1,4));
		this.add(emaillb,Controller.setLayoutConstraints(0,6,2));
		this.add(phonelb,Controller.setLayoutConstraints(0,5,2));
		this.add(addresslb,Controller.setLayoutConstraints(0,4,2));
		this.add(dateOBlb,Controller.setLayoutConstraints(0,3,2));
		this.add(genderlb,Controller.setLayoutConstraints(0,2,2));		
		this.add(firstnamelb,Controller.setLayoutConstraints(0,1,2));
		this.add(lastnamelb,Controller.setLayoutConstraints(0,1,2));
		this.add(personlb,Controller.setLayoutConstraints(3,0,7));
		firstNameTF.setEnabled(editable);
		lastNameTF.setEnabled(editable);
		genderTF.setEnabled(editable);
		email.setEnabled(editable);
		phoneTF.setEnabled(editable);
	}
	
	public Employee getPerson() {
		char sex = genderTF.getText().trim().charAt(0);
		Employee personResult = new Employee(accNum, titleTF.getText(), firstNameTF.getText(), lastNameTF.getText(),phoneTF.getText(),email.getText(), sex, dobPanel.getDate(),addressPanel.getAddress(),);
		return personResult;
	}
	/*
	 * accountNumber, title, firstName, lastName, contactNo, email,
				gender, dateOfBirth, homeAddress);
	 */
}
