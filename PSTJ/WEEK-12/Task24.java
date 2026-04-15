// Task 24 - Sample Program (Modify as per syllabus question)
import java.util.*;

public class Task24 {
    public static void main(String[] args) {
        System.out.println("Task 24 Execution - Implement logic as per syllabus");

        // Example: Find max element
        int[] arr = {3, 7, 2, 9, 5};
        int max = arr[0];
        for(int n : arr){
            if(n > max) max = n;
        }
        System.out.println("Max: " + max);
    }
}