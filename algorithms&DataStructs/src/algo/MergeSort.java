/**
 * 
 */
package algo;

/**
 * @author asmutti
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = {350, 12, 121, 1, 5, 99, 878, 541, 1024, 3, 5, 5, 4445};
		
		MergeSort.sort(array, 0, array.length -1);
		
		for (int i = 0; i < array.length-1; i++) {
			System.out.println(array[i]);
		}

	}
	
	
	public static void sort(int inputArray[], int start, int end) {
		if(end <= start) {
			return;
		}
		
		int mid = (start + end) / 2;
		MergeSort.sort(inputArray, start, mid); //left
		MergeSort.sort(inputArray, mid + 1, end); //right
		MergeSort.merge(inputArray, start, mid, end); // merge all together
		
	}
	
	public static void merge(int inputArray[], int start, int mid, int end) {
		int tempArray[] = new int [end - start + 1];		
		
		//index of left and right side of the array
		int leftPos = start;
		int rightPos = mid +1;
		
		int k = 0;
		
		while(leftPos <= mid && rightPos <= end) {			
			if(inputArray[leftPos] < inputArray[rightPos]) {
				tempArray[k] = inputArray[leftPos];
				leftPos++;
			} else {
				tempArray[k] = inputArray[rightPos];
				rightPos++;
			}			
			k++;
		}
		
		//at this point, both sides can be considered sorted but we still need to check more conditions:
		
		/*
		 * consider the right side done sorted.
		 * the left side might be sorted already
		 */
		if(leftPos <= mid) { 
			while(leftPos <= mid) {
				tempArray[k] = inputArray[leftPos];
				leftPos++;
				k++;
			}
		}
		
		/*
		 * consider the left side done sorted.
		 * the right side might be sorted already
		 */
		if(rightPos <= end) {
			while(rightPos <= end) {
				tempArray[k] = inputArray[rightPos];
				rightPos++;
				k++;
			}
		}
		
		//copy the data from tempArray to the inputArray
		for(int i = 0; i < tempArray.length; i++) {
			inputArray[start + i] = tempArray[i];
		}
		
		
	}

}
