package utilities;

import java.lang.reflect.Array;
import java.util.Random;

public class QuickSort {
	

	public static <T> void quickSort(Comparable[] unsortedArray, int startOfIndex, int endOfIndex) 
	{
		
		Comparable<T> pivot = unsortedArray[endOfIndex];
		int moveRight = startOfIndex;
		int moveLeft = endOfIndex;

		if (moveRight >= moveLeft) {
			return;
		}
		else {
			while (moveRight <= moveLeft){
				
				while (moveRight <= moveLeft && unsortedArray[moveRight].compareTo(pivot) > 0){ 
					moveRight++;
				}
				
				while (moveLeft >= moveRight && unsortedArray[moveLeft].compareTo(pivot) < 0){ 
					moveLeft--;
				}
				
				if (moveRight <= moveLeft) {
					swap(unsortedArray, moveRight, moveLeft);
					moveRight++;
					moveLeft--;
				}
			}
				
		}
		quickSort(unsortedArray,moveRight,endOfIndex);
		quickSort(unsortedArray,startOfIndex,moveLeft);
	}

	private static void swap(Comparable[] unsortedArray, int startOfIndex, int endOfIndex) {
		Comparable swap1 = unsortedArray[startOfIndex];
		Comparable swap2 = unsortedArray[endOfIndex];
		
		unsortedArray[startOfIndex] = swap2;
		unsortedArray[endOfIndex] = swap1;
	}
}