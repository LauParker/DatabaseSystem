package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import object.Address;
import object.Customer;
import object.Employee;
import object.Product;
import object.State;



public class DatabaseController {

	private static final String JDBC_Driver = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/mydb";
	private static final String USER = "root";
	private static final String PASS = "mimjwk";
	private Connection conn = null;

	/**
	 * connect to database and return connection
	 * @return connection to DB
	 */
	private Connection accessDB() {
		if (conn != null) {
			closeConnection(conn);
		}
		try {
			Class.forName(JDBC_Driver);
			System.out.println("Attempting connection...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			return conn;
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
			System.out.println("Unable to open connection to DB.");
		}
		return conn;
	}
	
	/**
	 * insert record to DB
	 * @param conn
	 * @param table
	 * @param values
	 */
	public void insertToDatabase(Connection conn, String table, String values) {
		Statement statement = null;
		System.out.println("inserting to Database...");
		try {
			statement = conn.createStatement();
			String sql = "INSERT IGNORE INTO " + table 
					+ " VALUES(" + values;
			statement.executeUpdate(sql);
			System.out.println("Inserted to table: " + table 
					+ " , values: " + values);
		} catch (SQLException SQLExcep)	{
			SQLExcep.printStackTrace();
		} finally {
//			closeConnection(conn);
		}
	}
	
	/**
	 * get all information of all staff (HR view) // also used for log on , 
	 * 									could have updated method to just return 
	 * 									payrole user and password and check against that. 
	 * @return
	 */
	public void getHumanResourcesView() {
		if (conn == null) {
			conn = accessDB();
		}
		Statement statement = null;
		System.out.println("building statement...");
		String sql = "SELECT per.*, emp.*, ad.* FROM person per "
				+ "INNER JOIN employee emp ON (per.account_no = emp.person_account_no) "
				+ "INNER JOIN address ad ON ((per.address_postcode = ad.postcode) & "
				+ "(per.address_house_name_no = ad.house_name_no));";
		try	{
			statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Address tempAddress = new Address(
						result.getString("house_name_no"), 
						result.getString("first_line"),
						result.getString("second_line"), 
						result.getString("town"), 
						result.getString("city"), 
						result.getString("county"),
						result.getString("postcode"), 
						result.getString("county"));
				Employee tempEmployee = new Employee(
						result.getInt("Account_No"), 
						result.getString("Title"), 
						result.getString("First_Name"),
						result.getString("Last_Name"), 
						Long.parseLong(result.getString("Contact_No")),
						result.getString("E_Mail"),
						result.getString("Gender").charAt(0),
						result.getDate("Date_Of_Birth"),
						tempAddress,
						result.getInt("Payrole_No"),
						result.getDouble("Salary_Hour_Rate"),
						Long.parseLong(result.getString("Emergancy_Contact_No")),
						result.getString("Emergancy_Contact_Name"), //TODO Employee line manager
						result.getInt("Access_Level"),
						result.getString("Department"),
						result.getString("logon"),
						result.getString("password"));
				DatabaseMain.getNbGardens().addStaff(tempEmployee);
				//return result;
			}
		} catch (SQLException SQLExcep)	{
			SQLExcep.printStackTrace();
		} finally {
			closeConnection(conn);
		}
	}

	/**
	 * Get Customer details (Account view)
	 */
	public void getAccountView() {
		if (conn == null) {
			conn = accessDB();
		}
		Statement statement = null;
		System.out.println("building statement...");
		String sql = "SELECT p.*,c.*,a.* FROM person p INNER JOIN customer c "
				+ "ON (c.Person_Account_No = p.Account_No) "
				+ "INNER JOIN address a ON ((p.address_postcode = a.postcode) "
				+ "& (p.address_house_name_no = a.house_name_no));";
		try {
			statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {			
				Address tempAddress = new Address(
						result.getString("house_name_no"), 
						result.getString("first_line"),
						result.getString("second_line"), 
						result.getString("town"), 
						result.getString("city"), 
						result.getString("county"),
						result.getString("postcode"), 
						result.getString("county"));
				Customer temp = new Customer(
						result.getInt("Account_No"), 
						result.getString("Title"), 
						result.getString("First_Name"),
						result.getString("Last_Name"), 
						Long.parseLong(result.getString("Contact_No")),
						result.getString("E_Mail"),
						result.getString("Gender").charAt(0),
						result.getDate("Date_Of_Birth"),
						tempAddress,
						result.getInt("Credit"), new State().getStateFromString(result.getString("Sate")));
				DatabaseMain.getNbGardens().addCustomers(temp);
			}
		} catch (SQLException SQLExcep)	{
			SQLExcep.printStackTrace();
		} finally {
			closeConnection(conn);
		}
	}
	
