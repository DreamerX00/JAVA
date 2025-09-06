package DSA_Basics;


public class linkedList {
	private Node headNode;
	private Node tailNode;
	
	private int size;
	
	public linkedList() {
		this.size = 0;
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.nextNode = headNode;
		headNode = node;
		if (tailNode == null) {
			tailNode = headNode;
		}
		size++;
	}
	
	public void insertLast(int val) {
		if (tailNode == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tailNode.nextNode = node;
		tailNode = node;
		size++;
	}
	
	public void printList() {
		Node tempNode = headNode;
		while(tempNode != null) {
			System.out.print(tempNode.data+ " -> ");
			tempNode = tempNode.nextNode;
		}
		System.out.println("NULL");
	}
	
	
	private class Node{
		private int data;
		private Node nextNode;
		
		public Node(int data) {
			this.data = data;
		}
		
		public Node(int data, Node nextNode) {
			super();
			this.data = data;
			this.nextNode = nextNode;
		}
		
		
		
	}
	public static void main(String[] args) {
		linkedList list = new linkedList();
		list.insertFirst(12);
		list.insertFirst(18);
		list.insertFirst(88);
		list.insertLast(78);
		
		list.printList();
	}
}

	

