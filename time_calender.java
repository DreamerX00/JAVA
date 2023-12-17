import java.util.Calendar;
import java.util.TimeZone;

public class time_calender {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance(TimeZone.getTimeZone("America/Fortaleza"));
        cl.set(2002, 2, 2);
        System.out.println(cl.getCalendarType());
        System.out.println(cl.getTimeZone().getID());

        System.out.println(cl.getTime());
    }
}
