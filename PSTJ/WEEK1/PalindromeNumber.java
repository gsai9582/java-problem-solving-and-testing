import java.util.*;
import java.util.function.Predicate;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Predicate<Integer> isPalindrome = n -> {
            String s = String.valueOf(n);
            return s.equals(new StringBuilder(s).reverse().toString());
        };

        System.out.println(isPalindrome.test(num) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
