import java.util.*;

public class SumOfLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = (a % 10) + (b % 10);
        System.out.println(sum);
        sc.close();
    }
}
