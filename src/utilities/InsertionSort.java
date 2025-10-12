package utilities;

import java.util.Comparator;

/**
 * Class for handling insertion sort.
 *
 * @author TerrellAW
 * @version 10-10-2025
 */
public class InsertionSort {

    /**
     * Sorts an array of objects using insertion sort.
     * Sorts using object's compareTo method.
     *
     * @author TerrellAW
     * @param unsortedArray Generic array of objects that needs to be sorted
     */
    public static <T extends Comparable<T>> void insertionSort(
        T[] unsortedArray
    ) {
        int len = unsortedArray.length;

        for (int i = 1; i < len; ++i) {
            T temp = unsortedArray[i];
            int j = i - 1;

            while (
                j >= 0 && ((Comparable<T>) unsortedArray[j]).compareTo(temp) < 0
            ) {
                unsortedArray[j] = unsortedArray[j + 1];
                j = j - 1;
            }
            unsortedArray[j + 1] = temp;
        }
    }

    /**
     * Sorts an array of objects using insertion sort.
     * Sorts based on the chosen comparator's compare method.
     *
     * @author TerrellAW
     * @param objects ArrayList of generic objects
     * @param comparator Chosen comparator for comparing objects
     */
    public static <T> void insertionSort(
        T[] unsortedArray,
        Comparator<T> comparator
    ) {
        int len = unsortedArray.length;

        for (int i = 1; i < len; ++i) {
            T temp = unsortedArray[i];
            int j = i - 1;

            while (j >= 0 && comparator.compare(unsortedArray[j], temp) < 0) {
                unsortedArray[j] = unsortedArray[j + 1];
                j = j - 1;
            }
            unsortedArray[j + 1] = temp;
        }
    }
}
