import java.util.*;

public class CyclicDigitSumTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int total = 0;
        for (int i = 0; i < num.length(); i++) {
            int sum = 0;
            for (int j = 0; j < num.length(); j++) {
                int index = (i + j) % num.length();
                sum += num.charAt(index) - '0';
            }
            total += sum;
        }
        System.out.println(total);
        sc.close();
    }
}
