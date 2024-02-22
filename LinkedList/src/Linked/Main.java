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

		System.out.println(insertPostion(head, 400, 5));
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

}
