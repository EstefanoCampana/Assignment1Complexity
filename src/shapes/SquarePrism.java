package shapes;

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
		return String.format("SquarePrism: Height: %s",this.height);
		//return String.format("Volume: %s%n",getVolume(this.height,this.length)) +
		//String.format("Area: %s", getArea(this.length));
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

