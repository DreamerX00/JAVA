package CollectionFrameWork;

import java.util.SortedMap;
import java.util.TreeMap;



public class sortedMapOperations {
	public static void main(String[] args) {
		SortedMap<newEmployees, Integer> salaryMap = new TreeMap<>((a,b)-> a.getId() - b.getId() );
		
        salaryMap.put(new newEmployees("Akash", 1, Positions.CEO), 20000000);
        salaryMap.put(new newEmployees("Priya", 2, Positions.Manager), 1200000);
        salaryMap.put(new newEmployees("Ravi", 3, Positions.Employee), 800000);
        salaryMap.put(new newEmployees("Sneha", 4, Positions.Intern), 300000);
        salaryMap.put(new newEmployees("Vikram", 5, Positions.Director), 1500000);
        salaryMap.put(new newEmployees("Meena", 6, Positions.Employee), 850000);
        salaryMap.put(new newEmployees("Arjun", 7, Positions.Manager), 1100000);
        salaryMap.put(new newEmployees("Kavita", 8, Positions.Intern), 320000);
        salaryMap.put(new newEmployees("Rahul", 9, Positions.Employee), 900000);
        salaryMap.put(new newEmployees("Neha", 10, Positions.Director), 1400000);
        salaryMap.put(new newEmployees("Priya", 2, Positions.Manager), 1200000);
        
        salaryMap.forEach((x,y) -> System.out.println("Salary : "+y+"\n"+x+"\n=========================="));
        
        
     // SortedMap exclusive methods
        System.out.println("\n🔹 First Entry:\n" + salaryMap.firstEntry());
        System.out.println("\n🔹 Last Entry:\n" + salaryMap.lastEntry());
        System.out.println("\n🔹 First Key:\n" + salaryMap.firstKey());
        System.out.println("\n🔹 Last Key:\n" + salaryMap.lastKey());
        
        newEmployees em1 = new newEmployees("Vikram", 5, Positions.Director);
        newEmployees em2 = new newEmployees("Rahul", 9, Positions.Employee);
        
        System.out.println("\n🔹 Head Map:\n"+salaryMap.headMap(em1).toString());
        System.out.println("\n🔹 Tail Map:\n"+salaryMap.headMap(em2).toString());
        
        
        
        
	}
	
	
	
}
