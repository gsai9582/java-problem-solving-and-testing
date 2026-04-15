import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortUtilsTest {
    @Test
    void testSort(){
        int[] arr = {3,1,2};
        int[] sorted = SortUtils.sort(arr);
        assertArrayEquals(new int[]{1,2,3}, sorted);
    }

    @Test
    void testEmpty(){
        int[] arr = {};
        assertArrayEquals(new int[]{}, SortUtils.sort(arr));
    }
}