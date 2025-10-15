package utilities;

import java.util.Comparator;

import shapes.ShapeObject;

/**
 * Class to handle Selection Sorting algorithm.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class SelectionSort 
{
	/**
	 * Method in charge of comparing and sorting a value in an array with the maximum value found, using the compareTo method.
	 * @author Estefano Campana
	 * @version 13-10-2025
	 * @param <T> Represents a generic object.
	 * @param unsortedArray Array that implements the Comparable interface.
	 */
	public static <T extends Comparable<T>> void selectionSort(Comparable<T>[] unsortedArray) 
	{
		//for each element in the array
		for(int i = 0; i < unsortedArray.length; i++) 
		{
			//Assumes it helds the current maximum value
			int max = i;
			//Checks for each item after the aforementioned value.
			for(int j = i+1;j<unsortedArray.length;j++) 
			{
				//If it finds a greater value.
				if(((Comparable<T>)unsortedArray[j]).compareTo( (T) unsortedArray[max]) > 0)
				{
					//The index of this value is now the maximum value.
					max = j;
				}
			}
			//Swaps values.
			Comparable<T> temp = unsortedArray[i];
			unsortedArray[i] = unsortedArray[max];
			unsortedArray[max] = temp;
		}
	}
	/**
	 * Method in charge of comparing and sorting a value in an array with the maximum value found, using a comparator.
	 * @author Estefano Campana
	 * @version 13-10-2025
	 * @param <T> Represents a generic object.
	 * @param unsortedArray Array that implements the Comparable interface.
	 * @param comparator Object that inherits the Comparator interface, such as: VolumeCompare and AreaCompare.
	 */
    public static <T extends Comparable<T>> void selectionSort(ShapeObject[] unsortedArray, Comparator<? super T> comparator)
    {
    	//for each element in the array
		for(int i = 0; i < unsortedArray.length; i++) 
		{
			//Assumes it helds the current maximum value
			int max = i;
			//Checks for each item after the aforementioned value.
			for(int j = i+1;j<unsortedArray.length;j++) 
			{
				//If it finds a greater value.
				if(comparator.compare((T) unsortedArray[j], (T) unsortedArray[max]) > 0)
				{
					//The index of this value is now the maximum value.
					max = j;
				}
			}
			//Swaps values.
			ShapeObject temp = unsortedArray[i];
			unsortedArray[i] = unsortedArray[max];
			unsortedArray[max] = temp;
		}
    }
}
