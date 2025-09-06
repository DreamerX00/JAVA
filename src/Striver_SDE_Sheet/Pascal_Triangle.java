package Striver_SDE_Sheet;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
	
	List<List<Integer>> pascal(int numRows){
		List<List<Integer>> pl = new ArrayList<>();
		
		for(int i = 0; i < numRows;i++) {
			List<Integer> temp = new ArrayList<>();
			for(int j = 0;j<= i;j++) {
				if(j == 0 || j == i) {
					temp.add(1);
				}
				else {
					int value = pl.get(i-1).get(j-1) + pl.get(i-1).get(j);
					temp.add(value);
				}
			}
			pl.add(temp);
		}
		
		return pl;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Pascal_Triangle pt = new Pascal_Triangle();
		System.out.println(pt.pascal(5));
	}
}
