import java.util.ArrayList;
import java.util.List;

public class JavaGenericsBoundedTypeOperations {
    static void main() {
        List<String> myList = List.of("A", "B", "C");
        myTodoList<List<String>,String> myMondayTask = new myTodoList<>(myList);
        IO.println(myMondayTask);
    }
}

class myTodoList<T extends List<V>, V>{
    private final T myList;
    public myTodoList(T myList) {
        this.myList = myList;
    }

    public void addTask(V myValue) {
        myList.add(myValue);
    }

    public void removeTask(V myValue) {
        myList.remove(myValue);
    }

    public T getMyTask() {
        return myList;
    }

    public void addMultipleTask(T newTask){
        myList.addAll(newTask);
    }

    @Override
    public String toString() {
        return "myTodoList{" +
                "myList=" + myList +
                '}';
    }
}

