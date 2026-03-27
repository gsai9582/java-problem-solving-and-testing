import java.util.*;

public class MiniMaxSumTask {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        long total = arr.stream().mapToLong(Integer::longValue).sum();
        int min = Collections.min(arr);
        int max = Collections.max(arr);
        long minSum = total - max;
        long maxSum = total - min;
        System.out.println(minSum + " " + maxSum);
    }
}
