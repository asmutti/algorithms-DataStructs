package algo;

/**
 * @author asmutti
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		
		int array[] = {350, 12, 121, 1, 5, 99, 878, 541, 1024, 3, 5, 5, 4445};
		
		array = selectionSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
	
	public static int[] selectionSort(int a[]) {		
		for(int i = 0; i < a.length; i++) {
			int minimum = i;
			for (int j = i + 1; j < a.length; j++) {
				if(a[j] < a[minimum]) {
					minimum = j;
				}				
			}
			int temp = a[i]; //save the number that will be replaced
			a[i] = a[minimum]; //replace the new minimum
			a[minimum] = temp;
			//System.out.println(a[i]);
		}		
		return a;
	}

}
