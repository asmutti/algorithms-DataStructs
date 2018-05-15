/**
 * 
 */
package ds;

/**
 * @author asmutti
 *
 */
public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	private boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		newNode.next = first; // new node --> old first
		first = newNode; //first place
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; //next value of the last node will point to the newNode
			last = newNode; //make the newNode the last node in the list
		}
	}
	
	public int deleteFirst() {
		int temp = first.data;
		
		if(first == null) {
			last = null;
		}
		
		first = first.next;		
		return temp;
	}
	
	public void displayList () {		
		Node currentNode = first;	
		while(currentNode.next != null) {
			currentNode.displayNode();
			currentNode = currentNode.next;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		
		list.insertFirst(10);
		list.insertFirst(2);
		list.insertFirst(30);
		list.insertFirst(50);
		list.insertFirst(15);
		list.insertFirst(5);
		
		
		list.displayList();
		
		list.deleteFirst();
		
		list.displayList();

	}

}
