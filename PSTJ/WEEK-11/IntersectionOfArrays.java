import java.util.*;

public class IntersectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int n : nums1) set1.add(n);
        for(int n : nums2){
            if(set1.contains(n)) result.add(n);
        }

        int[] res = new int[result.size()];
        int i=0;
        for(int n : result) res[i++] = n;
        return res;
    }

    public static void main(String[] args){
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        System.out.println(Arrays.toString(intersection(a,b)));
    }
}