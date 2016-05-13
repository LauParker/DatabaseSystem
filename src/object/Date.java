package object;

public class Date
{

	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}

	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year)
	{
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	/**
	 * @return the day
	 */
	public int getDay()
	{
		return day;
	}

	/**
	 * @return the month
	 */
	public int getMonth()
	{
		return month;
	}

	/**
	 * @return the year
	 */
	public int getYear()
	{
		return year;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day)
	{
		this.day = day;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month)
	{
		this.month = month;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year)
	{
		this.year = year;
	}
	
	
	
}
