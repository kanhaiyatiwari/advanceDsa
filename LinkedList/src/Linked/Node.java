package Linked;

public class Node {

	int data;
	Node next;
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	public Node() {
		
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
	
}
