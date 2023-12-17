class naming extends Thread implements Runnable{
    public naming(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("The Name Has Been Changed");
    }
}

public class threadConstructor {
    public static void main(String[] args) {
        naming th1 = new naming("Akash Singh");
        Thread th2 = new Thread(th1,"Akash Singh runnable");
        th1.start();
        System.out.println(th1.getName()+" and "+ th1.threadId());
        th2.start();
        System.out.println(th2.getName()+" and "+ th2.threadId());

    }
}
