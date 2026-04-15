import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    void testReverse(){
        StringUtils su = new StringUtils();
        assertEquals("olleh", su.reverse("hello"));
    }

    @Test
    void testPalindrome(){
        StringUtils su = new StringUtils();
        assertTrue(su.isPalindrome("madam"));
    }
}