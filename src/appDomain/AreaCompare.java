package appDomain;
import java.util.Comparator;

import shapes.ShapeObject;

public class AreaCompare implements Comparator<ShapeObject>
{
	@Override
	public int compare(ShapeObject thisObj, ShapeObject otherObj) 
	{
		if(thisObj.getArea() > otherObj.getArea()) 
		{
			return 1;
		}
		else if (thisObj.getArea() < otherObj.getArea()) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
}
