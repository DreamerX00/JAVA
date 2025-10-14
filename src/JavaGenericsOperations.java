import javax.swing.*;
import java.util.ArrayList;

public class JavaGenericsOperations {
    static void main() {
        //Before Java 5, The Below Example Shows How Manual Casting Is Needed,
        // And The Issue Of Type Safety
        // No Compile Time Checking
        ArrayList myList = new ArrayList<>();
        myList.add("Akash");
        myList.add("88");
        myList.add(true);
        myList.add(22);
        myList.add('B');
        String obj1 = (String) myList.get(0);
        IO.println(obj1);
        myList.forEach(IO::println);

        //Using Generics to Define the type of Class
        //before Using it

        BoxClass<String,Integer> boxClass = new BoxClass<>();//this is now type safe
        boxClass.setAge(24);
        boxClass.setValue("Akash");

        IO.println(boxClass);

        //Interface Example of Generics

        loginForm<Integer> user1 = new loginForm<>();
        user1.setUserName("Akash0203");
        user1.setPassword(885181);

        IO.println(user1.getPassword());

    }
}


class BoxClass<F,S> {
    private F value;
    private S age;

    public BoxClass(F value, S age) {
        this.value = value;
        this.age = age;
    }

    public BoxClass() {
    }
    public BoxClass(F value) {
        this.value = value;
    }

    public F getValue() {
        return value;
    }

    public void setValue(F value) {
        this.value = value;
    }

    public S getAge() {
        return age;
    }

    public void setAge(S age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "BoxClass {\n" +
                "\tvalue = " + value +
                "\n\tage = " + age +
                "\n}";
    }
}

interface Password<P>{
    P getPassword();
    void setPassword(P password);
}

class loginForm<T> implements Password<T> {
    private String userName;
    private T password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public T getPassword() {
        return  password;
    }

    @Override
    public void setPassword(T password) {
        this.password = password;
    }
}