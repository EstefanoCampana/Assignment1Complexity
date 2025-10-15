package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;
/**
 * OctagonalPrism class that extends ShapeObject class.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class OctagonalPrism extends ShapeObject
{
	//Private data
	private Double height;
	private Double length;
	/**
	 * Constructor for OctagonalPrism class
	 * @param height Double value that represents the height of the octagonal prism.
	 * @param length Double value that represents the length of the octagonal prism.
	 */
	public OctagonalPrism(Double height, Double length) 
	{
		super(height, getArea(length), getVolume(height, length));
		this.height = height;
		this.length = length;
	}
	
	/**
	 * Overriding the toString method.
	 * @returns A string containing the area, volume or height of the octagonal prism.
	 */
	@Override
	public String toString()
	{
		if (AreaCompare.isUsed == true) 
		{
			return String.format("OctagonalPrism: Area: %s",getArea(this.length));
		}
		else if (VolumeCompare.isUsed == true) 
		{
			return String.format("OctagonalPrism: Volume: %s",getVolume(this.height,this.length));
		}
		else 
		{
			return String.format("OctagonalPrism: Height: %s",this.height);
		}

	}
	/**
	 * Method to calculate the area of a octagonal prism.
	 * @param length Double value representing the length of the octagonal prism.
	 * @return Double value representing the area of the octagonal prism.
	 */
	public static Double getArea(Double length) 
	{
		return ((1 + Math.sqrt(2)) * Math.pow(length, 2)) * 2;
	}
	/**
	 * Method to calculate the volume of a octagonal prism.
	 * @param height Double value representing the height of the octagonal prism.
	 * @param length Double value representing the length of the octagonal prism.
	 * @return Double value representing the volume of the octagonal prism.
	 */
	public static Double getVolume(Double height, Double length) 
	{
		return getArea(length) * height;
	}
}
