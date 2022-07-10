package com.greatlearning.Denomination;

public class MergeSortImplementation {
	void merge(int arr[], int left, int mid, int right) {
		//to find the sizes of two sub arrays to be merged
		int arr1 = mid - left + 1;
		int arr2 = right - mid;
		
		//creating temporary arrays
		int leftArray[]	= new int[arr1];
		int rightArray[] = new int[arr2];
		
		//copying data to temporary arrays
		for (int i=0; i<arr1; i++)
			leftArray[i] = arr[left + i];
		for (int j=0; j< arr2; ++j)
			rightArray[j] = arr[mid + 1 + j];
		
		// Merge the temporary arrays 
		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;
		
		// Initial index of merged sub-array array
		int k = left;
		
		while (i < arr1 && j < arr2) {
			if (leftArray[i] >= rightArray[j]) {
					arr[k] = leftArray[i];
					i++;
			} else {
					arr[k] = rightArray[j];
					j++;
			}	
			k++;
		}
		
		//To copy remaining elements of L[] if any
		while (i < arr1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		//To copy remaining elements of R[] if any
				while (j < arr2) {
					arr[k] = rightArray[j];
					j++;
					k++;
				}
			}
	
	//Main function that sorts array[left....right] using merge()
	public void sort(int[] notes, int left, int right) {
		if(left < right) {
			//To find the middle point
			int mid = (left + right) / 2;
			
			//to sort first and second halves
			sort(notes, left, mid);
			sort(notes, mid + 1, right);
			
			//Merge the sorted halves
			merge(notes, left, mid, right);
		}
			
	}
		
}
	

