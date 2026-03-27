import java.util.*;

public class DigitCountTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int[] count = new int[10];
        for (char ch : number.toCharArray()) {
            if (Character.isDigit(ch)) {
                count[ch - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + " -> " + count[i]);
            }
        }
        sc.close();
    }
}
