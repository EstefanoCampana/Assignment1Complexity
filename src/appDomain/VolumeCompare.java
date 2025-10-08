package appDomain;
import java.util.Comparator;

import shapes.ShapeObject;

public class VolumeCompare implements Comparator<ShapeObject>
{
	@Override
	public int compare(ShapeObject thisObj, ShapeObject otherObj) 
	{
		if(thisObj.getVolume() > otherObj.getVolume()) 
		{
			return 1;
		}
		else if (thisObj.getVolume() < otherObj.getVolume()) 
		{
			return -1;
		}
		else 
		{
			return 0;
		}
	}
}