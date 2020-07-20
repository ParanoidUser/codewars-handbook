import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class OddityTest {
  @Test
  void sample() {
    assertEquals("odd", Oddity.oddity(BigInteger.valueOf(4)));
    assertEquals("even", Oddity.oddity(BigInteger.valueOf(12)));
    assertEquals("even", Oddity.oddity(BigInteger.valueOf(6437488298980289969L)));
  }
}
