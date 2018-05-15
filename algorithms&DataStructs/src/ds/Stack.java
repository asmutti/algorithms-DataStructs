/**
 * 
 */
package ds;

/**
 * @author asmutti
 * 
 * last in, first out.
 *
 */
public class Stack {
	private int maxSize;
	private int[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new int[maxSize];
		this.top = -1;
	}
	
	public long peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (maxSize -1 == top);
	}
	
	public void push(int value) {
		if(this.isFull()) {
			System.out.println("Stack is full");
		} else {
			top++;
			stackArray[top] = value;
		}
	}
	
	public int pop() {
		if(this.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			int temp = top;
			top--;
			return stackArray[temp];
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack stack = new Stack(10);
		
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		for(int value: stack.stackArray) {
			int v = stack.pop();
			System.out.println(v);
		}

	}

}
