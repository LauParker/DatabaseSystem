package object;

import java.util.ArrayList;

public class NBGardens {

	private ArrayList<Employee> staff = new ArrayList<Employee>();
	private ArrayList<Product> stock = new ArrayList<Product>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public NBGardens(){
		staff = new ArrayList<Employee>();
		stock = new ArrayList<Product>();
		customers = new ArrayList<Customer>();
	}
	/******************* Getter methods *****************/
	/**
	 * @return the staff
	 */
	public ArrayList<Employee> getStaff() {
		return staff;
	}
	/**
	 * 
	 * @param index
	 * @return
	 */
	public Employee getStaff(int index) {
		return staff.get(index);
	}
	/**
	 * @return the stock
	 */
	public ArrayList<Product> getStock() {
		return stock;
	}
	/**
	 * 
	 * @param index
	 * @return the stock item
	 */
	public Product getStock(int index) {
		return stock.get(index);
	}
	/**
	 * @return the customers
	 */
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	/**
	 * 
	 * @param index
	 * @return the customer in the list
	 */
	public Customer getCustomer(int index) {
		return customers.get(index);
	}

	/******************* Add and reset methods *****************/
	/**
	 * @param staff the employee to add
	 */
	public void addStaff(Employee memeber) {
		staff.add(memeber);
	}
	/**
	 * reset staff list
	 */
	public void resetStaffList(){
		staff = new ArrayList<Employee>();
	}

	/**
	 * 
	 * @param Product to add to stock
	 */
	public void addToStock(Product tempProduct) {
		stock.add(tempProduct);
	}
	/**
	 * reset stock list
	 */
	public void resetStock() {
		stock = new ArrayList<Product>();
	}

	/**
	 * 
	 * @param customer to add to list
	 */
	public void addCustomers(Customer tempCustomer) {
		customers.add(tempCustomer);
	}
	/**
	 * reset customer
	 */
	public void resetCustomer() {
		customers = new ArrayList<Customer>();
	}
}
