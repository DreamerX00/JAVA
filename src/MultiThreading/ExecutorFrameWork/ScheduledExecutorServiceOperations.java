package MultiThreading.ExecutorFrameWork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceOperations {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
//        scheduledExecutorService.schedule(() -> System.out.println("Time Is "+ LocalDateTime.now()),5, TimeUnit.SECONDS);
//        scheduledExecutorService.shutdown();
//        scheduledExecutorService.awaitTermination(6,TimeUnit.SECONDS);
//        System.out.println(scheduledExecutorService.isShutdown());
          scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("Date is "+ LocalDate.now()),2,2,TimeUnit.SECONDS);
          //scheduledExecutorService.shutdown(); -> stops the scheduled service before execution
          scheduledExecutorService.schedule(scheduledExecutorService::shutdown,10,TimeUnit.SECONDS);
          //This will perform one task, or give one task a proper specified time
          scheduledExecutorService.scheduleWithFixedDelay(() -> System.out.println("Time : "+ LocalTime.now()),2,5,TimeUnit.SECONDS);
          scheduledExecutorService.schedule(scheduledExecutorService::shutdown,30,TimeUnit.SECONDS);


    }
}
