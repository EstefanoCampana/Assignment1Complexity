package shapes;
import java.util.Comparator;

public abstract class ShapeObject implements Comparable<ShapeObject>, Comparator<ShapeObject>
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
	
	@Override
	public int compareTo(ShapeObject other) 
	{
		return this.height.compareTo(other.height);
	}
	
	@Override
	public int compare(ShapeObject thisObj, ShapeObject otherObj) 
	{
		
		return Double.compare(thisObj.area, otherObj.area);
	}

}
