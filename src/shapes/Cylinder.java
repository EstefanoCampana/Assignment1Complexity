package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;
/**
 * Cylinder class that extends ShapeObject class.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class Cylinder extends ShapeObject
{
	//Private data
	private Double height;
	private Double radius;
	
	/**
	 * Constructor for cylinder class
	 * @param height Double value that represents the height of the cylinder.
	 * @param radius Double value that represents the radius of the cylinder.
	 */
	public Cylinder(Double height, Double radius) 
	{
		super(height, getArea(radius), getVolume(height, radius));
		this.height = height;
		this.radius = radius;
	}
	
	/**
	 * Overriding the toString method.
	 * @returns A string containing the area, volume or height of the cylinder.
	 */
	@Override
	public String toString()
	{
		if (AreaCompare.isUsed == true) 
		{
			return String.format("Cylinder: Area: %s",getArea(this.radius));
		}
		else if (VolumeCompare.isUsed == true) 
		{
			return String.format("Cylinder: Volume: %s",getVolume(this.height,this.radius));
		}
		else 
		{
			return String.format("Cylinder: Height: %s",this.height);
		}

	}
	/**
	 * Method to calculate the area of a cylinder.
	 * @param radius Double value representing the radius of the cylinder.
	 * @return Double value representing the area of the cylinder.
	 */
	public static Double getArea(Double radius) 
	{
		return Math.PI * Math.pow(radius,2);
	}
	/**
	 * Method to calculate the volume of a cylinder.
	 * @param height Double value representing the height of the cylinder.
	 * @param radius Double value representing the radius of the cylinder.
	 * @return Double value representing the volume of the cylinder.
	 */
	public static Double getVolume(Double height, Double radius) 
	{
		return (Math.PI * Math.pow(radius, 2)) * height;
	}
}
