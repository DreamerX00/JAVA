package CollectionFrameWork;

import java.util.LinkedList;

public class linkedListOperations {
	// implement without using any Collection FrameWork

	class MyLocationNode {
		String location;
		MyLocationNode nextLocationNode;

		public MyLocationNode(String location) {
			this.location = location;
			nextLocationNode = null;
		}

	}

	class India {

		private MyLocationNode headLocationNode;

		// Insert At Beginning
		void insertAtBeginning(String data) {
			MyLocationNode mynewLocationNode = new MyLocationNode(data);
			if (headLocationNode == null) {
				headLocationNode = mynewLocationNode;
				return;
			}

			mynewLocationNode.nextLocationNode = headLocationNode;
			headLocationNode = mynewLocationNode;

			System.out.println("Node Inserted At Begining");

		}

		// Insert At The End
		void insertAtEnd(String data) {
			MyLocationNode mynewLocationNode = new MyLocationNode(data);
			if (headLocationNode == null) {
				headLocationNode = mynewLocationNode;
				return;
			}

			MyLocationNode tempLocationNode = headLocationNode;
			while (tempLocationNode.nextLocationNode != null) {
				tempLocationNode = tempLocationNode.nextLocationNode;
			}
			tempLocationNode.nextLocationNode = mynewLocationNode;
		}

		// Insert After Target
		void insertAfterTarget(String data, String target) {
			MyLocationNode mynewLocationNode = new MyLocationNode(data);
			if (headLocationNode == null) {
				headLocationNode = mynewLocationNode;
				return;
			}

			MyLocationNode tempLocationNode = headLocationNode;
			while (tempLocationNode!= null && !(tempLocationNode.location.equalsIgnoreCase(target))) {
				tempLocationNode = tempLocationNode.nextLocationNode;
			}

			if (tempLocationNode == null) {
				System.out.println("Target Not Found");
			}

			mynewLocationNode.nextLocationNode = tempLocationNode.nextLocationNode;
			tempLocationNode.nextLocationNode = mynewLocationNode;
		}

		// Insert Before Target
		void insertBeforeTarget(String data, String target) {
			MyLocationNode mynewLocationNode = new MyLocationNode(data);
			if (headLocationNode == null) {
				System.out.println("List Is Empty");
				return;
			}
			
			//if head is the target
			if(headLocationNode.location == target) {
				mynewLocationNode.nextLocationNode = headLocationNode;
				headLocationNode = mynewLocationNode;
				return;
			}

			MyLocationNode tempLocationNode = headLocationNode;
			while (tempLocationNode != null && !(tempLocationNode.nextLocationNode.location.equalsIgnoreCase(target))) {
				tempLocationNode = tempLocationNode.nextLocationNode;
			}
			
			if (tempLocationNode == null) {
				System.out.println("Target Not Found");
			}

			mynewLocationNode.nextLocationNode = tempLocationNode.nextLocationNode;
			tempLocationNode.nextLocationNode = mynewLocationNode;
		}
		
		//Delete Target Element
		void deleteTarget(String target) {
			if(headLocationNode == null) {
				System.out.println("List Is Empty");
				return;
			}
			
			if(headLocationNode.location.equalsIgnoreCase(target)) {
				headLocationNode = headLocationNode.nextLocationNode;
				System.out.println("Deleted node: " + target);
				return;
			}
			
			MyLocationNode tempLocationNode = headLocationNode;
			
			while(tempLocationNode.nextLocationNode != null && !(tempLocationNode.nextLocationNode.location.equalsIgnoreCase(target))){
				tempLocationNode = tempLocationNode.nextLocationNode;
			}
			
			if(tempLocationNode.nextLocationNode == null) {
				System.out.println("Target Not Found");
				return;
			}
			
			if(tempLocationNode.nextLocationNode.nextLocationNode != null) {
				tempLocationNode.nextLocationNode = tempLocationNode.nextLocationNode.nextLocationNode;
			}
			
			else {
				tempLocationNode.nextLocationNode = null;
			}
			
			System.out.println("Deleted node: " + target);


		}
		
		
		//Delete Last Element
		void deleteLast() {
			if(headLocationNode == null) {
				System.out.println("List Is Empty");
				return;
			}
			
			MyLocationNode tempLocationNode = headLocationNode;
			
			while(tempLocationNode.nextLocationNode.nextLocationNode != null) {
				tempLocationNode = tempLocationNode.nextLocationNode;
			}
			tempLocationNode.nextLocationNode = null;
			System.out.println("Deleted The Last Element");
		}
		
		//Delete First Element
		void deleteFirst() {
			if (headLocationNode == null) {
				System.out.println("Nothing To Delete");
				return;
			}
			
			MyLocationNode tempLocationNode = headLocationNode;
			
			tempLocationNode = headLocationNode.nextLocationNode;
			headLocationNode = tempLocationNode;
			System.out.println("Deleted The First Element");
		}
		
		//search 
		boolean search(String target) {
			MyLocationNode tempLocationNode = headLocationNode;
			while(tempLocationNode != null) {
				if (tempLocationNode.location.equalsIgnoreCase(target)) {
					return true;
				}
				tempLocationNode = tempLocationNode.nextLocationNode;
			}
			
			
			return false;
		}
		
		//Display All
		void printAll() {
			MyLocationNode tempLocationNode = headLocationNode;
			while(tempLocationNode != null) {
				System.out.print(tempLocationNode.location + " -> ");
				tempLocationNode = tempLocationNode.nextLocationNode;
			}
			System.out.print("Null\n");
		}

	}

	public static void main(String[] args) {
		linkedListOperations ops = new linkedListOperations();
		linkedListOperations.India india = ops.new India();

        String[] states = {
            "Kerala", "Karnataka", "Tamil Nadu", "Andhra Pradesh", "Telangana",
            "Maharashtra", "Gujarat", "Madhya Pradesh", "Chhattisgarh", "Odisha",
            "Jharkhand", "West Bengal", "Assam", "Meghalaya", "Tripura", "Mizoram",
            "Manipur", "Nagaland", "Arunachal Pradesh", "Sikkim", "Bihar",
            "Rajasthan", "Uttar Pradesh", "Delhi", "Haryana", "Uttarakhand",
            "Punjab", "Himachal Pradesh", "Jammu & Kashmir"
        };

        for (String i : states) {
            india.insertAtBeginning(i);
        }
        india.deleteTarget("Punjab");
        india.deleteLast();
        india.deleteFirst();
        india.printAll();
        
        
        System.out.println(india.search("Spain"));
        
        
        //Actual Way To Do This Is Using Collection FrameWork
        
        LinkedList<String> myList = new LinkedList<>(); 
        
        for(String str : states) {
        	myList.addFirst(str);
        }
        
        //add element after and index
        myList.add(2,"Kerala");
        
        //add element after a target
        System.out.println(myList);
        int targetIndex = myList.indexOf("Gujrat");
        myList.add(targetIndex+1,"Meetha Gujrat");
        
        
        
        System.out.println(myList);
        

	}
	
}
