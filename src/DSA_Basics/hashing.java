package DSA_Basics;
import java.util.*;
public class hashing {
	static Scanner sc = new Scanner(System.in);
	static String getString() {
		return sc.nextLine();
	}
	static int[] getArray(int size) {
		int arr[] = new int[size];
		System.out.println("Start Adding Numbers : ");
		for(int i = 0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	static void checkFrequencyOfArray() {
		System.out.print("Enter The Size Of Array : ");
		int size = sc.nextInt();
		int arr[] = getArray(size);
		
		int hash[] = new int[Arrays.stream(arr).max().getAsInt()+1];
		
		for(int num : arr) {
			hash[num]++;
		}
		
		for(int i = 0; i < hash.length;i++) {
			if(hash[i] != 0) {
				System.out.println(i + " == "+ hash[i]);
			}
		}
	}
	static void checkFrequencyOfString() {
		String myString = getString().toLowerCase();
		int hash[] = new int[26];
		
		for(int i = 0; i<myString.length();i++) {
			hash[myString.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
            if(hash[i] != 0) {
                System.out.println((char)(i + 'a') + " == " + hash[i]);
            }
		}
	}
	
	public static void main(String[] args) {
		checkFrequencyOfString();
		checkFrequencyOfArray();
	}
}
