package Java8Streams;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamOperations {
    static void main() {
        // A Type of Stream that enables parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can significantly improve performance of large data sets
        // workload is distributed across multiple threads
        long startTime = System.currentTimeMillis();
        List<Integer> myFactList = (Stream.iterate(1, x -> x+1).limit(20000)).toList();
        List<Long> myFinalResultList = myFactList.stream().map(ParallelStreamOperations::factorial).toList();
        IO.println("Total Time Taken By Stream Is : "+(System.currentTimeMillis()-startTime)+" ms");

        long startTime2 = System.currentTimeMillis();
        List<Integer> myFactList2 = (Stream.iterate(1, x -> x+1).limit(20000)).toList();
        List<Long> myFinalResultList2 = myFactList.parallelStream().map(ParallelStreamOperations::factorial).toList();
        IO.println("Total Time Taken By Parallel Stream Is : "+(System.currentTimeMillis()-startTime2)+" ms");

        //Parallel stream are most effective for CPU-intensive or large datasets where tasks are independent
        //They may add overhead for simple tasks or small datasets

    }
    static long factorial(int n){
        if(n == 1) return n;
        return n * factorial(n-1);
    }
}
