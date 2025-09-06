import java.time.LocalTime;

public class Local_Time {
    public static void main(String[] args) {
        int j = 1;
        while (j < 10000){
            LocalTime lt = LocalTime.now();
            System.out.print("\r"+lt);
            j++;
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException I){
                I.printStackTrace();
            }
        }
    }
}
