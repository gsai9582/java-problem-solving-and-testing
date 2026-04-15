import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testDivideException(){
        Calculator c = new Calculator();
        assertThrows(ArithmeticException.class, () -> c.divide(10,0));
    }
}