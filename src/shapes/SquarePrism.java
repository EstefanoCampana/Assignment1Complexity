package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;
/**
 * SquarePrism class that extends ShapeObject class.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class SquarePrism extends ShapeObject
{
	private Double height;
	private Double length;
	/**
	 * Constructor for SquarePrism class
	 * @param height Double value that represents the height of the square prism.
	 * @param length Double value that represents the length of the square prism.
	 */
	public SquarePrism(Double height, Double length) 
	{
		super(height, getArea(length), getVolume(height, length));
		this.height = height;
		this.length = length;
	}
	/**
	 * Overriding the toString method.
	 * @returns A string containing the area, volume or height of the square prism.
	 */
	@Override
	public String toString()
	{
		if (AreaCompare.isUsed == true) 
		{
			return String.format("SquarePrism: Area: %s",getArea(this.length));
		}
		else if (VolumeCompare.isUsed == true) 
		{
			return String.format("SquarePrism: Volume: %s",getVolume(this.height,this.length));
		}
		else 
		{
			return String.format("SquarePrism: Height: %s",this.height);
		}
	}
	/**
	 * Method to calculate the area of a square prism.
	 * @param length Double value representing the length of the square prism.
	 * @return Double value representing the area of the square prism.
	 */
	public static Double getArea(Double length) 
	{
		return Math.pow(length,2);
	}
	/**
	 * Method to calculate the volume of a square prism.
	 * @param height Double value representing the height of the square prism.
	 * @param length Double value representing the length of the square prism.
	 * @return Double value representing the volume of the square prism.
	 */
	public static Double getVolume(Double height, Double length) 
	{
		return Math.pow(length, 2) * height;
	}
}
