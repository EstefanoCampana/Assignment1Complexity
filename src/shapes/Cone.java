package shapes;

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
		return String.format("Volume: %s%n",getVolume(this.height,this.radius)) +
		String.format("Area: %s", getArea(this.radius));
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
