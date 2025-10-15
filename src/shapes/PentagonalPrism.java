package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;
/**
 * PentagonalPrism class that extends ShapeObject class.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class PentagonalPrism extends ShapeObject
{
	//Private data
	private Double height;
	private Double length;
	
	/**
	 * Constructor for PentagonalPrism class
	 * @param height Double value that represents the height of the pentagonal prism.
	 * @param length Double value that represents the length of the pentagonal prism.
	 */
	public PentagonalPrism(Double height, Double length) 
	{
		super(height, getArea(length), getVolume(height, length));
		this.height = height;
		this.length = length;
	}
	
	/**
	 * Overriding the toString method.
	 * @returns A string containing the area, volume or height of the pentagonal prism.
	 */
	@Override
	public String toString()
	{
		if (AreaCompare.isUsed == true) 
		{
			return String.format("PentagonalPrism: Area: %s",getArea(this.length));
		}
		else if (VolumeCompare.isUsed == true) 
		{
			return String.format("PentagonalPrism: Volume: %s",getVolume(this.height,this.length));
		}
		else 
		{
			return String.format("PentagonalPrism: Height: %s",this.height);
		}
	}
	/**
	 * Method to calculate the area of a pentagonal prism.
	 * @param length Double value representing the length of the pentagonal prism.
	 * @return Double value representing the area of the pentagonal prism.
	 */
	public static Double getArea(Double length) 
	{
		return (5 * Math.pow(length,2) * Math.tan(0.942478)) / 4;
	}
	/**
	 * Method to calculate the volume of a pentagonal prism.
	 * @param height Double value representing the height of the pentagonal prism.
	 * @param length Double value representing the length of the pentagonal prism.
	 * @return Double value representing the volume of the pentagonal prism.
	 */
	public static Double getVolume(Double height, Double length) 
	{
		return getArea(length) * height;
	}
}
