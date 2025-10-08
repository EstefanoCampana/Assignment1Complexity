package shapes;

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
		return String.format("OctagonalPrism: Height: %s",this.height);
		//return String.format("Volume: %s%n",getVolume(this.height,this.length)) +
		//String.format("Area: %s", getArea(this.length));
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
