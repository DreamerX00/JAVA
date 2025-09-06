package CollectionFrameWork;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class mapOperationsWithHashCode {
	
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
        
        HashMap<newEmployees, Integer> salaryMap =  new HashMap<>();
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
        
        
        
        for(Map.Entry<newEmployees, Integer> entriesEntry : salaryMap.entrySet()) {
        	System.out.println(entriesEntry.getKey()+" -> "+entriesEntry.getValue());
        }
        
     
        
    
	}

}

enum Positions{
	Intern,
	Employee,
	Manager,
	CEO,
	Director
}

class newEmployees implements Comparable<newEmployees>{
	private String nameString;
	private int id;
	private Positions positions;
	public newEmployees(String nameString, int id, Positions positions) {
		super();
		this.nameString = nameString;
		this.id = id;
		this.positions = positions;
	}
	
	
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Positions getPositions() {
		return positions;
	}
	public void setPositions(Positions positions) {
		this.positions = positions;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(nameString,id);
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) {
			return false;
		}
		
		if(this == obj) {
			return true;
		}
		
		if(getClass() != obj.getClass()) return false;
		
		newEmployees employees = (newEmployees) obj;
		
		
		return id == employees.getId() && Objects.equals(nameString, employees.getNameString());
	}
	
	

	@Override
	public int compareTo(newEmployees o) {
		return this.getNameString().compareTo(o.getNameString());
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Id : "+getId()+"\nName : "+getNameString()+"\nPosition : "+getPositions());
	}
	
	
	
	
}
