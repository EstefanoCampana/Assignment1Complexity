package shapes;

public class Cone
{
	private Double height;
	private Double radius;
			
	public Cone(Double height, Double radius) 
	{	
		this.height = height;
		this.radius = radius;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s%n",getVolume(this.height,this.radius)) +
		String.format("%s", getArea(this.radius));
	}
	
	public Double getArea(Double radius) 
	{
		return Math.PI * Math.pow(radius,2);
	}
	
	public Double getVolume(Double height, Double radius) 
	{
		return (Math.PI * Math.pow(radius, 2) * height) * 1/3;
	}
}
