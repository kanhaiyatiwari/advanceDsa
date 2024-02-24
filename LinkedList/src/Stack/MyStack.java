package Stack;

import java.util.Arrays;

public class MyStack {

	int capsity;
	int []arr;
	 int top;
	public MyStack(int capsity){
		this.capsity=capsity;
		this.arr=new int[capsity];
		this.top=-1;
	}
	
	public void push(int data) throws Exception {
		if(top>=capsity) throw  new Exception("stack is full"+capsity+" "+top);
		top++;
		arr[top]=data;
	}
	public int pop() throws Exception {
		if(top==-1)throw  new Exception("stack is already Empty");
		int temp=arr[top];
		arr[top]=0;
		top--;
		return temp;
	}
	public int peek() throws Exception {
		if(top==-1)throw  new Exception("stack is already Empty");
		return arr[top];
	}
	
	public int size() {
		return top+1;
	}

	@Override
	public String toString() {
		return "MyStack [capsity=" + capsity + ", arr=" + Arrays.toString(arr) + ", top=" + top + "]";
	}
	
	public String printstack() {
		String myArr="[";
		for(int i=0;i<=top;i++) {
			myArr+=" "+arr[i]+",";
		}
		myArr+=" ]";
		return myArr;
	}
	public boolean isEmpty() {
		if(top==-1)return true;
		return false;
	}
	
	
}
