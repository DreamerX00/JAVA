package DSA_Basics;

public class doublyLinkedList {
	private Node head;
	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		if(head == null) {	
			head = newNode;
			return;
		}
		newNode.next = head;
		head.pre = newNode;
		head = newNode;
		
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.pre = temp;
	}
	
	public void insertAfterTarget(int target, int data) {
		Node newNode = new Node(data);
		if(head == null) {
			System.out.println("List Is Empty No Target Found");
			head = newNode;
			System.out.println("New Node Created");
			return;
		}
		
		Node temp = head;
		while(target != temp.data && temp!= null) {
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		newNode.pre = temp;
		temp.next = newNode;
		
		if(newNode.next != null) {
			newNode.next.pre = newNode;
		}
		
	}
	
}

class Node{
	int data;
	Node next = null;
	Node pre = null;
	
	public Node(int data) {
		this.data = data;
		Node next = null;
		Node pre = null;
	}
}

