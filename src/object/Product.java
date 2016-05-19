package object;

public class Product {
	
	private int id;
	private String name;
	private String description;
	private float procurment;
	private float sellAt;
	private int height, width, weight, quantity;
	private String warehouseLoc;
	private String state;


	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param procurment
	 * @param sellAt
	 * @param height
	 * @param width
	 * @param weight
	 * @param quantity
	 * @param warehouseLoc
	 * @param state
	 */
	public Product(int id, String name, String description, float procurment,
			float sellAt, int height, int width, int weight, int quantity,
			String warehouseLoc, String state)
	{
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.procurment = procurment;
		this.sellAt = sellAt;
		this.height = height;
		this.width = width;
		this.weight = weight;
		this.quantity = quantity;
		this.warehouseLoc = warehouseLoc;
		this.state = state;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * @return the procurment
	 */
	public float getProcurment()
	{
		return procurment;
	}
	/**
	 * @return the sellAt
	 */
	public float getSellAt()
	{
		return sellAt;
	}
	/**
	 * @return the height
	 */
	public int getHeight()
	{
		return height;
	}
	/**
	 * @return the width
	 */
	public int getWidth()
	{
		return width;
	}
	/**
	 * @return the weight
	 */
	public int getWeight()
	{
		return weight;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity()
	{
		return quantity;
	}
	/**
	 * @return the warehouseLoc
	 */
	public String getWarehouseLoc()
	{
		return warehouseLoc;
	}
	/**
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	/**
	 * @param procurment the procurment to set
	 */
	public void setProcurment(float procurment)
	{
		this.procurment = procurment;
	}
	/**
	 * @param sellAt the sellAt to set
	 */
	public void setSellAt(float sellAt)
	{
		this.sellAt = sellAt;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height)
	{
		this.height = height;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width)
	{
		this.width = width;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	/**
	 * @param warehouseLoc the warehouseLoc to set
	 */
	public void setWarehouseLoc(String warehouseLoc)
	{
		this.warehouseLoc = warehouseLoc;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
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
		if (!(obj instanceof Product))
		{
			return false;
		}
		Product other = (Product) obj;
		if (description == null)
		{
			if (other.description != null)
			{
				return false;
			}
		} else if (!description.equals(other.description))
		{
			return false;
		}
		if (height != other.height)
		{
			return false;
		}
		if (id != other.id)
		{
			return false;
		}
		if (name == null)
		{
			if (other.name != null)
			{
				return false;
			}
		} else if (!name.equals(other.name))
		{
			return false;
		}
		if (Float.floatToIntBits(procurment) != Float
				.floatToIntBits(other.procurment))
		{
			return false;
		}
		if (quantity != other.quantity)
		{
			return false;
		}
		if (Float.floatToIntBits(sellAt) != Float.floatToIntBits(other.sellAt))
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
		if (warehouseLoc == null)
		{
			if (other.warehouseLoc != null)
			{
				return false;
			}
		} else if (!warehouseLoc.equals(other.warehouseLoc))
		{
			return false;
		}
		if (weight != other.weight)
		{
			return false;
		}
		if (width != other.width)
		{
			return false;
		}
		return true;
	}
	/* 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Product [name=" + name + ", description=" + description
				+ ", procurment=" + procurment + ", sellAt=" + sellAt
				+ ", height=" + height + ", width=" + width + ", weight="
				+ weight + ", quantity=" + quantity + ", warehouseLoc="
				+ warehouseLoc + ", State=" + state + "]";
	}
}
