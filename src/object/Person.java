package object;

import java.util.Date;

public class Person
{
	private int accountNumber;
	private String title;
	private String firstName;
	private String lastName;
	private long contactNo;
	private String email;
	private char gender;
	private Date dateOfBirth;
	private Address homeAddress;
	
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
	 */
	public Person(int accountNumber, String title, String firstName,
			String lastName, long contactNo, String email, char gender,
			Date dateOfBirth, Address homeAddress)
	{
		this.accountNumber = accountNumber;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.email = email;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.homeAddress = homeAddress;
	}
	
	public Person(Person other) {
		this.accountNumber = other.accountNumber;
		this.title = other.title;
		this.firstName = other.firstName;
		this.lastName = other.lastName;
		this.contactNo = other.contactNo;
		this.email = other.email;
		this.gender = other.gender;
		this.dateOfBirth = other.dateOfBirth;
		this.homeAddress = other.homeAddress;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber()
	{
		return accountNumber;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	/**
	 * @return the contactNo
	 */
	public long getContactNo()
	{
		return contactNo;
	}
	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}
	/**
	 * @return the gender
	 */
	public char getGender()
	{
		return gender;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	/**
	 * @return the homeAddress
	 */
	public Address getHomeAddress()
	{
		return homeAddress;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	/**
	 * @param contactNo the contactNo to set
	 */
	public void setContactNo(long contactNo)
	{
		this.contactNo = contactNo;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @param homeAddress the homeAddress to set
	 */
	public void setHomeAddress(Address homeAddress)
	{
		this.homeAddress = homeAddress;
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
		if (obj == null)
		{
			return false;
		}
		if (!(obj instanceof Person))
		{
			return false;
		}
		Person other = (Person) obj;
		if (accountNumber != other.accountNumber)
		{
			return false;
		}
		if (contactNo != other.contactNo)
		{
			return false;
		}
		if (dateOfBirth == null)
		{
			if (other.dateOfBirth != null)
			{
				return false;
			}
		} else if (!dateOfBirth.equals(other.dateOfBirth))
		{
			return false;
		}
		if (email == null)
		{
			if (other.email != null)
			{
				return false;
			}
		} else if (!email.equals(other.email))
		{
			return false;
		}
		if (firstName == null)
		{
			if (other.firstName != null)
			{
				return false;
			}
		} else if (!firstName.equals(other.firstName))
		{
			return false;
		}
		if (gender != other.gender)
		{
			return false;
		}
		if (homeAddress == null)
		{
			if (other.homeAddress != null)
			{
				return false;
			}
		} else if (!homeAddress.equals(other.homeAddress))
		{
			return false;
		}
		if (lastName == null)
		{
			if (other.lastName != null)
			{
				return false;
			}
		} else if (!lastName.equals(other.lastName))
		{
			return false;
		}
		if (title == null)
		{
			if (other.title != null)
			{
				return false;
			}
		} else if (!title.equals(other.title))
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
		return "Person [accountNumber=" + accountNumber + ", title=" + title
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNo=" + contactNo + ", email=" + email + ", gender="
				+ gender + ", dateOfBirth=" + dateOfBirth + ", homeAddress="
				+ homeAddress + "]";
	}


}