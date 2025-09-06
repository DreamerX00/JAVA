
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class time_formatter {
    public static void main(String[] args) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd / MM / yyy || HH : mm : ss");
        int temp = 10000;
        while (temp != 0){
            LocalDateTime lt = LocalDateTime.now();
            String time = lt.format(dt);
            System.out.print("\r"+time);
            try {
                Thread.sleep(1);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            temp--;
        }

    }
}
