class loopAnimals extends Thread{
    public loopAnimals(String name){
        super(name);
    }
    public void run(){
        int i = 1;
        while (i < 10){
            i++;
            System.out.println("Name of The Animal is "+this.getName());
        }
    }
}

public class threadPriority {
    public static void main(String[] args) {
        loopAnimals th1 = new loopAnimals("Lion");

        loopAnimals th2 = new loopAnimals("Elephant");
        th2.setPriority(Thread.MAX_PRIORITY);
        loopAnimals th3 = new loopAnimals("Zebra");
        th3.setPriority(Thread.NORM_PRIORITY);
        loopAnimals th4 = new loopAnimals("Deer");
        th4.setPriority(Thread.MAX_PRIORITY);
        loopAnimals th5 = new loopAnimals("Snake");

        loopAnimals th6 = new loopAnimals("Dog");
        th6.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
    }
}
