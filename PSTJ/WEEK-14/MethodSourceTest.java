import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;

public class MethodSourceTest {

    static Stream<Integer> data(){
        return Stream.of(1,2,3,4);
    }

    @ParameterizedTest
    @MethodSource("data")
    void testNotNull(int num){
        assertNotNull(num);
    }
}