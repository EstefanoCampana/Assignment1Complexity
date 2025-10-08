package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;

public class OctagonalPrism extends ShapeObject
{
	private Double height;
	private Double length;
	
	public OctagonalPrism(Double height, Double length) 
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
	
	public static Double getArea(Double length) 
	{
		return ((1 + Math.sqrt(2)) * Math.pow(length, 2)) * 2;
	}
	
	public static Double getVolume(Double height, Double length) 
	{
		return getArea(length) * height;
	}
}
