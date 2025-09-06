package myjava;

class myThread1 implements Runnable{
    @Override
    public void run(){
        while (true){
            for (int i = 0; i < 20; i++) {
                System.out.println();
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            }
        }
    }
}
class myThread2 implements Runnable{
    @Override
    public void run(){
        while (true){
            for (int i = 0 ; i < 20 ;i++ ){
                System.out.print("\n");
                for (int j = 20; j > i; j--) {
                    System.out.print("* ");
                }
            }
        }
    }
}
public class threading {
    public static void main(String[] args) {
        myThread1 mt1 = new myThread1();
        Thread st = new Thread(mt1);
        myThread2 mt2 = new myThread2();
        Thread st1 = new Thread(mt2);
        st.start();
        st1.start();
        System.out.println(st.getId());
    }
}
