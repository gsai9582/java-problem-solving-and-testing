import java.util.*;
import java.util.function.Function;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Function<Integer, Integer> fib = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                if (x <= 1) return x;
                return this.apply(x - 1) + this.apply(x - 2);
            }
        };

        System.out.println(fib.apply(n));
        sc.close();
    }
}
