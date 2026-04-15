import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

public class TimeoutTest {

    void slowMethod() throws InterruptedException {
        Thread.sleep(200);
    }

    @Test
    void testTimeout() {
        assertTimeout(Duration.ofMillis(300), () -> slowMethod());
    }
}