package gui;

import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.DatabaseMain;
import object.Person;

@SuppressWarnings("serial")
public class PanelEditPerson extends JPanel{
	private int accNum;
	private JTextField titleTF;
	private JTextField firstNameTF;
	private JTextField lastNameTF;
	private JTextField genderTF;
	private PanelEditAddress addressPanel;
	private PanelEditDate dobPanel;
	private JTextField phoneTF;
	private JTextField emailTF;
	
	/**
	 * constructor edit person panel and attempt to add person 
	 * details if account number has been passed in 
	 * @param accountNum
	 * @param editable
	 */
	public PanelEditPerson(int accountNum, boolean editable) {
		this.setLayout(new GridBagLayout());
		JLabel personlb = new JLabel("PERSON");
		JLabel acclb = new JLabel(String.valueOf(accountNum));
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
		addressPanel = new PanelEditAddress(null, editable, accountNum);
		phoneTF = new JTextField("phoneNo");
		emailTF = new JTextField("national I No.");
		
		try { 
			if (accountNum >= 0){ 
				acclb.setText(String.valueOf(accountNum));
				titleTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getTitle());
				firstNameTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getFirstName());
				lastNameTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getLastName());
				genderTF.setText(String.valueOf(DatabaseMain.getNbGardens().
						getStaff(accountNum).getGender()));
				phoneTF.setText(String.valueOf(DatabaseMain.getNbGardens().
						getStaff(accountNum).getContactNo()));
				emailTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getEmail());
				dobPanel = new PanelEditDate(DatabaseMain.getNbGardens().
						getStaff(accountNum).getDateOfBirth(), editable);
				addressPanel = new PanelEditAddress(DatabaseMain.getNbGardens().
						getStaff(accountNum).getHomeAddress(),editable, accountNum);
				emailTF.setText(DatabaseMain.getNbGardens().
						getStaff(accountNum).getEmail());
			}
		}
		catch (NullPointerException e){
		}
		this.add(emailTF, DatabaseMain.setLayoutConstraints(2,6,4));
		this.add(phoneTF, DatabaseMain.setLayoutConstraints(2,5,4));
		this.add(addressPanel, DatabaseMain.setLayoutConstraints(2,4,6));
		this.add(dobPanel, DatabaseMain.setLayoutConstraints(2,3,7)); 
		this.add(genderTF, DatabaseMain.setLayoutConstraints(2,2,3));		
		this.add(firstNameTF, DatabaseMain.setLayoutConstraints(2,1,4));
		this.add(lastNameTF, DatabaseMain.setLayoutConstraints(2,1,4));
		this.add(titleTF, DatabaseMain.setLayoutConstraints(0, 0, 0));
		this.add(emaillb, DatabaseMain.setLayoutConstraints(0,6,2));
		this.add(phonelb, DatabaseMain.setLayoutConstraints(0,5,2));
		this.add(addresslb, DatabaseMain.setLayoutConstraints(0,4,2));
		this.add(dateOBlb, DatabaseMain.setLayoutConstraints(0,3,2));
		this.add(genderlb, DatabaseMain.setLayoutConstraints(0,2,2));		
		this.add(firstnamelb, DatabaseMain.setLayoutConstraints(0,1,2));
		this.add(lastnamelb, DatabaseMain.setLayoutConstraints(0,1,2));
		this.add(personlb, DatabaseMain.setLayoutConstraints(2,0,3));
		this.add(acclb,DatabaseMain.setLayoutConstraints(5, 0, 2));
		titleTF.setEnabled(editable);
		firstNameTF.setEnabled(editable);
		lastNameTF.setEnabled(editable);
		genderTF.setEnabled(editable);
		emailTF.setEnabled(editable);
		phoneTF.setEnabled(editable);
	}
	
	/**
	 * 
	 * @return Person object with the details of object fields in person panel
	 */
	public Person getPerson() {
		Person personResult = null;
		char sex = genderTF.getText().trim().toLowerCase().charAt(0);
		if ((sex != 'm')|| (sex != 'f')) {
			new PanelErrorMessage("Gender input needs to be 'male', or 'female'");
		} else {
			personResult = new Person(
					accNum, 
					titleTF.getText(), 
					firstNameTF.getText(), 
					lastNameTF.getText(),
					Long.parseLong(phoneTF.getText()),
					emailTF.getText(), 
					sex, 
					dobPanel.getDate(),
					addressPanel.getAddress());
		}
		return personResult;
	}
}
