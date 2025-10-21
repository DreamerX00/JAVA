package GFGCourse;

import java.util.Arrays;
import java.util.stream.Collectors;

public class maxElement {
    static void main() {
        int arr[] = {12,398,8,39,88,55,-389,-34,-27,-59};
        double avg = Arrays.stream(arr).filter(x -> x > 0).average().orElse(0);
        IO.println((int)avg);
    }
}
