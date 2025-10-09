package utilities;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Class for handling insertion sort.
 * 
 * @author TerrellAW
 * @version 09-10-2025
 */
public class InsertionSort {
	/**
	 * Sorts a list of objects using insertion sort.
	 * Sorts based on the chosen comparator's compare method.
	 * 
	 * @author TerrellAW
	 * @param objects ArrayList of generic objects
	 * @param comparator Chosen comparator for comparing objects
	 */
	public static <T> void insertionSort(ArrayList<T> objects, Comparator<T> comparator) {
		
		int len = objects.size();
		
		for (int i = 1; i < len; ++i) {
			T temp = objects.get(i);
			int j = i - 1;
			
			while (j >= 0 && comparator.compare(objects.get(j), temp) >= 0) {
				objects.set(j + 1, objects.get(j));
				j = j - 1;
			}
			objects.set(j + 1, temp);
		}
	}
}
