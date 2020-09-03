import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class FuncijTest {
  @Test
  void sample() {
    assertEquals(BigInteger.valueOf(55), Funcij.sumin(5));
    assertEquals(BigInteger.valueOf(372), Funcij.sumax(8));
    assertEquals(BigInteger.valueOf(576), Funcij.sumsum(8));
  }
}
