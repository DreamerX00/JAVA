class greet extends Thread{
    public greet(String a){
        super(a);
    }
    public void run(){
        int i = 0;
        while (i != 10){
            System.out.println(this.getName());
            i++;
        }
    }
}

public class thread_practice {
    public static void main(String[] args) {
        greet gm = new greet("Good Morning");
        greet wm = new greet("Welcome");
//        System.out.println("Question no. 1");
//        System.out.println();


        gm.start();
        wm.start();

//        System.out.println();

//        System.out.println("Question no. 2");
//        System.out.println();
//
//        gm.start();
//        try{
//            Thread.sleep(200);
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        wm.start();
//
//        System.out.println();
//
//        System.out.println("Question no. 3");
//        System.out.println();
//
//        gm.setPriority(Thread.MIN_PRIORITY);
//        System.out.println(gm.getPriority());
//        wm.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(wm.getPriority());
//
//        System.out.println();
//
        System.out.println("Question no. 4");
        System.out.println();

        System.out.println(gm.getState());
        System.out.println(wm.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println();
//
//        System.out.println("Question no. 5");
//        System.out.println();

    }
}
