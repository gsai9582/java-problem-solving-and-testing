import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginValidatorTest {
    @Test
    void testValidLogin(){
        LoginValidator lv = new LoginValidator();
        assertTrue(lv.validate("admin","1234"));
    }

    @Test
    void testInvalidLogin(){
        LoginValidator lv = new LoginValidator();
        assertFalse(lv.validate("",""));
        assertFalse(lv.validate(null,"1234"));
    }
}