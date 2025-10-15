package utilities;
import java.util.Comparator;

/**
 * Implements the QuickSort algorithm for sorting arrays.
 * Supports both natural ordering and custom comparators.
 * @author Riley Yonda
 * @version 13-10-2025
 */

public class QuickSort {

		/**
	 * Sorts an array using QuickSort with natural ordering (Comparable).
	 * @param <T> A generic type that implements Comparable.
	 * @param unsortedArray The array to sort.
	 * @param startOfIndex The starting index of the range to sort.
	 * @param endOfIndex The ending index of the range to sort.
	 */
	
	public static <T extends Comparable<T>> void quickSort(T[] unsortedArray, int startOfIndex, int endOfIndex)
	{
		// Choosing the last item of the array as the pivot
		T pivot = unsortedArray[endOfIndex];
		// Create left and right pointers
		int moveRight = startOfIndex;
		int moveLeft = endOfIndex;
		// Stop if the pointers have crossed
		if (moveRight >= moveLeft) {
			return;
		}
		// Otherwise, start partitioning
		else {
			// Continue until the two pointers cross
			while (moveRight <= moveLeft){
				// Move right pointer forward while element is greater than the pivot
				while (moveRight <= moveLeft && unsortedArray[moveRight].compareTo(pivot) > 0){
					moveRight++; //keep moving right
				}
				// Move left pointer backward while element is smaller than the pivot
				while (moveLeft >= moveRight && unsortedArray[moveLeft].compareTo(pivot) < 0){
					moveLeft--; //keep moving left
				}
				// Swap elements if pointers haven't crossed
				if (moveRight <= moveLeft) {
					swap(unsortedArray, moveRight, moveLeft); // swap out of place elements
					moveRight++; // move right pointer forward after swap
					moveLeft--; // move left pointer backward after swap
				}
			}
				
		}
		// Recursively sort the two partitions
		quickSort(unsortedArray,moveRight,endOfIndex); // sorting the right side of pivot
		quickSort(unsortedArray,startOfIndex,moveLeft); // sorting left side of pivot
	}

	/**
	 * Sorts an array using QuickSort with a custom comparator.
	 * @param <T> A generic type.
	 * @param unsortedArray The array to sort.
	 * @param startOfIndex The starting index of the range to sort.
	 * @param endOfIndex The ending index of the range to sort.
	 * @param comparator A Comparator that defines custom sorting logic (e.g., VolumeCompare, AreaCompare).
	 */
	
	public static <T> void quickSort(T[] unsortedArray, int startOfIndex, int endOfIndex, Comparator<? super T> comparator)
	{

		// Choose the last element as the pivot
		T pivot = unsortedArray[endOfIndex];
		// Create left and right pointers
		int moveRight = startOfIndex;
		int moveLeft = endOfIndex;

		// Stop if the pointers have crossed
		if (moveRight >= moveLeft) {
			return;
		}
		// Otherwise, partition using the comparator
		else {
			// Continue until the two pointers cross
			while (moveRight <= moveLeft){
				// Move right pointer forward while element is greater than the pivot (based on comparator)
				while (moveRight <= moveLeft && comparator.compare(unsortedArray[moveRight], pivot) > 0){
					moveRight++;
				}
				// Move left pointer backward while element is smaller than the pivot (based on comparator)
				while (moveLeft >= moveRight && comparator.compare(unsortedArray[moveLeft], pivot) < 0){
					moveLeft--;
				}
				// if pointers haven't crossed yet, swap the elements at both pointers
				if (moveRight <= moveLeft) {
					swap(unsortedArray, moveRight, moveLeft); // swap out of place elements
					moveRight++; // move right pointer forward after swap
					moveLeft--; // move left pointer backward after swap
				}
			}
		}
		// Recursively sort the two partitions using the comparator
		quickSort(unsortedArray, moveRight, endOfIndex, comparator); // sorting the right partition 
    	quickSort(unsortedArray, startOfIndex, moveLeft, comparator); // sorting left partition
	}

	/**
	 * Swaps two elements in the array.
	 * @param <T> A generic type.
	 * @param unsortedArray The array containing the elements.
	 * @param startOfIndex The first index.
	 * @param endOfIndex The second index.
	 */
	
	private static <T> void swap(T[] unsortedArray, int startOfIndex, int endOfIndex) {

		// storing elements to swap
		T swap1 = unsortedArray[startOfIndex];
		T swap2 = unsortedArray[endOfIndex];

		// swapping elements
		unsortedArray[startOfIndex] = swap2;
		unsortedArray[endOfIndex] = swap1;
	}
}

