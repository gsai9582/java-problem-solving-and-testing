import java.util.*;

public class StressTestSort {
    public static void main(String[] args) {
        int n = 100000;
        int[] arr = new int[n];
        Random rand = new Random();

        for(int i=0;i<n;i++){
            arr[i] = rand.nextInt(100000);
        }

        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end-start) + " ms");
    }
}