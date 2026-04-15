import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class MathUtilsTest {

    @Test
    void testMaxSubarray(){
        assertEquals(6, MathUtils.maxSubarray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    @Test
    void testPrefixSum(){
        assertArrayEquals(new int[]{1,3,6}, MathUtils.prefixSum(new int[]{1,2,3}));
    }

    @Test
    void testFrequency(){
        Map<Integer,Integer> map = MathUtils.frequency(new int[]{1,1,2});
        assertEquals(2, map.get(1));
    }
}