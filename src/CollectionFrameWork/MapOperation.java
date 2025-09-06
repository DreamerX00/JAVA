package CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperation {
	public static void main(String[] args) {
		HashMap<String, String>myMap = new HashMap<>();
		myMap.put("Naruto", "Naruto Uzumaki");
		myMap.put("One Piece", "Monkey D. Luffy");
		myMap.put("Attack on Titan", "Eren Yeager");
		myMap.put("Death Note", "Light Yagami");
		myMap.put("Fullmetal Alchemist", "Edward Elric");
		myMap.put("Demon Slayer", "Tanjiro Kamado");
		myMap.put("Jujutsu Kaisen", "Yuji Itadori");
		myMap.put("My Hero Academia", "Izuku Midoriya");
		myMap.put("Tokyo Ghoul", "Ken Kaneki");
		myMap.put("Bleach", "Ichigo Kurosaki");
		
		
		myMap.forEach((key,value) -> System.out.println(key+" -> "+value));
		
		System.out.println("""
				
				
				=========================== 
				[						  ] 
				[ Another Way Of Iterating] 
				[						  ] 
				=========================== 
				""");
		//another way to iterate over a map is 
		Set<Map.Entry<String, String>> entries = myMap.entrySet();
		
		for(Map.Entry<String, String> itemEntry : entries) {
			itemEntry.setValue(itemEntry.getValue().toUpperCase());
			System.out.println(itemEntry.getKey()+" -> "+itemEntry.getValue());
		}

	}
}
