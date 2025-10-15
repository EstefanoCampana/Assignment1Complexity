package shapes;

/**
 * ShapeObject abstract class that implements Comparable interface.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public abstract class ShapeObject implements Comparable<ShapeObject>
{
	//Private constructors
	private Double height;
	private Double area;
	private Double volume;
	
	/**
	 * ShapeObject constructor
	 * @param height Double value that represents the height of the shape.
	 * @param area Double value that represents the area of the shape.
	 * @param volume Double value that represents the area of the shape.
	 */
	public ShapeObject(Double height, Double area, Double volume) 
	{
		this.height = height;
		this.area = area;
		this.volume = volume;
	}
	
	/**
	 * @return Double value representing the height of the shape.
	 */
	public Double getHeight() 
	{
		return this.height;
	}
	/**
	 * @return Returns Double value representing the area of the shape.
	 */
	public Double getArea() 
	{
		return this.area;
	}
	/**
	 * @return Returns Double value representing the volume of the shape.
	 */
	public Double getVolume() 
	{
		return this.volume;
	}
	
	/**
	 * Overriding the compareTo method inherited from the Comparable interface.
	 * @return 1 if the height of this object is greater than the height of another object.
	 * -1 If the height of this object is lower than the height of another object. 
	 * 0 If both heights are equal.
	 * 
	 * @param other Another object of class ShapeObject.
	 */
	@Override
	public int compareTo(ShapeObject other) 
	{
		if(this.height > other.height) 
		{
			return 1;
		}
		else if(this.height < other.height) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	

}
