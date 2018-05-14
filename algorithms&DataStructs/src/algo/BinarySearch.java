/**
 * 
 */
package algo;

/**
 * @author asmutti
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int array[] = {4, 6, 8, 10, 24, 55, 91, 112, 200, 221};
		
		System.out.println(recursiveBinarySearch(array, 0, 10, 221));
		
		System.out.println(binarySeach(array, 200));

	}
	
	/**
	 * a = array
	 * x = number that is being searched
	 * p = index 0 of the array
	 * r = size of the array -1
	 */
	public static int binarySeach(int[] a, int x) {
		int p = 0;
		int r = a.length -1;
		
		while(p <= r) {
			int q = (p + r) / 2;
			
			if (a[q] == x) {
				return q;
			}
			
			if(a[q] > x) {
				r = q -1;
			} else {
				p = q + 1;
			}
		}
		return -1;
	}
	
	public static int recursiveBinarySearch(int []a, int p, int r, int x) {
		System.out.println("[" + p + "..." + r + "]");
		if(p > r) {
			return -1;
		} else {
			int q = (p + r)/2;
			if(a[q] == x) {
				return q;
			} else if(a[q] > x) {
				return recursiveBinarySearch(a, p, q-1, x);
			} else {
				return recursiveBinarySearch(a, q+1, r, x);
			}
		}
	}

}
