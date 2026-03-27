import java.util.*;
import java.util.stream.*;

public class StreamTask4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 2, 3, 8, 10, 5);
        List<Integer> result = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
