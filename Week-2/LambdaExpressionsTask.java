import java.util.*;

public class LambdaExpressionsTask {

    interface PerformOperation {
        boolean check(int a);
    }

    static PerformOperation isOdd() {
        return (a) -> a % 2 != 0;
    }

    static PerformOperation isPrime() {
        return (a) -> {
            if (a <= 1) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;
            }
            return true;
        };
    }

    static PerformOperation isPalindrome() {
        return (a) -> {
            int original = a, reversed = 0;
            while (a > 0) {
                reversed = reversed * 10 + (a % 10);
                a /= 10;
            }
            return original == reversed;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();
            PerformOperation op;
            switch (choice) {
                case 1:
                    op = isOdd();
                    System.out.println(op.check(num) ? "ODD" : "EVEN");
                    break;
                case 2:
                    op = isPrime();
                    System.out.println(op.check(num) ? "PRIME" : "COMPOSITE");
                    break;
                case 3:
                    op = isPalindrome();
                    System.out.println(op.check(num) ? "PALINDROME" : "NOT PALINDROME");
                    break;
            }
        }
        sc.close();
    }
}
