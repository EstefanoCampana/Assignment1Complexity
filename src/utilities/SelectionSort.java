package utilities;

import java.util.Comparator;

import shapes.ShapeObject;

public class SelectionSort 
{
	public static <T> void selectionSort(Comparable<T>[] unsortedArray) 
	{
		for(int i = 0; i < unsortedArray.length; i++) 
		{
			int min = i;
			for(int j = i+1;j<unsortedArray.length;j++) 
			{
				if(((Comparable<T>)unsortedArray[j]).compareTo( (T) unsortedArray[min]) > 0)
				{
					min = j;
				}
			}
			
			Comparable<T> temp = unsortedArray[i];
			unsortedArray[i] = unsortedArray[min];
			unsortedArray[min] = temp;
		}
	}
    public static <T> void selectionSort(ShapeObject[] unsortedArray, Comparator<? super T> comparator)
    {
		for(int i = 0; i < unsortedArray.length; i++) 
		{
			int min = i;
			for(int j = i+1;j<unsortedArray.length;j++) 
			{
				if(comparator.compare((T) unsortedArray[j], (T) unsortedArray[min]) > 0)
				{
					min = j;
				}
			}
			
			ShapeObject temp = unsortedArray[i];
			unsortedArray[i] = unsortedArray[min];
			unsortedArray[min] = temp;
		}
    }
}
