import java.util.*;
import java.util.function.IntPredicate;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String type = sc.next(); // "even" or "odd"

        IntPredicate condition = type.equalsIgnoreCase("even") ?
                (n -> n % 2 == 0) : (n -> n % 2 != 0);

        int sum = String.valueOf(number)
                .chars()
                .map(c -> c - '0')
                .filter(condition)
                .sum();

        System.out.println(sum);
        sc.close();
    }
}
