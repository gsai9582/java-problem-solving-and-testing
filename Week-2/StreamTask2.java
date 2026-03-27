import java.util.*;
import java.util.stream.*;

public class StreamTask2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 10, 7);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
