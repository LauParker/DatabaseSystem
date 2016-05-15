package object;

import java.util.Date;

public class Employee extends Person
{
	private int payeNum;
	private double salary;
	private long emergancyContactNum;
	private String emergancyContactName;
	private Employee lineManager;
	private int accessLevel;
	private String department;
	private String logon;
	private String wordpass;
		
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
	 * @param payeNum
	 * @param salary
	 * @param emergancyContactNum
	 * @param emergancyContactName
	 * @param lineManager
	 * @param accessLevel
	 * @param department
	 * @param logon
	 * @param wordpass
	 */
	public Employee(int accountNumber, String title, String firstName,
			String lastName, long contactNo, String email, char gender,
			Date dateOfBirth, Address homeAddress, int payeNum, double salary,
			long emergancyContactNum, String emergancyContactName,
			int accessLevel, String department,
			String logon, String wordpass)
	{
		super(accountNumber, title, firstName, lastName, contactNo, email,
				gender, dateOfBirth, homeAddress);
		this.payeNum = payeNum;
		this.salary = salary;
		this.emergancyContactNum = emergancyContactNum;
		this.emergancyContactName = emergancyContactName;
		this.lineManager = null;
		this.accessLevel = accessLevel;
		this.department = department;
		this.logon = logon;
		this.wordpass = wordpass;
	}

	/**
	 * uses super clone and employee constructor
	 * @param superPerson
	 * @param payeNum
	 * @param salary
	 * @param emergancyContactNum
	 * @param emergancyContactName
	 * @param lineManager
	 * @param accessLevel
	 * @param department
	 * @param logon
	 * @param wordpass
	 */
	public Employee(Person superPerson, int payeNum, double salary,
			long emergancyContactNum, String emergancyContactName,
			Employee lineManager, int accessLevel, String department,
			String logon, String wordpass) {
		super(superPerson);
		this.payeNum = payeNum;
		this.salary = salary;
		this.emergancyContactNum = emergancyContactNum;
		this.emergancyContactName = emergancyContactName;
		this.lineManager = lineManager;
		this.accessLevel = accessLevel;
		this.department = department;
		this.logon = logon;
		this.wordpass = wordpass;		
	}

	/**
	 * @return the payeNum
	 */
	public int getPayeNum()
	{
		return payeNum;
	}

	/**
	 * @return the salary
	 */
	public double getSalary()
	{
		return salary;
	}

	/**
	 * @return the emergancyContactNum
	 */
	public long getEmergancyContactNum()
	{
		return emergancyContactNum;
	}

	/**
	 * @return the emergancyContactName
	 */
	public String getEmergancyContactName()
	{
		return emergancyContactName;
	}

	/**
	 * @return the lineManager
	 */
	public Employee getLineManager()
	{
		return lineManager;
	}

	/**
	 * @return the accessLevel
	 */
	public int getAccessLevel()
	{
		return accessLevel;
	}

	/**
	 * @return the department
	 */
	public String getDepartment()
	{
		return department;
	}

	/**
	 * @return the logon
	 */
	public String getLogon()
	{
		return logon;
	}


	/**
	 * @return the wordpass
	 */
	public String getWordpass()
	{
		return wordpass;
	}


	/**
	 * @param logon the logon to set
	 */
	public void setLogon(String logon)
	{
		this.logon = logon;
	}


	/**
	 * @param wordpass the wordpass to set
	 */
	public void setWordpass(String wordpass)
	{
		this.wordpass = wordpass;
	}


	/**
	 * @param payeNum the payeNum to set
	 */
	public void setPayeNum(int payeNum)
	{
		this.payeNum = payeNum;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	/**
	 * @param emergancyContactNum the emergancyContactNum to set
	 */
	public void setEmergancyContactNum(long emergancyContactNum)
	{
		this.emergancyContactNum = emergancyContactNum;
	}

	/**
	 * @param emergancyContactName the emergancyContactName to set
	 */
	public void setEmergancyContactName(String emergancyContactName)
	{
		this.emergancyContactName = emergancyContactName;
	}

	/**
	 * @param lineManager the lineManager to set
	 */
	public void setLineManager(Employee lineManager)
	{
		this.lineManager = lineManager;
	}

	/**
	 * @param accessLevel the accessLevel to set
	 */
	public void setAccessLevel(int accessLevel)
	{
		this.accessLevel = accessLevel;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department)
	{
		this.department = department;
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
		if (!(obj instanceof Employee))
		{
			return false;
		}
		Employee other = (Employee) obj;
		if (accessLevel != other.accessLevel)
		{
			return false;
		}
		if (department == null)
		{
			if (other.department != null)
			{
				return false;
			}
		} else if (!department.equals(other.department))
		{
			return false;
		}
		if (emergancyContactName == null)
		{
			if (other.emergancyContactName != null)
			{
				return false;
			}
		} else if (!emergancyContactName.equals(other.emergancyContactName))
		{
			return false;
		}
		if (emergancyContactNum != other.emergancyContactNum)
		{
			return false;
		}
		if (lineManager == null)
		{
			if (other.lineManager != null)
			{
				return false;
			}
		} else if (!lineManager.equals(other.lineManager))
		{
			return false;
		}
		if (logon == null)
		{
			if (other.logon != null)
			{
				return false;
			}
		} else if (!logon.equals(other.logon))
		{
			return false;
		}
		if (payeNum != other.payeNum)
		{
			return false;
		}
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
		{
			return false;
		}
		if (wordpass == null)
		{
			if (other.wordpass != null)
			{
				return false;
			}
		} else if (!wordpass.equals(other.wordpass))
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
		return "Employee [payeNum=" + payeNum + ", salary=" + salary
				+ ", emergancyContactNum=" + emergancyContactNum
				+ ", emergancyContactName=" + emergancyContactName
				+ ", lineManager=" + lineManager + ", accessLevel="
				+ accessLevel + ", department=" + department + ", logon="
				+ logon + ", wordpass=" + wordpass + "]";
	}
}
