import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CSVParameterizedTest {

    int add(int a, int b){
        return a+b;
    }

    @ParameterizedTest
    @CsvSource({
        "1,2,3",
        "2,3,5",
        "5,5,10"
    })
    void testAdd(int a, int b, int result){
        assertEquals(result, add(a,b));
    }
}