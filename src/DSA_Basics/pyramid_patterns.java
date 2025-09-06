package DSA_Basics;

import java.util.Scanner;
public class pyramid_patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Size Of Your Patterns = ");
		int len = sc.nextInt();
		System.out.print("Enter The any Character/String/Symbol/number for pattern design : ");
		String design = sc.next();
		int choice;
		while(true) {
			
		System.out.print("""
				Select One Of The Following Options : 
				1. Re-Enter Pattern Size
				2. Show Normal Triangle
				3. Show Reversed Triangle
				4. Show Spaced Triangle
				5. Show Pyramid Pattern
				6. Show Diamond Pattern
				7. Re-Enter Pattern Design;
				8. Exit
				
				->
				""");
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 ->{
			System.out.print("Re-Enter Size of The Pattern : ");
			len = sc.nextInt();
		}
		
		case 2 -> { 
			System.out.println("""
					
				==========================
					  Normal Triangle
				==========================
					""");
			
			//normal triangle
			for(int i = 1;i <= len;i++) {
				for(int j = 0; j < i;j++ ) {
					System.out.print(design);
				}
				System.out.println();
			}
		}
		
		case 3-> {
			System.out.println("""
					
					==========================
					    Reversed Triangle
					==========================
					""");
			
			
			//reversed triangle
			for(int i = 1;i<= len;i++) {
				for(int j = len; j >= i;j--) {
					System.out.print(design);
				}
				System.out.println();
			}
			
		}
		
		case 4-> {
			System.out.println("""
					
					==========================
					    Spaced Triangle
					==========================
					""");
			
			//spaced triangle
			for (int i = len; i >= 1; i--) { 
				for (int j = 0; j < i; j++) { 
					System.out.print(" ");
				}
				for (int j = len; j >= i; j--) { 
					System.out.print(design); 
					}
				System.out.println(); 
				}
		}
		
		case 5->{
			System.out.println("""
					
					==========================
					    Pyramid Pattern
					==========================
					""");
			//proper pyramid;
			int trigger = 1;
			for(int i = len; i >= 0;i--) {
				for(int j = 0; j<i;j++) {
					System.out.print(" ");
				}
				for(int k = 0; k<trigger;k++) {
					System.out.print(design);
				}
				trigger += 2;
				System.out.println();
				
			}
			
		}
		
		case 6->{
			System.out.println("""
					
					==========================
					    Diamond Pattern
					==========================
					""");
			//making a diamond
			int trigger2 = 1;
			for(int i = len; i >= 0;i--) {
				for(int j = 0; j<i;j++) {
					System.out.print(" ");
				}
				for(int k = 0; k<trigger2;k++) {
					System.out.print(design);
				}
				trigger2 += 2;
				System.out.println();
				
			}
			trigger2 -= 4;
			
			for(int i = 0; i<= len;i++) {
				for(int j = 0; j<=i;j++) {
					System.out.print(" ");
				}
				for(int k = 0; k < trigger2 ;k++) {
					System.out.print(design);
				}
				trigger2 -= 2;
				System.out.println();
				
			}
			
		}
		case 7 ->{
			System.out.print("Re-Enter Size of The Design : ");
			design = sc.next();
		}
		
		case 8->{
			sc.close(); 
			System.exit(0);
		}
	}
			
			
	}
	}
}
