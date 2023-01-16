import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertEquals(BigInteger.valueOf(1), Kata.subcuboids(1, 1, 1));
    assertEquals(BigInteger.valueOf(27), Kata.subcuboids(2, 2, 2));
    assertEquals(BigInteger.valueOf(108), Kata.subcuboids(2, 3, 3));
    assertEquals(BigInteger.valueOf(3150), Kata.subcuboids(4, 5, 6));
    assertEquals(BigInteger.valueOf(11088), Kata.subcuboids(3, 7, 11));
  }
}