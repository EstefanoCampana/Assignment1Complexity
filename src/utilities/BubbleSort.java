package utilities;

import java.util.Comparator;

/**
 * Class for handling bubble sort.
 *
 * @author TerrellAW
 * @version 10-10-2025
 */
public class BubbleSort {

    /**
     * Sorts an array of objects using bubble sort.
     * Sorts using object's compareTo method.
     *
     * @author TerrellAW
     * @param unsortedArray Generic array of objects that needs to be sorted
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] unsortedArray) {
        int len = unsortedArray.length;

        for (int x = 0; x < len - 1; x++) {
            for (int y = 0; y < len - x - 1; y++) {
                Comparable<T> current = (Comparable<T>) unsortedArray[y];
                if (current.compareTo(unsortedArray[y + 1]) < 0) {
                    T temp = unsortedArray[y];
                    unsortedArray[y] = unsortedArray[y + 1];
                    unsortedArray[y + 1] = temp;
                }
            }
        }
    }

    /**
     * Sorts an array of objects using bubble sort.
     * Sorts based on the chosen comparator's compare method.
     *
     * @author TerrellAW
     * @param unsortedArray Generic array of objects that needs to be sorted
     * @param comparator Chosen comparator for comparing objects
     */
    public static <T> void bubbleSort(
        T[] unsortedArray,
        Comparator<T> comparator
    ) {
        int len = unsortedArray.length;

        for (int x = 0; x < len - 1; x++) {
            for (int y = 0; y < len - x - 1; y++) {
                if (
                    comparator.compare(unsortedArray[y], unsortedArray[y + 1]) <
                    0
                ) {
                    T temp = unsortedArray[y];
                    unsortedArray[y] = unsortedArray[y + 1];
                    unsortedArray[y + 1] = temp;
                }
            }
        }
    }
}
