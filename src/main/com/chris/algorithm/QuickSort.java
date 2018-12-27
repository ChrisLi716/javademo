package com.chris.algorithm;

/**
 * @Auther Chris Lee
 * @Date 12/26/2018 15:19
 * @Description
 */
public class QuickSort {
	
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int[] array = {6, 1, 3, 4, 5};
		quickSort.quickSort(array, 0, 4);
	}
	
	private void quickSort(int[] array, int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;
		
		// calculate pivot number, I am taking pivot as middle index number
		int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
		System.out.println("pivot:" + pivot + ",i:" + i + ",j:" + j);
		// Divide into two arrays
		while (i <= j) {
			/*
			 * In each iteration, we will identify a number from left side which is greater then the pivot value, and also we will
			 * identify a number from right side which is less then the pivot value. Once the search is done, then we exchange both
			 * numbers.
			 */
			
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			
			if (i < j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				// move index to next position on both sides
				i++;
				j--;
			}
		}
		
		CommonUtils.printArray2Str(array);
		
		// call quickSort() method recursively
		if (lowerIndex < j) {
			quickSort(array, lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(array, i, higherIndex);
		}
		
	}
	
}
