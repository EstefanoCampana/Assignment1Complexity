package utilities;

import java.util.Arrays;
import java.util.Comparator;

import shapes.ShapeObject;

/**
 * Class to handle Merge Sorting algorithm.
 * @author Estefano Campana
 * @version 13-10-2025
 */
public class MergeSort
{
	/**
	 * Method in charge of merging two pieces of an array, using the compareTo method.
	 * @author Estefano Campana
	 * @version 13-10-2025
	 * @param <T> Represents a generic object.
	 * @param unsortedArray Array that implements the Comparable interface.
	 * @param left Integer value that represents the left portion of the unsorted array.
	 * @param middle Integer value that represents the middle of the unsorted array.
	 * @param right Integer value that represents the right portion of the unsorted array.
	 */
	public static <T> void merge(Comparable<T>[] unsortedArray, int left, int middle, int right) 
	{
		//Initializing the two unsorted portions of the array.
		Comparable<T>[] firstHalf = Arrays.copyOfRange(unsortedArray, left, middle + 1);
		Comparable<T>[] secondHalf = Arrays.copyOfRange(unsortedArray, middle + 1, right + 1);
		//Initializing the values of the indexes.
        int mainIndex = left, firstIndex = 0, secondIndex = 0;
        //While the first and second indexes are less than the length of the portion of the array they are sorting.
            while (firstIndex < firstHalf.length && secondIndex < secondHalf.length) 
            {
            	//If the object on the first half of the array is greater than the other object in the other half.
                if ((((Comparable<T>)firstHalf[firstIndex]).compareTo( (T) secondHalf[secondIndex]) > 0)) {
                	//The new position of this element will be equivalent to how many times this while loop has iterated.
                    unsortedArray[mainIndex] = firstHalf[firstIndex];
                    //Check the next element of the first half.
                    firstIndex++;
                }
                else {
                	//The new position of this element will be equivalent to how many this condition has been met.
                    unsortedArray[mainIndex] = secondHalf[secondIndex];
                    //Check the next element of the second half.
                    secondIndex++;
                }
                //Move to the next element in the sorted array.
                mainIndex++;
            }
        //If there are still elements in the first half of the array.
        while (firstIndex < firstHalf.length) 
        {
            unsortedArray[mainIndex] = firstHalf[firstIndex];
            firstIndex++;
            mainIndex++;
        }
        //If there are still elements in the second half of the array/
        while (secondIndex < secondHalf.length) 
        {
            unsortedArray[mainIndex] = secondHalf[secondIndex];
            secondIndex++;
            mainIndex++;
        }
	}
	
	/**
	 * Method in charge of merging two pieces of an array based on a comparator, using the compare method.
	 * @author Estefano Campana
	 * @version 13-10-2025
	 * @param <T> Represents a generic object.
	 * @param unsortedArray Array that implements the Comparable interface.
	 * @param left Integer value that represents the left portion of the unsorted array.
	 * @param middle Integer value that represents the middle of the unsorted array.
	 * @param right Integer value that represents the right portion of the unsorted array.\
	 * @param comparator Object that inherits the Comparator interface, such as: VolumeCompare and AreaCompare
	 */
	public static <T> void merge(ShapeObject[] unsortedArray, int left, int middle, int right, Comparator<? super T> comparator) 
	{
		//Initializing the two unsorted portions of the array.
		ShapeObject[] firstHalf = Arrays.copyOfRange(unsortedArray, left, middle + 1);
		ShapeObject[] secondHalf = Arrays.copyOfRange(unsortedArray, middle + 1, right + 1);
		//Initializing the values of the indexes.
        int mainIndex = left, firstIndex = 0, secondIndex = 0;
        //While the first and second indexes are less than the length of the portion of the array they are sorting.
        while (firstIndex < firstHalf.length && secondIndex < secondHalf.length) 
            {
        	//If the object on the first half of the array is greater than the other object in the other half.
                if ((comparator.compare( (T) firstHalf[firstIndex], (T) secondHalf[secondIndex]) > 0)) {
                	//The new position of this element will be equivalent to how many times this while loop has iterated.
                    unsortedArray[mainIndex] = firstHalf[firstIndex];
                    //Move to the next element in the first half.
                    firstIndex++;
                }
                else {
                	//The new position of this element will be equivalent to how many times this while loop has iterated.
                    unsortedArray[mainIndex] = secondHalf[secondIndex];
                  //Move to the next element in the second half.
                    secondIndex++;
                }
              //Move to the next element in the sorted array.
                mainIndex++;
            }

      //If there are still elements in the first half of the array.
        while (firstIndex < firstHalf.length) 
        {
            unsortedArray[mainIndex] = firstHalf[firstIndex];
            firstIndex++;
            mainIndex++;
        }

      //If there are still elements in the second half of the array.
        while (secondIndex < secondHalf.length) 
        {
            unsortedArray[mainIndex] = secondHalf[secondIndex];
            secondIndex++;
            mainIndex++;
        }
	}
	/**
	 * Method in charge of comparing and sorting sorting two parts of an unsorted array.
	 * @author Estefano Campana
	 * @version 13-10-2025
	 * @param <T> Represents a generic object.
	 * @param unsortedArray Array that implements the Comparable interface.
	 * @param left Integer value that represents the value to compare.
	 * @param right Integer value that represents the target value to compare.
	 */
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
	/**
	 * Method in charge of comparing and sorting two parts of an unsorted array, using a comparator.
	 * @author Estefano Campana
	 * @version 13-10-2025
	 * @param <T> Represents a generic object.
	 * @param unsortedArray Array that implements the Comparable interface.
	 * @param left Integer value that represents the value to compare.
	 * @param right Integer value that represents the target value to compare.
	 * @param comparator Object that inherits the Comparator interface, such as: VolumeCompare and AreaCompare
	 */
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
