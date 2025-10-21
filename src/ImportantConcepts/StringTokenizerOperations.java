package ImportantConcepts;

import java.util.Iterator;
import java.util.Objects;
import java.util.StringTokenizer;

public class StringTokenizerOperations {
    static void main() {
        StringTokenizer st = new StringTokenizer("Hello This Is A New String");
        Iterator<Object> it = st.asIterator();
        while (it.hasNext()){
            IO.println(it.next().toString());
        }
    }
}