	/**
	 * Get all active products and customers (sales view) 
	 */
	public void getSalesView() { 
		if (conn == null) {
			conn = accessDB();
		}
		Statement statement = null;
		System.out.println("building statement...");
		String sql = "SELECT * FROM product;";
		try	{
			statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Product tempProduct = new Product(
						result.getInt("Product_ID"),
						result.getString("Name"),
						result.getString("Description"),
						result.getFloat("Procurment_Price"),
						result.getFloat("Selling_Price"),
						result.getInt("Height"),
						result.getInt("Width"),
						result.getInt("Weight"),
						result.getInt("Quantity"),
						result.getString("Warehouse_Location"),
						result.getString("Product_State_Name"));
				DatabaseMain.getNbGardens().addToStock(tempProduct);
			}
		} catch (SQLException SQLExcep)	{
			SQLExcep.printStackTrace();
		}
		
		getAccountView();
/*		sql = "SELECT p.*,c.*,a.* FROM person p INNER JOIN customer c "
				+ "ON (c.Person_Account_No = p.Account_No) "
				+ "INNER JOIN address a ON ((p.address_postcode = a.postcode) "
				+ "& (p.address_house_name_no = a.house_name_no));";
		try {
			statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {			
				Address tempAddress = new Address(
						result.getString("house_name_no"), 
						result.getString("first_line"),
						result.getString("second_line"), 
						result.getString("town"), 
						result.getString("city"), 
						result.getString("county"),
						result.getString("postcode"), 
						result.getString("county"));
				Customer temp = new Customer(
						result.getInt("Account_No"), 
						result.getString("Title"), 
						result.getString("First_Name"),
						result.getString("Last_Name"), 
						Long.parseLong(result.getString("Contact_No")),
						result.getString("E_Mail"),
						result.getString("Gender").charAt(0),
						result.getDate("Date_Of_Birth"),
						tempAddress,
						result.getInt("Credit"), new State().getStateFromString(result.getString("Sate")));
				DatabaseMain.getNbGardens().addCustomers(temp);
			}
		} catch (SQLException SQLExcep)	{
			SQLExcep.printStackTrace();
		} finally {
			closeConnection(conn);
		} */
	}
	
	/**
	 * Warehouse view
	 * orders to be picked 
	 */
	
	
	/**
	 * update a record in database
	 * @param conn
	 * @param table
	 * @param attribute
	 * @param value
	 * @param where
	 */
	public void updateDatabase(Connection conn, String table, String attribute, String value, String where) {
		Statement statement = null;
		System.out.println("inserting to Database...");
		try {
			statement = conn.createStatement();
			String sql = "UPDATE " + table + " SET " + attribute + " = " + value + " WHERE " 
					+ where;
			statement.executeUpdate(sql);
			System.out.println("Updated table: " + table + ", values: " + value + ", where: " + where);
		} catch (SQLException SQLExcep)	{
			SQLExcep.printStackTrace();
		} finally {
			closeConnection(conn);
		}
	}
	
	/**
	 * close database connection
	 * @param con
	 */
	private void closeConnection(Connection con) {
		if (con != null) {
			try	{
				con.close();
				System.out.println("connection closed");
			} catch (SQLException SQLExcep)	{
				System.out.println("Unable to close connection. Connection already closed or unable to close connection.");
				SQLExcep.printStackTrace();
			}			
		}		
	}

	@Test
	/**
	 * get a return from all the tables in the database
	 */
	public void testAllReturn() {
		// TODO Auto-generated method stub
		
	}
}
