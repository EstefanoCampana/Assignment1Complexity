package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;

public class PentagonalPrism extends ShapeObject
{
	private Double height;
	private Double length;
	
	public PentagonalPrism(Double height, Double length) 
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
	
	public static Double getArea(Double length) 
	{
		return (5 * Math.pow(length,2) * Math.tan(0.942478)) / 4;
	}
	
	public static Double getVolume(Double height, Double length) 
	{
		return getArea(length) * height;
	}
}
