package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;

/**
 * Cone class that extends ShapeObject class.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class Cone extends ShapeObject
{
	//Private data
	private Double height;
	private Double radius;
	
	/**
	 * Constructor for Cone class
	 * @param height Double value that represents the height of the cone.
	 * @param radius Double value that represents the radius of the cone.
	 */
	public Cone(Double height, Double radius) 
	{
		super(height, getArea(radius), getVolume(height, radius));
		this.height = height;
		this.radius = radius;
	}
	
	/**
	 * Overriding the toString method.
	 * @returns A string containing the area, volume or height of the cone.
	 */
	@Override
	public String toString()
	{
		if (AreaCompare.isUsed == true) 
		{
			return String.format("Cone: Area: %s",getArea(this.radius));
		}
		else if (VolumeCompare.isUsed == true) 
		{
			return String.format("Cone: Volume: %s",getVolume(this.height,this.radius));
		}
		else 
		{
			return String.format("Cone: Height: %s",this.height);
		}

	}
	
	/**
	 * Method to calculate the area of a cone.
	 * @param radius Double value representing the radius of the cone.
	 * @return Double value representing the area of the cone.
	 */
	public static Double getArea(Double radius) 
	{
		return Math.PI * Math.pow(radius,2);
	}
	
	/**
	 * Method to calculate the volume of a cone.
	 * @param height Double value representing the height of the cone.
	 * @param radius Double value representing the radius of the cone.
	 * @return Double value representing the volume of the cone.
	 */
	public static Double getVolume(Double height, Double radius) 
	{
		return (Math.PI * Math.pow(radius, 2) * height) * 1/3;
	}
}
