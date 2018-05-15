/**
 * 
 */
package ds;

/**
 * @author asmutti
 *
 */
public class DoublyLinkedList {
	private Node first;
	private Node last;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		} else {
			first = newNode;
		}
		
		newNode.next = first;
		this.first = newNode;
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last = newNode;
			newNode.previous = last;
		}
		
		last = newNode;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		
		
		if(temp.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		
		last = last.previous;
		return temp;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
