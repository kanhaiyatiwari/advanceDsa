package DoublyLinkedList;

public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    
    public Node() {
    	
    }

	@Override
	public String toString() {
		return "Node [data=" + data + ", prev=" + prev + ", next=" + next + "]";
	}
    
}