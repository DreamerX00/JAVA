package CollectionFrameWork;

import java.util.Stack;

public class stackOperations {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
		myStack.add(88);
		myStack.add(33);
		myStack.add(93);
		myStack.add(32);
		myStack.add(812);
		myStack.add(1);
		myStack.add(15);
		myStack.add(3);
		
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		System.out.println(myStack.isEmpty());
		System.out.println(myStack);
		
		
		
		
	}
}
