import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeParameterizedTest {

    boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    @ParameterizedTest
    @ValueSource(ints = {2,3,5,7})
    void testPrime(int num){
        assertTrue(isPrime(num));
    }
}