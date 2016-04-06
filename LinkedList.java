
public class LinkedList {
	
	Node header = new Node();
	Node trailer = new Node();
	
	// Link the head and trailer together
	public LinkedList() {
		header.setNext(trailer);
		trailer.setPrev(header);
	}
	
	// Implementation of addLast feature
	public void addLast(String value) {
		Node nodeNew = new Node(trailer.getPrev(), trailer, value);
		trailer.getPrev().setNext(nodeNew);
		trailer.setPrev(nodeNew);
	}
	
	// searches for the nth indexed node, then creates a new node,
	// and map it to the (n-1)th node position to complete the process
	public boolean addBefore(int n, String value) {
		// starting from the very left node
		Node temp = header.getNext();
		// declare an arbitrary index value to keep track of the node position
		int index = 0;
		// repeat until the loop has reached the very last node(or desired index value is found)
		while(temp != trailer) {
			// if the declared index value matches the designated index value,
			if(index==n) {
				// create a new node which is mapped to (n-1)th node and nth node,
				Node nodeNew = new Node(temp.getPrev(), temp, value);
				// then insert the created node into (n-1)th node position.
				// map the (n-1)th node to the node we've just created
				temp.getPrev().setNext(nodeNew);
				// map the nth node to the node we've just created
				temp.setPrev(nodeNew);
				// then aborts the process
				return true;
			}
			// if the desired index value is not found, move on to the next node.
			temp=temp.getNext();
			// increase the value of the arbitrary index by 1, then proceed.
			index++;
		}
		return false;
	}
	
	// creates a node when the designated String is found,
	// and then maps it into the Linked List accordingly
	public boolean addAfter(String before, String after) {
		// starting from the very first node of the linked list
		Node temp = header.getNext();
		// repeat the process from header to trailer
		while(temp != trailer) {
			// if the string value of the node matches the input
			if(temp.getString() == before) {
				// creates a node which will be inserted into the linked list
				Node nodeNew = new Node(temp, temp.getNext(), after);
				// maps the (temp+1)th node with the node we've just created
				temp.getNext().setPrev(nodeNew);
				// maps the temp node to the node we've just created
				temp.setNext(nodeNew);
				// then aborts the operation
				return false;
			}
			// repeat the following steps until the desired String value is found
			temp=temp.getNext();
		}
		return true;
	}
	
	// searches the designated string value within the nodes, then deletes it by mapping (n-1) node with (n+1) node
  // in order to get rid of the right-most element which corresponds to the criteria, the search method has been
	// the searching algorithm has been retouched (left -> right to right-> left)
	public boolean remove(String value) {
		Node temp = trailer.getPrev();
		// repeat the process from header to trailer
		while(temp != header) {
			// if the string value of the node matches the input
			if(temp.getString() == value) { 
				// map the previous node with the next node, excluding the designated node itself
				
				temp.getPrev().setNext(temp.getNext());
				temp.getNext().setPrev(temp.getPrev());
				return false;
			}
			temp=temp.getPrev();
		}
		return true;
	}
	
	// looks for the designated String within the Linked List, then replaces the String value
  // in order to get rid of the right-most element which corresponds to the criteria,
	// the searching algorithm has been retouched (left -> right to right-> left)
	public boolean set(String before, String after) {
		Node temp = trailer.getPrev();
		// repeat the process from header to trailer
		while(temp != header) {
			// if the string value of the node matches the input
			if(temp.getString() == before) {
				// replaces the String value using setString method
				temp.setString(after);
				// then aborts the process
				return false;
			}
			// move on to the next node(the one on the left side of the node we've just investigated)
			temp=temp.getPrev();
		}
		return true;
	}
	
	// Starting from the very last node [(n-1)th node], prints out the stored String value followed by " "
	public void printReverse() {
		// sets the very last node as temp
		Node temp = trailer.getPrev();
		// while temp reaches the header
		while(temp != header) {
			System.out.print(temp.getString() + " ");
			// move on to the next node(the one on the left side of the node we've just investigated)
			temp = temp.getPrev();
		}
		System.out.println("");
	}
	
	public void printAllNodes() {
		Node temp = header.getNext();
		while(temp != trailer) {
			System.out.print(temp.getString() + " ");
			temp = temp.getNext();
		}
		System.out.println("");
	}

}
