package appDomain;
import java.util.Comparator;

import shapes.ShapeObject;

/**
 * Class used to compare the volumes of each ShapeObject object.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class VolumeCompare implements Comparator<ShapeObject>
{
	/**
	 * Boolean used to detect when the interface is being used, so the calculations can be different.
	 */
	public static boolean isUsed = false;
	/**
	 * Overriding the compare method inherited from the Comparator interface.
	 * @param thisObj Refers an object that extends the class ShapeObject.
	 * @param otherObj Refers an object that extends the class ShapeObject.
	 * @return 1 if the volume of this object is greater than the volume of other object.
	 * -1 if the volume of this object is lower than the volume of other object.
	 * 0 if both volumes are equal.
	 */
	@Override
	public int compare(ShapeObject thisObj, ShapeObject otherObj) 
	{
		isUsed = true;
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