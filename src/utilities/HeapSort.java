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

            //restores the heap property for the remaining heap
            heapify(array, i , 0, comp);
        }
    }

    /**
     * Sorts an array using heap sort relying on natural ordering
     * @param array the array to be sorted
     * @param <T>   Type of elements, must implement Comparable
     */
    public static <T extends Comparable<? super T>> void heapSort(T[] array){
        int n = array.length;
        //Build the initial "Max Heap"
        //where we find the largest value and set it as the parent node
        for (int i = n /2 -1; i>= 0; i--){
            heapify(array, n, i);
        }
        //extract elements from the heap one by one
        for (int i = n -1; i>0;i--){
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;
        // restore the heap property for the remaining heap
            heapify(array, i ,0);
        }
    }

    /**
     * Restores the heap property for a subtree in a Comparable array
     * @param array the array representing the subtree
     * @param n Size of the heap
     * @param i Root index of the subtree
     * @param <T>   type of elements, must implement Comparable
     */
    private static <T extends Comparable<? super T>> void heapify(T[] array, int n, int i){
        //will be holding the largest node
            int smallest = i;
            //node left child
            int left = 2 * i + 1;
            //right child
            int right = 2 * i +2;

            //checks if the left child is larger than the root node
            //if yes set left as largest
            if(left < n && array[left].compareTo(array[smallest]) < 0)
                smallest = left;
            //checks if the right child is larger than the root node
            //if yes set right as largest
            if(right < n && array[right].compareTo(array[smallest]) < 0)
                smallest = right;

            if(smallest != i){
                T swap = array[i];
                array[i] = array[smallest];
                array[smallest] = swap;

                //recursively heapify the affected subtree
                heapify(array, n, smallest);
            }
    }

    /**
     * Restores the heap property for a subtree in an array using a Comparator.
     * @param arr Array representing the heap
     * @param n Size of the heap
     * @param i Root index of the subtree
     * @param comp  Comparator defining element order
     * @param <T> Type of elements
     */
    private static <T> void heapify(T[] arr, int n, int i, Comparator<? super T> comp) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        //using the comparator if left child exists and is larger according to the
        //comparator, then update the largest to the left child node
        if (left < n && comp.compare(arr[left], arr[smallest]) < 0)
            smallest = left;
        //using the comparator if right child exists and is larger according to the
        //comparator, then update the largest to the right child node
        if (right < n && comp.compare(arr[right], arr[smallest]) < 0)
            smallest = right;
        // if the largest is not the root, swap and continue heapifying elements
        if (smallest != i) {
            T swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;

            heapify(arr, n,smallest, comp);
        }
    }

}
