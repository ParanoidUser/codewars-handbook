import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new BigInteger[]{BigInteger.valueOf(5), BigInteger.valueOf(0)}, ReverseEuclid.findInitialNumbers(5, 0));
    assertArrayEquals(new BigInteger[]{BigInteger.valueOf(10293696), BigInteger.valueOf(6361854)}, ReverseEuclid.findInitialNumbers(222, 22));
    assertArrayEquals(new BigInteger[]{BigInteger.valueOf(374669148), BigInteger.valueOf(231558268)}, ReverseEuclid.findInitialNumbers(172, 30));
  }
}