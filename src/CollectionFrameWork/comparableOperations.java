package CollectionFrameWork;

import java.util.Collections;
import java.util.LinkedList;

public class comparableOperations {
	public static void main(String[] args) {
		LinkedList<userData> myUsers = new LinkedList<>();
		 myUsers.add(new userData(101, "Aarav", 24, "Delhi"));
	     myUsers.add(new userData(102, "Isha", 29, "Mumbai"));
	     myUsers.add(new userData(103, "Rohan", 21, "Bangalore"));
	     myUsers.add(new userData(104, "Sneha", 26, "Hyderabad"));
	     myUsers.add(new userData(105, "Vivaan", 30, "Chennai"));
	     myUsers.add(new userData(106, "Meera", 23, "Kolkata"));
	     myUsers.add(new userData(107, "Kabir", 27, "Pune"));
	     myUsers.add(new userData(108, "Ananya", 25, "Ahmedabad"));
	     myUsers.add(new userData(109, "Yash", 22, "Jaipur"));
	     myUsers.add(new userData(110, "Diya", 28, "Lucknow"));
	     
	     myUsers.sort(null);
	     System.out.println(myUsers);
	     
	}
}

class userData implements Comparable<userData>{
	private int ID;
	private String NAME;
	private int age;
	private String address;
	public userData(int iD, String nAME, int age, String address) {
		super();
		ID = iD;
		NAME = nAME;
		this.age = age;
		this.address = address;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "\nID = " + ID + "\nNAME = "+ NAME + "\nAGE = "+age+"\nADDRESS = "+address+"\n";
	}
	@Override
	public int compareTo(userData o) {
		return this.getAge() - o.getAge();
	}
	
	
		
}
