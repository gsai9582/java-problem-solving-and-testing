import java.util.*;

public class MathUtils {

    // Max Subarray Sum (Kadane's Algorithm)
    public static int maxSubarray(int[] arr){
        int maxSoFar = arr[0];
        int curr = arr[0];

        for(int i=1;i<arr.length;i++){
            curr = Math.max(arr[i], curr + arr[i]);
            maxSoFar = Math.max(maxSoFar, curr);
        }
        return maxSoFar;
    }

    // Prefix Sum
    public static int[] prefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }

    // Frequency Count
    public static Map<Integer,Integer> frequency(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        return map;
    }
}