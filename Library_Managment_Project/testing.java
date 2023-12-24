package Library_Managment_Project;

import java.util.HashMap;
import java.util.Map;

public class testing {
    public static void main(String[] args) {
        Map<Integer,String> book = new HashMap<>();
        book.put(10,"Hello Testing");
        System.out.println(book.get(10));
    }

}
