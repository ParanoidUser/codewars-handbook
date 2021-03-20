import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class BasicTest {
  @Test
  void sample() {
    assertEquals(BigInteger.ZERO, JomoPipi.pipi(0));
    assertEquals(BigInteger.ONE, JomoPipi.pipi(1));
    assertEquals(BigInteger.valueOf(9), JomoPipi.pipi(2));
    assertEquals(BigInteger.valueOf(3025), JomoPipi.pipi(3));
  }
}