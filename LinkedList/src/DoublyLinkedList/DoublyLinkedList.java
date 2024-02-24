package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Other methods such as insertAtFront, delete, search, etc. can be implemented similarly.
}