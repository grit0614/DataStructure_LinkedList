
public class Node {
	
	private String str;
	private Node prev;
	private Node next;
	
	public Node () {
		prev = next = null;
		str = "empty";
	}
	
	public Node(Node prev, Node next, String str) {
		this.prev = prev;
		this.next = next;
		this.str = str;
	}
	
	// Link Methods
	public void setPrev(Node p) {
		this.prev = p;
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
	
	// Generated setter for the string within the specified node
	public void setString(String value) {
		this.str = value;
	}
	
	// Get Methods
	public Node getPrev() {
		return prev;
	}
	
	public Node getNext() {
		return next;
	}
	
	public String getString() {
		return str;
	}
	
}
