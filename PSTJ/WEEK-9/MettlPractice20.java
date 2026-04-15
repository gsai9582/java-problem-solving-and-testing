// Mettl Practice 20
import java.util.*;

public class MettlPractice20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        // Example: factorial
        int fact = 1;
        for(int i=1;i<=n;i++) fact *= i;

        System.out.println("Factorial: " + fact);
    }
}