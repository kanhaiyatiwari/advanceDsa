package Linked;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head =new Node(1);
		Node current=head;
		
		for(int i=2;i<=10;i++) {
			current.next=new Node(i);
			current=current.next;
		}
		
		current.next=head;
//System.out.println(current);
//		System.out.println(insertPostion(head, 400, 5));
//		System.out.println(reverse(head));
		System.out.println(hasCycle(head));
	}
	
//	insert at a position
	public static Node insertPostion(Node head,int data,int pos) {
		Node newNode=new Node(data);
		Node current=head;
	if(pos==0) {
		newNode.next=head;
		return newNode;
	}
	int pcount=0;
	
	while(current!=null&&current.next!=null&&pcount<pos) {
		current=current.next;
		pcount++;
	}
	Node pre=current.next;
	newNode.next=pre;
	current.next=newNode;
	return head;
	}
	
//	reverse a list
	
	public static Node reverse(Node head) {
		
		Node current=head;
		Node pre=null;
		
		while(current!=null) {
			Node temp=current.next;
			current.next=pre;
			pre=current;
			current=temp;
		}
		return pre;
	}
	
	public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; // No cycle if the list is empty or has only one node
        }

        Node slow = head;
        Node fast = head.next; // Move fast pointer one step ahead initially

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Cycle detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No cycle detected
    }

}
