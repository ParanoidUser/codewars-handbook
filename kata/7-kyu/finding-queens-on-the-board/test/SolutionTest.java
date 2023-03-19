import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(BigInteger.valueOf(0), Chess.queens(BigInteger.valueOf(-321)));
    assertEquals(BigInteger.valueOf(0), Chess.queens(BigInteger.valueOf(0)));
    assertEquals(BigInteger.valueOf(0), Chess.queens(BigInteger.valueOf(1)));
    assertEquals(BigInteger.valueOf(0), Chess.queens(BigInteger.valueOf(2)));
    assertEquals(BigInteger.valueOf(2), Chess.queens(BigInteger.valueOf(3)));
    assertEquals(BigInteger.valueOf(6), Chess.queens(BigInteger.valueOf(4)));
    assertEquals(BigInteger.valueOf(12), Chess.queens(BigInteger.valueOf(5)));
    assertEquals(BigInteger.valueOf(20), Chess.queens(BigInteger.valueOf(6)));
    assertEquals(BigInteger.valueOf(342), Chess.queens(BigInteger.valueOf(20)));
    assertEquals(BigInteger.valueOf(992), Chess.queens(BigInteger.valueOf(33)));
    assertEquals(BigInteger.valueOf(2352), Chess.queens(BigInteger.valueOf(50)));
  }
}