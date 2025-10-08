package shapes;


public abstract class ShapeObject implements Comparable<ShapeObject>
{
	private Double height;
	private Double area;
	private Double volume;
	
	public ShapeObject(Double height, Double area, Double volume) 
	{
		this.height = height;
		this.area = area;
		this.volume = volume;
	}
	
	public Double getHeight() 
	{
		return this.height;
	}
	public Double getArea() 
	{
		return this.area;
	}
	public Double getVolume() 
	{
		return this.volume;
	}
	
	@Override
	public int compareTo(ShapeObject other) 
	{
		if(this.height > other.height) 
		{
			return 1;
		}
		else if(this.height < other.height) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
	

}
