import java.util.*;

public class arrayListOperations {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();//default capacity is 10
		list.add(1);
		list.add(99);
		list.add(33);
		list.addLast(38);
		System.out.println("The item on index 0 is : "+list.get(0));
		System.out.println("The size of the list is : "+list.size());
		
		for(int x : list) {
			System.out.println(x);
		}
		
		System.out.println("\n"+list.contains(99));
		System.out.println(list.contains(383));
		
		list.remove(1);
		
		list.add(1,50);
		
		System.out.println(list);
		
		list.set(1,90);
		
		System.out.println(list);
		
		ArrayList<Integer> myNewList = new ArrayList<>(1000);
		// I gave it an initial Capacity;
		
		list.trimToSize(); //reduces extra capacity
		
		
		
		List<String> assList = Arrays.asList("Monday","Tuesday");//size is fixed not expandable
		
		System.out.println(assList);
		
//		assList.add("Wednesday") not work
//		assList.remove(0); also won't work
		System.out.println("list = "+assList+" size = "+assList.size());
		System.out.println("item on index 1 = "+assList.get(1));
		
		String[] myArr = {"Akash","Tanisha"};
		List<String> assList2 = Arrays.asList(myArr);
		
		
		System.out.println(assList2);
		
//		assList.add("Wednesday") not work
//		assList.remove(0); also won't work
		System.out.println("list = "+assList2+" size = "+assList2.size());
		System.out.println("item on index 1 = "+assList2.get(1));
		
		List<Integer> list3 = List.of(1,2,3,4);//immutable fixed size;
		System.out.println(list3);
		
		List<String> strList = new ArrayList<>(assList);
		strList.add("Cookie");
		strList.add("Dreamer");
		
		System.out.println(strList);
		
		//Add on particular index
		strList.add(1,"Drookie");
		
		//add all from another list
		List<Integer> copyList = new ArrayList<>(list3);
		//copy all list and add to last
		copyList.addAll(list);
		copyList.addLast(88);
		System.out.println(copyList);
		
		//adds all on particular index;
		copyList.addAll(2,list3);
		
		copyList.remove(4);//remove the index 4
		
		System.out.println(copyList);
		
		copyList.remove(Integer.valueOf(90));
		
		System.out.println(copyList);
		
		strList.remove("Cookie");
		
		System.out.println(strList);
		
		Collections.sort(strList);
		strList.sort(null);
		System.out.println(strList);
		
		var list9 = new ArrayList<String>();
		
		list9.add("hi this is var");
		System.out.println(list9);
		

		
	}
}
