package Linked;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head =new Node(1);
		Node current=head;
		Node list2 =new Node(0);
		Node c2=list2;
		for(int i=3;i<=30;i+=2) {
			current.next=new Node(i);
			current=current.next;
		}
		for(int i=2;i<=15;i+=2) {
			c2.next=new Node(i);
			c2=c2.next;
		}
		
//		current.next=head;
////System.out.println(current);
////		System.out.println(insertPostion(head, 400, 5));
////		System.out.println(reverse(head));
//		System.out.println(hasCycle(head));
//		System.out.println(head);
//		System.out.println(list2);
		System.out.println(marge(list2, head));
		
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
	
	
//	marge to soted linked list
	
	public static Node marge(Node l1,Node l2) {
		
		
		Node ansList=new Node(-1);
		Node cans=ansList;
		while(l1!=null&&l2!=null) {
			if(l2.data<l1.data) {
				cans.next=l2;
				l2=l2.next;
				cans=cans.next;
			}
			else {
				cans.next=l1;
				l1=l1.next;
				cans=cans.next;
			}
		}
		while(l1!=null) {
			cans.next=l1;
			l1=l1.next;
			cans=cans.next;
		}
		while(l2!=null) {
			cans.next=l2;
			l2=l2.next;
			cans=cans.next;
		}
		return ansList.next;
	}
//check palindrome
	
	
}
