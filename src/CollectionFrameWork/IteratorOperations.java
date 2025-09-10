package CollectionFrameWork;

import java.util.*;

public class IteratorOperations {
    public static void main(String args[]) {
        List<String> myList = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            myList.add("Item " + i);
        }
        //Iterator method to print
        Iterator<String> it = myList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //normal reference method to print
        //myList.forEach(System.out::print)

        //ListIterator way
        System.out.println("==== Using ListIterator ====");
        ListIterator<String> lit = myList.listIterator();
        while(lit.hasNext()) {
            System.out.println(lit.next());
            lit.set("Modified " + lit.previousIndex());
            System.out.println(lit.hasPrevious() + " " + lit.next());
        }
        myList.forEach(System.out::println);
    }
}
