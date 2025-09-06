package myjava;

import java.util.Calendar;

public class TimeClass {
    public static void main(String[] args) {
        int z = 10;
        for (int i = 0; i < z; i++) {
            Calendar cd = Calendar.getInstance();
            System.out.print(
                    "\rCurrent Time: "
                            + cd.get(Calendar.DATE) +
                            " / "
                            + (cd.get(Calendar.MONTH) + 1) +  // Adding 1 because months are zero-based
                            " / "
                            + cd.get(Calendar.YEAR) +
                            " ==> "
                            + cd.get(Calendar.HOUR) +
                            " : "
                            + cd.get(Calendar.MINUTE) +
                            " : "
                            + cd.get(Calendar.SECOND) +
                            " : "
                            + cd.get(Calendar.MILLISECOND)
            );
            z++;
            try {
                // Simulating some work
                Thread.sleep(10); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nDone!");
    }
}
