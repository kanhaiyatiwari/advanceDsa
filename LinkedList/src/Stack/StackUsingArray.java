package Stack;

public class StackUsingArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		i have to implement stack using array
//		push opration 
//		pop opration 
//		peek opration get size opration
//		
	
MyStack stack=new MyStack(10);
stack.push(30);
stack.push(40);
stack.push(50);
stack.pop();
stack.push(90);
System.out.println(stack.peek());
System.out.println(stack.size());
System.out.println(stack.printstack());
System.out.println(stack.isEmpty());
	}

}
