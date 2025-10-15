package utilities;

import appDomain.Config;
import appDomain.Config.CompareType;
import appDomain.AreaCompare;
import appDomain.VolumeCompare;
import shapes.ShapeObject;

/**
 *
 *
 * @author TerrellAW
 * @version 14-10-2025
 */
public class SortManager {
    public static void sortShapes(ShapeObject[] shapes, Config config) {
        CompareType compareType = config.getCompareType();

        if (compareType == CompareType.VOLUME) {
            VolumeCompare volComp = new VolumeCompare();
            switch (config.getSortType()) {
                case BUBBLE:
                    BubbleSort.bubbleSort(shapes, volComp);
                    break;
                case SELECTION:
                    SelectionSort.selectionSort(shapes, volComp);
                    break;
                case INSERTION:
                    InsertionSort.insertionSort(shapes, volComp);
                    break;
                case MERGE:
                    MergeSort.mergeSort(shapes, 0, shapes.length - 1, volComp);
                    break;
                case QUICK:
                    //QuickSort.quickSort(shapes, 0, shapes.length - 1, volComp);
                    break;
                case CHOICE:
                    HeapSort.heapSort(shapes, volComp);
                    break;
            }
        }
        else if (compareType == CompareType.BASE_AREA) {
            AreaCompare areaComp = new AreaCompare();
            switch (config.getSortType()) {
                case BUBBLE:
                    BubbleSort.bubbleSort(shapes, areaComp);
                    break;
                case SELECTION:
                    SelectionSort.selectionSort(shapes, areaComp);
                    break;
                case INSERTION:
                    InsertionSort.insertionSort(shapes, areaComp);
                    break;
                case MERGE:
                    MergeSort.mergeSort(shapes, 0, shapes.length - 1, areaComp);
                    break;
                case QUICK:
                    //QuickSort.quickSort(shapes, 0, shapes.length - 1, areaComp);
                    break;
                case CHOICE:
                    HeapSort.heapSort(shapes, areaComp);
                    break;
            }
        }
        else {
            switch (config.getSortType()) {
                case BUBBLE:
                    BubbleSort.bubbleSort(shapes);
                    break;
                case SELECTION:
                    SelectionSort.selectionSort(shapes);
                    break;
                case INSERTION:
                    InsertionSort.insertionSort(shapes);
                    break;
                case MERGE:
                    MergeSort.mergeSort(shapes, 0, shapes.length - 1);
                    break;
                case QUICK:
                    QuickSort.quickSort(shapes, 0, shapes.length - 1);
                    break;
                case CHOICE:
                    HeapSort.heapSort(shapes);
                    break;
            }
        }
    }
}
