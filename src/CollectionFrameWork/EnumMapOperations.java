package CollectionFrameWork;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapOperations {
	public static void main(String[] args) {
		
		Map<Position,String> myEmployees = new EnumMap<>(Position.class); 
	    myEmployees.put(Position.Intern, "Aarav, Sneha");
	    myEmployees.put(Position.Fresher, "Riya, Kunal"); 
	    myEmployees.put(Position.Trainee, "Mehul, Tanya");
	    myEmployees.put(Position.Employee, "Neha, Arjun, Dev");
	    myEmployees.put(Position.Manager, "Siddharth, Priya, Ramesh");
	    myEmployees.put(Position.SeniorManager, "Anjali, Mohit");
	    myEmployees.put(Position.CEO, "Rajesh, Kavita"); 
	    myEmployees.put(Position.Director, "Vikram, Snehal, Deepak, Isha");
	    myEmployees.forEach((x,y) -> System.out.println("\n"+x+" -> "+y));

	}
	
	enum Position{
		Intern,
		Fresher,
		Trainee,
		Employee,
		Manager,
		SeniorManager,
		CEO,
		Director
	}
}
