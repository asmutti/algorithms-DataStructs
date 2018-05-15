/**
 * 
 */
package ds;

import java.util.Random;

/**
 * @author asmutti
 *
 */
public class Queue {
	private int maxSize;
	private int array[];
	private int numberOfElements;
	private int first;
	private int last;
	
	public Queue(int size) {
		this.maxSize = size;
		this.array = new int[size];
		this.first = 0;
		this.last = -1;
		this.numberOfElements = 0;
	}
	
	public int add(int value) {
		if(last == maxSize - 1) {
			last = -1;
		}
		
		last++;
		numberOfElements++;
		array[last] = value;
		return value;
	}
	
	public int remove() {
		int temp = array[first];
		//keeps track of the next index of the queue
		first++;
		
		if(first == maxSize) {
			first = 0;
		}
		
		numberOfElements--;
		return temp;
	}
	
	public boolean isEmpty() {
		return numberOfElements == 0;
	}
	
	public boolean isFull() {
		return numberOfElements == maxSize;
	}
	
	public void view() {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Queue queue = new Queue(20);
		
		for (int i = 0; i < 20; i++) {
			queue.add(i);
		}
		
		System.out.println(queue.remove());
		
		System.out.println(queue.isEmpty());
		
		/*for (int i = 0; i < 20; i++) {
			queue.add(new Random().nextInt(1000));
		}*/
		
		
		queue.view();

	}

}
