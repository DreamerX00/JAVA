package myjava;

class myThread extends Thread{
    public void run(){
        int i = 1;
        while (i <= 10){
            System.out.println("Hello Thread "+this.getName());
            i++;
        }
    }
}
class myThread12 extends Thread{
    public void run(){
        int i = 1;
        while (i <= 10){
            System.out.println("Hello Thread12 "+this.getName());
            i++;
        }
    }
}class myThread13 extends Thread{
    public void run(){
        int i = 1;
        while (i <= 10){
            System.out.println("Hello Thread12 "+this.getName());
            i++;
        }
    }
}

public class threadMethods {
    public static void main(String[] args) {
        myThread mth1 = new myThread();
        mth1.setName(" Nezuko");
        myThread12 mth2 = new myThread12();
        mth2.setName("Tanjiro");
        myThread13 mth3 = new myThread13();
        mth3.setName("Zenitsu");

        mth1.start();
        try{
            mth1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        mth2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mth3.start();
    }
}
