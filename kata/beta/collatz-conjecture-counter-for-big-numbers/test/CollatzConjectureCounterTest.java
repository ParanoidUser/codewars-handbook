import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class CollatzConjectureCounterTest {
  @Test
  void sample() {
    assertEquals(0, CollatzConjectureCounter.countCollatzNumbers(BigInteger.valueOf(1)));
    assertEquals(1, CollatzConjectureCounter.countCollatzNumbers(BigInteger.valueOf(2)));
    assertEquals(7, CollatzConjectureCounter.countCollatzNumbers(BigInteger.valueOf(3)));
    assertEquals(16, CollatzConjectureCounter.countCollatzNumbers(BigInteger.valueOf(7)));
    assertEquals(26, CollatzConjectureCounter.countCollatzNumbers(BigInteger.valueOf(217)));
  }
}