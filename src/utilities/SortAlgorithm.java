package utilities;

import java.util.Arrays;
import java.util.Comparator;

import shapes.ShapeObject;

public class SortAlgorithm 
{
	public static <T> void merge(Comparable<T>[] unsortedArray, int left, int middle, int right) 
	{
		Comparable<T>[] firstHalf = Arrays.copyOfRange(unsortedArray, left, middle + 1);
		Comparable<T>[] secondHalf = Arrays.copyOfRange(unsortedArray, middle + 1, right + 1);
        int mainIndex = left, firstIndex = 0, secondIndex = 0;
            while (firstIndex < firstHalf.length && secondIndex < secondHalf.length) 
            {
                if ((((Comparable<T>)firstHalf[firstIndex]).compareTo( (T) secondHalf[secondIndex]) > 0)) {
                    unsortedArray[mainIndex] = firstHalf[firstIndex];
                    firstIndex++;
                }
                else {
                    unsortedArray[mainIndex] = secondHalf[secondIndex];
                    secondIndex++;
                }
                mainIndex++;
            }
        while (firstIndex < firstHalf.length) 
        {
            unsortedArray[mainIndex] = firstHalf[firstIndex];
            firstIndex++;
            mainIndex++;
        }

        while (secondIndex < secondHalf.length) 
        {
            unsortedArray[mainIndex] = secondHalf[secondIndex];
            secondIndex++;
            mainIndex++;
        }
	}
	
	public static <T> void merge(ShapeObject[] unsortedArray, int left, int middle, int right, Comparator<? super T> comparator) 
	{
		ShapeObject[] firstHalf = Arrays.copyOfRange(unsortedArray, left, middle + 1);
		ShapeObject[] secondHalf = Arrays.copyOfRange(unsortedArray, middle + 1, right + 1);

        int mainIndex = left, firstIndex = 0, secondIndex = 0;
        
        while (firstIndex < firstHalf.length && secondIndex < secondHalf.length) 
            {
        	
                if ((comparator.compare( (T) firstHalf[firstIndex], (T) secondHalf[secondIndex]) > 0)) {
                    unsortedArray[mainIndex] = firstHalf[firstIndex];
                    firstIndex++;
                }
                else {
                    unsortedArray[mainIndex] = secondHalf[secondIndex];
                    secondIndex++;
                }
                mainIndex++;
            }

        while (firstIndex < firstHalf.length) 
        {
            unsortedArray[mainIndex] = firstHalf[firstIndex];
            firstIndex++;
            mainIndex++;
        }

        while (secondIndex < secondHalf.length) 
        {
            unsortedArray[mainIndex] = secondHalf[secondIndex];
            secondIndex++;
            mainIndex++;
        }
	}
    public static <T> void mergeSort(Comparable<T>[] unsortedArray, int left, int right)
    {
            if (left < right) 
            {

                // Find the middle point
                int middle = left + (right - left) / 2;

                // Sort first and second halves
                mergeSort(unsortedArray, left, middle);
                mergeSort(unsortedArray, middle + 1, right);

                // Merge the sorted halves
                merge(unsortedArray, left, middle , right);
            }

    }
    
    public static <T> void mergeSort(ShapeObject[] unsortedArray, int left, int right, Comparator<? super T> comparator)
    {

            if (left < right) 
            {

                // Find the middle point
                int middle = left + (right - left) / 2;

                // Sort first and second halves
                mergeSort(unsortedArray, left, middle, comparator);
                mergeSort(unsortedArray, middle + 1, right, comparator);

                // Merge the sorted halves
                merge(unsortedArray, left, middle , right, comparator);
            }
     }
}
