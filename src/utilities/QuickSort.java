package utilities;
import java.util.Comparator;
public class QuickSort {
	
	public static <T extends Comparable<T>> void quickSort(T[] unsortedArray, int startOfIndex, int endOfIndex)
	{
		
		T pivot = unsortedArray[endOfIndex];
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
	
	public static <T> void quickSort(T[] unsortedArray, int startOfIndex, int endOfIndex, Comparator<? super T> comparator)
	{
		
		T pivot = unsortedArray[endOfIndex];
		int moveRight = startOfIndex;
		int moveLeft = endOfIndex;
		if (moveRight >= moveLeft) {
			return;
		}
		else {
			while (moveRight <= moveLeft){
				
				while (moveRight <= moveLeft && comparator.compare(unsortedArray[moveRight], pivot) > 0){
					moveRight++;
				}
				
				while (moveLeft >= moveRight && comparator.compare(unsortedArray[moveLeft], pivot) < 0){
					moveLeft--;
				}
				
				if (moveRight <= moveLeft) {
					swap(unsortedArray, moveRight, moveLeft);
					moveRight++;
					moveLeft--;
				}
			}
		}
		quickSort(unsortedArray, moveRight, endOfIndex, comparator);
       quickSort(unsortedArray, startOfIndex, moveLeft, comparator);
	}
	private static <T> void swap(T[] unsortedArray, int startOfIndex, int endOfIndex) {
		T swap1 = unsortedArray[startOfIndex];
		T swap2 = unsortedArray[endOfIndex];
		
		unsortedArray[startOfIndex] = swap2;
		unsortedArray[endOfIndex] = swap1;
	}
}
