package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;
/**
 * Pyramid class that extends ShapeObject class.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class Pyramid extends ShapeObject
{
	private Double height;
	private Double length;
	/**
	 * Constructor for Pyramid class
	 * @param height Double value that represents the height of the Pyramid.
	 * @param length Double value that represents the length of the Pyramid.
	 */
	public Pyramid(Double height, Double length) 
	{
		super(height, getArea(length), getVolume(height, length));
		this.height = height;
		this.length = length;
	}
	
	/**
	 * Overriding the toString method.
	 * @returns A string containing the area, volume or height of the Pyramid.
	 */
	@Override
	public String toString()
	{
		if (AreaCompare.isUsed == true) 
		{
			return String.format("Pyramid: Area: %s",getArea(this.length));
		}
		else if (VolumeCompare.isUsed == true) 
		{
			return String.format("Pyramid: Volume: %s",getVolume(this.height,this.length));
		}
		else 
		{
			return String.format("Pyramid: Height: %s",this.height);
		}

	}
	/**
	 * Method to calculate the area of a Pyramid.
	 * @param length Double value representing the length of the Pyramid.
	 * @return Double value representing the area of the Pyramid.
	 */
	public static Double getArea(Double length) 
	{
		return Math.pow(length,2);
	}
	/**
	 * Method to calculate the volume of a Pyramid.
	 * @param height Double value representing the height of the Pyramid.
	 * @param length Double value representing the length of the Pyramid.
	 * @return Double value representing the volume of the Pyramid.
	 */
	public static Double getVolume(Double height, Double length) 
	{
		return (Math.pow(length, 2) * height) * 1/3;
	}
}