package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;

public class TriangularPrism extends ShapeObject
{
	private Double height;
	private Double length;
	
	public TriangularPrism(Double height, Double length) 
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
	
	public static Double getArea(Double length) 
	{
		return (Math.pow(length,2)*Math.sqrt(3)) / 4;
	}
	
	public static Double getVolume(Double height, Double length) 
	{
		return getArea(length) * height;
	}
}