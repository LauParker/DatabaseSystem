package object;

import java.util.Date;

public class Customer extends Person
{
	private int credit;
	private State state;

	
	/**
	 * @param accountNumber
	 * @param title
	 * @param firstName
	 * @param lastName
	 * @param contactNo
	 * @param email
	 * @param gender
	 * @param dateOfBirth
	 * @param homeAddress
	 * @param credit
	 * @param state
	 */
	public Customer(int accountNumber, String title, String firstName,
			String lastName, long contactNo, String email, char gender,
			Date dateOfBirth, Address homeAddress, int credit, State state)
	{
		super(accountNumber, title, firstName, lastName, contactNo, email,
				gender, dateOfBirth, homeAddress);
		this.credit = credit;
		this.state = state;
	}
	/**
	 * @return the credit
	 */
	public int getCredit()
	{
		return credit;
	}
	/**
	 * @return the state
	 */
	public State getState()
	{
		return state;
	}
	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit)
	{
		this.credit = credit;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(State state)
	{
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (!super.equals(obj))
		{
			return false;
		}
		if (!(obj instanceof Customer))
		{
			return false;
		}
		Customer other = (Customer) obj;
		if (credit != other.credit)
		{
			return false;
		}
		if (state == null)
		{
			if (other.state != null)
			{
				return false;
			}
		} else if (!state.equals(other.state))
		{
			return false;
		}
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Customer [credit=" + credit + ", state=" + state + "]";
	}
}