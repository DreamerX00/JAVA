package DSA_Basics;

public class linkedListOperations {
	public static void main(String[] args) {
		LinkList l1 = new LinkList();
		l1.insertAtEnd(10);
		l1.insertAtEnd(20);
		l1.insertAtEnd(30);
		l1.insertAtBegining(80);
		l1.insertAtEnd(90);
		l1.insertAfterTarget(20, 21);
		l1.deleteFromEnd();
		l1.deleteTarget(21);
		l1.deleteFirstNode();
		l1.printAll();
		
		
		System.out.println("Current Length of The Linked List is : "+l1.getLength());
	}
}

//creating node structure
class Node2{
	int data;
	Node2 next;
	
	public Node2(int data) {
		this.data = data;
		this.next = null;
	}
}


//main class to perform CRUD on Linked list
class LinkList{
	private Node2 head;
	int length = 0;
	public void insertAtEnd(int data) {
		Node2 newNode = new Node2(data);
		if(head == null) {
			head = newNode;
			length++;
			return;
		}
		
		Node2 temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		
		temp.next = newNode;
		length++;
	}
	
	//Node Insertion Operations
	public void insertAtBegining(int data) {
		Node2 newNode = new Node2(data);
		if(head == null) {
			head = newNode;
			length++;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	public void insertAfterTarget(int target, int data) {
		Node2 newNode = new Node2(data);
		if(head == null) {
			System.out.println("List Not Created");
			head = newNode;
			System.out.println("Create Fist Node With Data = "+data);
			length++;
			return;
		}
		
		Node2 search = head;
		Node2 temp = search;
		while(search.data != target) {
			search = search.next;
			temp = temp.next;
		}
		newNode.next = temp.next;
		search.next = newNode;
		length++;
		
	}
	
	//Node Deletion Operations
	public void deleteFromEnd() {
		if(head == null) {
			System.out.println("List Is Already Empty");
			return;
		}
		Node2 temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		length--;
	}
	public void deleteTarget(int target) {

		if(head == null) {
			System.out.println("List Is Already Empty");
			return;
		}
		
		Node2 temp = head;
		while(temp.next.data != target) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		length--;
	}
	
	public void deleteFirstNode() {
		if(head == null) {
			System.out.println("Already Empty");
			return;
		}
		if(head.next != null) {
			head = head.next;
		}
		else head = null;
		
		length--;
	}
	
	public void printAll() {
		if(head == null) {
			System.out.println("List Not Created Yet");
			return;
		}
		
		Node2 temp = head;
		while(temp != null){
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	public int getLength() {
		return length;
	}
}