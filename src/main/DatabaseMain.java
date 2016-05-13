package main;

import gui.Frame;
import gui.PanelLogon;
import gui.PanelSQL;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;

import object.Customer;
import object.Employee;
import object.NBGardens;
import object.Product;

import org.junit.Test;

public class DatabaseMain {
	
	private static Frame frame;
	private static Container container;
	private static DatabaseController dbc;
	private static int access;
	private static Employee currentUser;
	private static NBGardens nbGardens;
	
	/**
	 * @return the nbGardens
	 */
	public static NBGardens getNbGardens()
	{
		return nbGardens;
	}

	/**
	 * @param nbGardens the nbGardens to set
	 */
	public static void setNbGardens(NBGardens nbGardens)
	{
		DatabaseMain.nbGardens = nbGardens;
	}

	public static void main(String [] args) {
		frame = new Frame();
		container = frame.getContentPane();
		dbc = new DatabaseController();
		access = 0;
		nbGardens = new NBGardens();
		showGUI(access);
	}

	public static void logOff() {
		access = 0;
		showGUI(access);
	}

	public static void logOnAttempt(String user, String pass) {	
		dbc.getHumanResourcesView();
		for (int i = 0; i < getNbGardens().getStaff().size(); i ++) {
			if (getNbGardens().getStaff(i).getLogon().equals(user)) {
				if (getNbGardens().getStaff(i).getWordpass().equals(pass)) {
					System.out.println("yay");
					currentUser = getNbGardens().getStaff(i);
					access = currentUser.getAccessLevel();
//					ok = true;
				} 
			}
		}
	showGUI(access);
	}
	
	private static void showGUI(int access) {
		container.removeAll();
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(new JLabel(" "), BorderLayout.EAST);
		frame.getContentPane().add(new JLabel(" "), BorderLayout.WEST);
		System.out.println(access);
		if (access == 0) { // log on
			frame.getContentPane().add(new PanelSQL(), BorderLayout.NORTH);
			frame.getContentPane().add(new PanelLogon(), BorderLayout.CENTER);
		} else if (access == 10) {
			
		} else if (access == 20) {
		} else if (access == 40) {
		} else if (access == 60) {
		} else if (access == 80) {
			
		}			
		else {
			frame.getContentPane().add(new JLabel(" "), BorderLayout.NORTH);
			frame.getContentPane().add(new JLabel(" "), BorderLayout.CENTER);
		}
		frame.setVisible(true);
		container = frame.getContentPane();
	}

	@Test
	public static void testQuery() {
//		DatabaseMain.dbc.returnFromDatabase(DatabaseMain.dbc.accessDB(), 
	//			"SELECT * FROM person");
	}
	public static void query(String table, String where) {
		// if table is person get person
		// if table is customer return person and customer
		// if table is employee return person and employee
		// if table is 
		//System.out.println("Query Error: " + '\n' + "Table input: " + table + '\n' + "Condition: " + where);

		/*
		 * 
SELECT p.*, sol.*, so.*, c.*
FROM sales_order_event soe 
INNER JOIN sales_order so
ON (so.ident = soe.sales_order_ident)
INNER JOIN customer c
ON (c.Person_Account_No = so.Customer_Person_Account_No)
INNER JOIN sales_order_line sol
ON (sol.Sales_Order_Ident = so.Ident)
INNER JOIN product p
ON (P.Product_ID = sol.Product_ID)
ORDER BY so.ident;
		 */
	}

	public static void queryError(String table, String where) {
		System.out.println("Query Error: " + '\n' + "Table input: " + table + '\n' + "Condition: " + where);	
	}
}
