import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathTest {
    @Test
    void testAdd(){
        SimpleMath sm = new SimpleMath();
        assertEquals(5, sm.add(2,3));
    }
}