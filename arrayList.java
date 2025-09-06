import java.util.ArrayList;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> List1 = new ArrayList<String>();
        List1.add("Apple");
        List1.add("Orange");
        List1.add("Guava");
        List1.add("Grapes");
        for (int i = 0; i < List1.size();i++){
            System.out.println("Item on Index : "+i+" is --> "+List1.get(i));
        }
    }
}
