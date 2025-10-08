package shapes;

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
		return String.format("Volume: %s%n",getVolume(this.height,this.length)) +
		String.format("Area: %s", getArea(this.length));
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
