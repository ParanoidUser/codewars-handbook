import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(new BigInteger("-1"), KidMath.pow(new BigInteger("-1"), new BigInteger("-1")));
    assertEquals(new BigInteger("-1"), KidMath.pow(BigInteger.TWO, new BigInteger("-1")));
    assertEquals(new BigInteger("4"), KidMath.pow(BigInteger.TWO, BigInteger.TWO));
    assertEquals(new BigInteger("81"), KidMath.pow(new BigInteger("3"), new BigInteger("3")));
  }
}
