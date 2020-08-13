import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class BinarySxoreTests {
  @Test
  void sample() {
    assertEquals(new BigInteger("0"), BinarySxore.sxore(new BigInteger("0")));
    assertEquals(new BigInteger("1"), BinarySxore.sxore(new BigInteger("1")));
    assertEquals(new BigInteger("51"), BinarySxore.sxore(new BigInteger("50")));
    assertEquals(new BigInteger("1000000"), BinarySxore.sxore(new BigInteger("1000000")));
  }
}
