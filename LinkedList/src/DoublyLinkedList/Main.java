package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head =new Node(1);
		Node current=head;
		for(int i=2;i<=10;i++) {
			Node newNode=new Node(i);
			current.next=newNode;
			newNode.prev=current;
			current=current.next;
		}
		delete(head,5);
//		print(head);
		System.out.println("------------!-----------");
		
//		backPrint(head);
	}
	
	
//	forverd print
	public static void  print(Node head) {
		
		while(head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}

	
//	backbard print
	public static void  backPrint(Node head) {
		
		Node current =head;
		while(current.next!=null) current=current.next;
		while(current!=null) {
			System.out.println(current.data);
			current=current.prev;
		}
	}

	
//delete node
	public static void delete(Node head,int pos) {
		Node current=head;
		if(pos==1) {
			head=head.next;
			head.prev=null;
			print(head);
			
			backPrint(head);
		}
		int cp=1;
		while(cp<pos&&current.next!=null) {
			current=current.next;
			cp++;
		}
		
		current.next=current.next.next;
		current.next.prev=current;
		
		print(head);
		
		backPrint(head);
	}
}
