package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;

public class SquarePrism extends ShapeObject
{
	private Double height;
	private Double length;
	
	public SquarePrism(Double height, Double length) 
	{
		super(height, getArea(length), getVolume(height, length));
		this.height = height;
		this.length = length;
	}
	
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
	
	public static Double getArea(Double length) 
	{
		return Math.pow(length,2);
	}
	
	public static Double getVolume(Double height, Double length) 
	{
		return Math.pow(length, 2) * height;
	}
}
