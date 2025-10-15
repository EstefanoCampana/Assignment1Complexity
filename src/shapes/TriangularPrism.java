package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;
/**
 * TriangularPrism class that extends ShapeObject class.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class TriangularPrism extends ShapeObject
{
	private Double height;
	private Double length;
	/**
	 * Constructor for TriangularPrism class
	 * @param height Double value that represents the height of the triangular prism.
	 * @param length Double value that represents the length of the triangular prism.
	 */
	public TriangularPrism(Double height, Double length) 
	{
		super(height, getArea(length), getVolume(height, length));
		this.height = height;
		this.length = length;
	}
	/**
	 * Overriding the toString method.
	 * @returns A string containing the area, volume or height of the triangular prism.
	 */
	@Override
	public String toString()
	{
		if (AreaCompare.isUsed == true) 
		{
			return String.format("TriangularPrism: Area: %s",getArea(this.length));
		}
		else if (VolumeCompare.isUsed == true) 
		{
			return String.format("TriangularPrism: Volume: %s",getVolume(this.height,this.length));
		}
		else 
		{
			return String.format("TriangularPrism: Height: %s",this.height);
		}
	}
	/**
	 * Method to calculate the area of a triangular prism.
	 * @param length Double value representing the length of the triangular prism.
	 * @return Double value representing the area of the triangular prism.
	 */
	public static Double getArea(Double length) 
	{
		return (Math.pow(length,2)*Math.sqrt(3)) / 4;
	}
	/**
	 * Method to calculate the volume of a triangular prism.
	 * @param height Double value representing the height of the triangular prism.
	 * @param length Double value representing the length of the triangular prism.
	 * @return Double value representing the volume of the triangular prism.
	 */
	public static Double getVolume(Double height, Double length) 
	{
		return getArea(length) * height;
	}
}