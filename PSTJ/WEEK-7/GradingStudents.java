import java.util.*;

public class GradingStudents {
    public static int round(int grade) {
        if(grade < 38) return grade;
        int next = ((grade/5)+1)*5;
        return (next - grade < 3) ? next : grade;
    }

    public static void main(String[] args) {
        int[] grades = {73,67,38,33};
        for(int g : grades) System.out.println(round(g));
    }
}