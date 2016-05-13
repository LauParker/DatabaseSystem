package object;

public class Address
{

	private String houseNameNum;
	private String firstLine;
	private String secondLine;
	private String town;
	private String city;
	private String county;
	private String postcode;
	private String country;
	/**
	 * @param houseNameNum
	 * @param postcode
	 */
	public Address(String houseNameNum, String postcode)
	{
		this.houseNameNum = houseNameNum;
		this.postcode = postcode;
	}
	/**
	 * @param houseNameNum
	 * @param firstLine
	 * @param secondLine
	 * @param thridLine
	 * @param city
	 * @param county
	 * @param postcode
	 * @param country
	 */
	public Address(String houseNameNum, String firstLine, String secondLine,
			String town, String city, String county, String postcode,
			String country)
	{
		this.houseNameNum = houseNameNum;
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.town = town;
		this.city = city;
		this.county = county;
		this.postcode = postcode;
		this.country = country;
	}
	
	/**
	 * Clone constructor
	 * @param other
	 */
	public Address(Address other) {
		this.houseNameNum = other.houseNameNum;
		this.firstLine = other.firstLine;
		this.secondLine = other.secondLine;
		this.town = other.town;
		this.city = other.city;
		this.county = other.county;
		this.postcode = other.postcode;
		this.country = other.country;
	}
	/**
	 * @return the houseNameNum
	 */
	public String getHouseNameNum()
	{
		return houseNameNum;
	}
	/**
	 * @return the firstLine
	 */
	public String getFirstLine()
	{
		return firstLine;
	}
	/**
	 * @return the secondLine
	 */
	public String getSecondLine()
	{
		return secondLine;
	}
	/**
	 * @return the thridLine
	 */
	public String getTown()
	{
		return town;
	}
	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * @return the county
	 */
	public String getCounty()
	{
		return county;
	}
	/**
	 * @return the postcode
	 */
	public String getPostcode()
	{
		return postcode;
	}
	/**
	 * @return the country
	 */
	public String getCountry()
	{
		return country;
	}
	/**
	 * @param houseNameNum the houseNameNum to set
	 */
	public void setHouseNameNum(String houseNameNum)
	{
		this.houseNameNum = houseNameNum;
	}
	/**
	 * @param firstLine the firstLine to set
	 */
	public void setFirstLine(String firstLine)
	{
		this.firstLine = firstLine;
	}
	/**
	 * @param secondLine the secondLine to set
	 */
	public void setSecondLine(String secondLine)
	{
		this.secondLine = secondLine;
	}
	/**
	 * @param thridLine the thridLine to set
	 */
	public void setTown(String town) {
		this.town = town;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
	/**
	 * copy other address into current address
	 * @param other
	 */
	public void copyAddress(Address other){
		this.houseNameNum = other.houseNameNum;
		this.firstLine = other.firstLine;
		this.secondLine = other.secondLine;
		this.town = other.town;
		this.city = other.city;
		this.county = other.county;
		this.postcode = other.postcode;
		this.country = other.country;
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
		if (!(obj instanceof Address))
		{
			return false;
		}
		Address other = (Address) obj;
		if (city == null)
		{
			if (other.city != null)
			{
				return false;
			}
		} else if (!city.equals(other.city))
		{
			return false;
		}
		if (country == null)
		{
			if (other.country != null)
			{
				return false;
			}
		} else if (!country.equals(other.country))
		{
			return false;
		}
		if (county == null)
		{
			if (other.county != null)
			{
				return false;
			}
		} else if (!county.equals(other.county))
		{
			return false;
		}
		if (firstLine == null)
		{
			if (other.firstLine != null)
			{
				return false;
			}
		} else if (!firstLine.equals(other.firstLine))
		{
			return false;
		}
		if (houseNameNum == null)
		{
			if (other.houseNameNum != null)
			{
				return false;
			}
		} else if (!houseNameNum.equals(other.houseNameNum))
		{
			return false;
		}
		if (postcode == null)
		{
			if (other.postcode != null)
			{
				return false;
			}
		} else if (!postcode.equals(other.postcode))
		{
			return false;
		}
		if (secondLine == null)
		{
			if (other.secondLine != null)
			{
				return false;
			}
		} else if (!secondLine.equals(other.secondLine))
		{
			return false;
		}
		if (town == null)
		{
			if (other.town != null)
			{
				return false;
			}
		} else if (!town.equals(other.town))
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
		return "Address [houseNameNum=" + houseNameNum + ", firstLine="
				+ firstLine + ", secondLine=" + secondLine + ", town="
				+ town + ", city=" + city + ", county=" + county
				+ ", postcode=" + postcode + ", country=" + country + "]";
	}
}
