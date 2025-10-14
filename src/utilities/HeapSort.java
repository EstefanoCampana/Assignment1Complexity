package utilities;


import java.util.Comparator;

/**
 * The {@code HeapSort} gives an implementation of the Heap sort algorithm:
 * this class makes use of the {@link Comparator} for custom sorting logic, and one
 * that relies on the natural ordering of elements (using {@link Comparable})
 *
 *
 * @author
 * Youssif Al-Halawche 000979657
 */
public class HeapSort {

    /**
     *
     * @param <T> is a generic type that describes the type of elements in the array
     * @param comp the comparator used to compare between elements
     * @param array the array that is to be sorted
     */
    public static <T> void heapSort(T[] array, Comparator<? super T> comp){
        int n = array.length;
        // Build a max heap: rearrange the array into a heap structure
        for (int i = n /2 -1; i >= 0; i--){
            heapify(array, n, i, comp);
        }
        //extract elements from teh heap one by one
        for (int i = n -1; i>0; i--){
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i , 0, comp);
        }
    }
    public static <T extends Comparable<? super T>> void heapSort(T[] array){
        int n = array.length;

        for (int i = n /2 -1; i>= 0; i--){
            heapify(array, n, i);
        }

        for (int i = n -1; i>0;i--){
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i ,0);
        }
    }

    private static <T extends Comparable<? super T>> void heapify(T[] array, int n, int i){
        //will be holding the largest node
            int largest = i;
            //node left child
            int left = 2 * i + 1;
            //right child
            int right = 2 * i +2;

            //checks if the left child is larger than the root node
            //if yes set left as largest
            if(left < n && array[left].compareTo(array[largest]) > 0)
                largest = left;
            //checks if the right child is larger than the root node
            //if yes set right as largest
            if(right < n && array[right].compareTo(array[largest]) > 0)
                largest = right;

            if(largest != i){
                T swap = array[i];
                array[i] = array[largest];
                array[largest] = swap;

                //recursively heapify the affected subtree
                heapify(array, n, largest);
            }
    }


    private static <T> void heapify(T[] arr, int n, int i, Comparator<? super T> comp) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && comp.compare(arr[left], arr[largest]) > 0)
            largest = left;

        if (right < n && comp.compare(arr[right], arr[largest]) > 0)
            largest = right;

        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest, comp);
        }
    }
}
