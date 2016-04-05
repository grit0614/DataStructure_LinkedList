
public class Main {
	
	public static void main(String[] Args) {
		ArrayList_test();
		LinkedList_test();
		LinkedList_homework();
	}
	
	public static void ArrayList_test() {
		
		System.out.println("Exercise 1 - Array List\n=============================");
		ArrayList list = new ArrayList();
		list.add(0, 5);
		list.printAll();
		list.add(1, 2);
		list.printAll();
		list.add(1, 7);
		list.printAll();
		list.add(0, 1);
		list.printAll();
		System.out.print(list.remove(1) + " ");
		list.printAll();
		list.add(0, 4);
		list.printAll();
		System.out.print(list.remove(10) + " ");
		list.printAll();
		System.out.print(list.remove(3) + " ");
		list.printAll();
	}
	
	public static void LinkedList_test() {
		
		System.out.println("\n\nExercise 2 - Linked List\n=============================");
		LinkedList linkedList = new LinkedList();
		linkedList.addLast("A");		
		linkedList.addLast("B");
		linkedList.addLast("C");
		linkedList.addLast("D");
		linkedList.addLast("E");
		linkedList.addLast("F");
		linkedList.addLast("G");
		linkedList.addLast("H");
		linkedList.addLast("I");
		linkedList.printAllNodes();
		linkedList.addBefore(2,  "a");
		linkedList.addBefore(2,  "b");
		linkedList.printAllNodes();
		linkedList.addBefore(10,  "c");
		linkedList.printAllNodes();
	}
	
	// various linked list operations have been implemented as shown on the assignment powerpoint.
	// printReverse was performed at the very end to ensure that each and every nodes
	// are correctly mapped to its surrounding nodes
	public static void LinkedList_homework() {
		
		System.out.println("\n\nHomework - Print my name using Linked List\n=============================");		
		LinkedList linkedList = new LinkedList();
		linkedList.addLast("J");														// desired output : J
		linkedList.addLast("a");														// desired output : J a
		linkedList.addLast("e");														// desired output : J a e
		linkedList.addLast("o");														// desired output : J a e o
		linkedList.addLast("u");														// desired output : J a e o u
		linkedList.addLast("n");														// desired output : J a e o u n
		linkedList.addLast("g");														// desired output : J a e o u n g
		linkedList.printAllNodes();
		linkedList.addLast("g");														// desired output : J a e o u n g g
		linkedList.printAllNodes();
		linkedList.remove("g");															// desired output : J a e o u n g
		linkedList.printAllNodes();
		linkedList.addAfter("e", "y");											// desired output : J a e y o u n g
		linkedList.printAllNodes();
		linkedList.addLast("G");														// desired output : J a e y o u n g G
		linkedList.addLast("m");														// desired output : J a e y o u n g G m
		linkedList.printAllNodes();
		linkedList.addBefore(9, "i");												// desired output : J a e y o u n g G i m
		linkedList.printAllNodes();
		linkedList.set("G", "K");														// desired output : J a e y o u n g K i m
		linkedList.printAllNodes();
		
		linkedList.addAfter("g", "-");											// desired output : J a e y o u n g - K i m
		linkedList.printAllNodes();
		linkedList.printReverse();													// desired output : m i K - g n u o y e a J
	}
}
