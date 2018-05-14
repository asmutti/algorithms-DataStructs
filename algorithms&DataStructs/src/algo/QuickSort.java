package algo;

import java.util.Arrays;

/**
 * @author asmutti
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		
		int[] array = {350, 12, 121, 1, 5, 99, 878, 541, 1024, 3, 5, 5, 4445};
		
		quicksort(array, 0, array.length -1);
		
		System.out.println(Arrays.toString(array));

	}
	
	public static int quicksort(int [] inputArray, int start, int end) {
		
		if(start < end) {
			int pp = partition(inputArray, start, end);
			quicksort(inputArray, start, pp -1); //left
			quicksort(inputArray, pp+1, end); //right
		}
		
		
		return 0;
	}
	
public static int partition(int [] inputArray, int start, int end) {
		
		int pivot = inputArray[end];
		int i =	start - 1; // i starts from -1 in the first call
		
		for(int j = start; j <= end -1; j++) {
			if(inputArray[j] <= pivot) {
				i++;
				//swap process
				int iVal = inputArray[i];
				int jVal = inputArray[j];				
				inputArray[i] = jVal;
				inputArray[j] = iVal;
			}
		}
		
		//put the pivot value in the correct slot
		int iVal = inputArray[i+1];
		inputArray[end] = iVal;
		inputArray[i+1] = pivot; //pivot value placed in the correctly place 
			
		return i+1;
	}

}
