package utilities;

import java.util.Arrays;

public class SortAlgorithm 
{
	public static <T> void mergeSort(Comparable<T>[] unsortedList) 
	{
		Comparable<T>[] firstHalf = Arrays.copyOfRange(unsortedList, 0, unsortedList.length/2);
		Comparable<T>[] secondHalf = Arrays.copyOfRange(unsortedList, unsortedList.length/2, unsortedList.length);
		for(int i = 0; i < firstHalf.length ; i++) 
		{
			System.out.println(firstHalf[i]);
		}
		for(int i = 0; i < firstHalf.length ; i++) 
		{
			System.out.println(secondHalf[i]);
		}
		
	}
}
