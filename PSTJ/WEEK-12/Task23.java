// Task 23 - Sample Program (Modify as per syllabus question)
import java.util.*;

public class Task23 {
    public static void main(String[] args) {
        System.out.println("Task 23 Execution - Implement logic as per syllabus");

        // Example: Count vowels
        String str = "education";
        int count = 0;
        for(char c : str.toCharArray()){
            if("aeiou".indexOf(c) != -1) count++;
        }
        System.out.println("Vowels: " + count);
    }
}