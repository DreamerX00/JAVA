import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations {
    public static void main(String[] args) {
        Deque<String> myDeque = new ArrayDeque<>();
        myDeque.offer("First");
        myDeque.offer("Second");
        myDeque.offerFirst("Zeroth");
        myDeque.offerLast("Third");

        System.out.println("Deque after additions: " + myDeque);
        System.out.println("First Element: " + myDeque.peekFirst());
        System.out.println("Last Element: " + myDeque.peekLast());
        myDeque.pollFirst();
        System.out.println("Deque after removing first: " + myDeque);
        myDeque.pollLast();
        System.out.println("Deque after removing last: " + myDeque);

        myDeque.add("Fourth");
        System.out.println("Deque after adding 'Fourth': " + myDeque);
        myDeque.addLast("Fifth");
        System.out.println("Deque after adding 'Fifth' at last: " + myDeque);
        myDeque.addFirst("New Zeroth");
        System.out.println("Deque after adding 'New Zeroth' at first: " + myDeque);

    }
}
