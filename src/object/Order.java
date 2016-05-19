package object;

public class Order
{
	private Customer customer;
// 	private ArrayList<Product> orderLine = new ArrayList<Product>();
//	private ArrayList<OrderEvent> orderEvent = new ArrayList<OrderEvent>();
	private String[][] orderLine;
	private String[][] orderEvent; 
	private Address address;
	private boolean purchase;
	/**
	 * @param customer
	 * @param orderLine
	 * @param orderEvent
	 * @param address
	 */
	public Order(Customer customer, String[][] orderLine,
			String[][] orderEvent, Address address, boolean purchase)
	{
		super();
		this.customer = customer;
		this.orderLine = orderLine;
		this.orderEvent = orderEvent;
		this.address = address;
		this.purchase = purchase;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer()
	{
		return customer;
	}
	/**
	 * @return the orderLine
	 */
	public String[][] getOrderLine()
	{
		return orderLine;
	}
	/**
	 * @return the orderEvent
	 */
	public String[][] getOrderEvent()
	{
		return orderEvent;
	}
	/**
	 * @return the address
	 */
	public Address getAddress()
	{
		return address;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	/**
	 * @param orderLine the orderLine to set
	 */
	public void setOrderLine(String[][] orderLine)
	{
		// 	TODO posible to check if the product has beeen added already 
		this.orderLine = orderLine;
	}
	/**
	 * @param orderEvent the orderEvent to set
	 */
	public void setOrderEvent(String[][] orderEvent)
	{
		// 	TODO posible to check if the event has beeen added already 
		this.orderEvent = orderEvent;
		
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address)
	{
		this.address = address;
	}
	/**
	 * @return the purchase
	 */
	public boolean isPurchase()
	{
		return purchase;
	}
	/**
	 * @param purchase the purchase to set
	 */
	public void setPurchase(boolean purchase)
	{
		this.purchase = purchase;
	}
}
