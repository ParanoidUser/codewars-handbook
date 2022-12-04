import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class PowersTest {
  @Test
  void sample() {
    assertEquals(Powers.powers(new int[0]), BigInteger.valueOf(1));
    assertEquals(Powers.powers(new int[]{1}), BigInteger.valueOf(2));
    assertEquals(Powers.powers(new int[]{1, 2, 3, 4, 5}), BigInteger.valueOf(32));
  }
}
