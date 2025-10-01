package MultiThreading;

public class LambdaThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello From Runnable");
        };

        whoAmI user1 = name -> "Hello "+name;
        System.out.println(user1.greet("Akash"));

        Thread t1 = new Thread(runnable);
        //Best way to do is
        Thread t2 = new Thread(()-> System.out.println("Hello From Thread Lambda"));
        t2.start();
        t1.start();
    }
}


@FunctionalInterface
interface whoAmI{
    String greet(String name);
}
