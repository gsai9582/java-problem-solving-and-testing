import java.util.*;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] seen = new boolean[nums.length+1];

        for(int num : nums){
            seen[num] = true;
        }

        for(int i=1;i<=nums.length;i++){
            if(!seen[i]) result.add(i);
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}