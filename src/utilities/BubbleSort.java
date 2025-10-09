package utilities;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Class for handling bubble sort.
 * 
 * @author TerrellAW
 * @version 09-10-2025
 */
public class BubbleSort {	
	/**
	 * Sorts a list of objects using bubble sort.
	 * Sorts based on the chosen comparator's compare method.
	 * 
	 * @author TerrellAW
	 * @param objects ArrayList of generic objects
	 * @param comparator Chosen comparator for comparing objects
	 */
	public static <T> void bubbleSort(ArrayList<T> objects, Comparator<T> comparator) {
		
		int len = objects.size();
		
		for (int x = 0; x < len - 1; x++) {
			for (int y = 0; y < len - x - 1; y++) {
				if (comparator.compare(objects.get(y), objects.get(y + 1)) > 0) {
					T temp = objects.get(y);
					objects.set(y, objects.get(y + 1));
					objects.set(y + 1, temp);
				}
			}
		}
	}
}
