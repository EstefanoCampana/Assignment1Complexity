package appDomain;
import java.util.Comparator;

import shapes.ShapeObject;

public class AreaCompare implements Comparator<ShapeObject>
{
	public static boolean isUsed = false;
	@Override
	public int compare(ShapeObject thisObj, ShapeObject otherObj) 
	{
		isUsed = true;
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
