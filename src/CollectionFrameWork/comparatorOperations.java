package CollectionFrameWork;

import java.util.*;


public class comparatorOperations {
	
	public static void main(String[] args) {
		List<String> cAnimals = new ArrayList<>(Arrays.asList("Lion", "Lepord", "Fox", "Wolf", "Tiger", "Cheetah"));

		List<String> hAnimals = new ArrayList<>(Arrays.asList("Buffalo", "Cow", "Giraffe", "Dog", "Cat", "Deer"));

		List<Integer> leapYears = new ArrayList<>(Arrays.asList(2000, 2004, 2008, 2012, 2016, 2020, 2024));

		List<Integer> healthCrisisYears = new ArrayList<>(
				Arrays.asList(2002, 2009, 2013, 2014, 2016, 2018, 2019, 2020, 2022, 2024));

		healthCrisisYears.sort(new MyIntegerComparator());

		System.out.println(healthCrisisYears);

		cAnimals.sort(new MyStringComparator());

		System.out.println(cAnimals);

		cAnimals.sort(new MyStringLetterComparator());

		System.out.println(cAnimals);

//		same can be written using lambda expressions
		cAnimals.sort((a, b) -> a.length() - b.length());
		System.out.println(cAnimals);

		cAnimals.sort((a, b) -> b.compareToIgnoreCase(a));
		System.out.println(cAnimals);

		System.out.println();

		// Experimenting With Classes
		List<Employees> myEmployees = new ArrayList<>();
		myEmployees.add(new Employees("Akash", 48000.00, Rank.Expert));
		myEmployees.add(new Employees("Tanisha", 92000.00, Rank.Experienced));
		myEmployees.add(new Employees("Sujal", 25000.00, Rank.Freshers));
		myEmployees.add(new Employees("Dheeraj", 0, Rank.Rookie));

		myEmployees.sort((a, b) -> (a.getSalary() - b.getSalary()) <= 0 ? 1 : -1);

		// sorted by salary
		myEmployees.forEach(n -> System.out
				.println("\nName = " + n.getName() + "\nSalary = " + n.getSalary() + "\nRank = " + n.getRank()));

		myEmployees.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));

		// sorted by name
		myEmployees.forEach(n -> System.out
				.println("\nName = " + n.getName() + "\nSalary = " + n.getSalary() + "\nRank = " + n.getRank()));

		myEmployees.sort((a, b) -> a.getRank().compareTo(b.getRank()));

		// sorted by enum
		myEmployees.forEach(n -> System.out
				.println("\nName = " + n.getName() + "\nSalary = " + n.getSalary() + "\nRank = " + n.getRank()));
		
		
		//Another Way Of Sorting is using comparing

		Comparator<Employees> comparator = Comparator.comparing(Employees::getSalary).reversed();
		
		myEmployees.sort(comparator);
		
		myEmployees.forEach(n -> System.out
				.println("\nName = " + n.getName() + "\nSalary = " + n.getSalary() + "\nRank = " + n.getRank()));
		
	}
}

class MyIntegerComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}

class MyStringComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
	
}

class MyStringLetterComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareToIgnoreCase(o2);
	}
}



// Practice Class Experiment
enum Rank{
	Rookie,
	Freshers,
	Experienced,
	Expert
}

class Employees{
	private String name;
	private double salary;
	private Rank rank;
	
	public Employees(String name, double salary, Rank rank) {
		this.name = name;
		this.salary = salary;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	
	
}



