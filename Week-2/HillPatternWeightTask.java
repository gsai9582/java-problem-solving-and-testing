import java.util.*;

public class HillPatternWeightTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println(total);
        sc.close();
    }
}
