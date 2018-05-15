/**
 * 
 */
package ds;

/**
 * @author asmutti
 *
 */
public class LinkedList {
	
	private Node first;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int data) {
		Node newFirst = new Node();
		newFirst.data = data;
		newFirst.next = first;
		first = newFirst;
	}
	
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		
		return temp;
	}
	
	public void insertLast(int data) {
		Node newLast = new Node();
		newLast.data = data;
		
		Node currentNode = first;
		while(currentNode.next != null) {
			//until find the actual last node
			currentNode = currentNode.next; 
		}
		
		//points the last node to the new last node
		currentNode.next = newLast;
	}
	
	public void displayList() {
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
		
		LinkedList list = new LinkedList();
		
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
