package CollectionFrameWork;

import java.util.LinkedHashMap;

public class LRUCacheConcept<K extends newEmployees,V> extends LinkedHashMap<K, V> {
	private int capacity;
	public LRUCacheConcept(int capacity){
		super(capacity,0.75f,true);
		this.capacity = capacity;
	}
	// till here we just simply copied the functionality of linkedHashMap and converted it into a new type of class that accepts only capacity as parameter
	
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return "Priya".equalsIgnoreCase((eldest.getKey()).getNameString());
	}//this is where magic happens
	// we basically control what will happen to data on latest entries.
	
	
	
	
	
	
	
	
	//main method starts from here
	public static void main(String[] args) {
		newEmployees e1 = new newEmployees("Akash", 1, Positions.CEO);
        newEmployees e2 = new newEmployees("Priya", 2, Positions.Manager);
        newEmployees e3 = new newEmployees("Ravi", 3, Positions.Employee);
        newEmployees e4 = new newEmployees("Sneha", 4, Positions.Intern);
        newEmployees e5 = new newEmployees("Vikram", 5, Positions.Director);
        newEmployees e6 = new newEmployees("Meena", 6, Positions.Employee);
        newEmployees e7 = new newEmployees("Arjun", 7, Positions.Manager);
        newEmployees e8 = new newEmployees("Kavita", 8, Positions.Intern);
        newEmployees e9 = new newEmployees("Rahul", 9, Positions.Employee);
        newEmployees e10 = new newEmployees("Neha", 10, Positions.Director);
        newEmployees e11 = new newEmployees("Priya", 2, Positions.Manager);
        
        LRUCacheConcept<newEmployees, Integer> salaryMap =  new LRUCacheConcept<>(11);
        salaryMap.put(e1, 20000000);
        salaryMap.put(e2, 1200000);
        salaryMap.put(e3, 800000);
        salaryMap.put(e4, 300000);
        salaryMap.put(e5, 1500000);
        salaryMap.put(e6, 850000);
        salaryMap.put(e7, 1100000);
        salaryMap.put(e8, 320000);
        salaryMap.put(e9, 900000);
        salaryMap.put(e10, 1400000);
        salaryMap.put(e11, 1200000);
        
        
        salaryMap.forEach((x,y)-> System.out.println(x+" -> "+y));
	}

}
