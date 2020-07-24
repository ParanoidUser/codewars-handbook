import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class NumberOfRoutesTests {
  @Test
  void sample() {
    assertEquals(new BigInteger("2"), GridPath.numberOfRoutes(1, 1));
    assertEquals(new BigInteger("6"), GridPath.numberOfRoutes(5, 1));
    assertEquals(new BigInteger("35"), GridPath.numberOfRoutes(3, 4));
  }
}
