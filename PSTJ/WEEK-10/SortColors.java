import java.util.*;

public class SortColors {
    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}