package shapes;

import appDomain.AreaCompare;
import appDomain.VolumeCompare;

public class Cone extends ShapeObject
{
	private Double height;
	private Double radius;
			
	public Cone(Double height, Double radius) 
	{
		super(height, getArea(radius), getVolume(height, radius));
		this.height = height;
		this.radius = radius;
	}
	
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
	
	public static Double getArea(Double radius) 
	{
		return Math.PI * Math.pow(radius,2);
	}
	
	public static Double getVolume(Double height, Double radius) 
	{
		return (Math.PI * Math.pow(radius, 2) * height) * 1/3;
	}
}
