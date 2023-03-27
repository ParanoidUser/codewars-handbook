import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Kata.lastDigit(BigInteger.ZERO, BigInteger.valueOf(7)));
    assertEquals(1, Kata.lastDigit(BigInteger.valueOf(4), BigInteger.ZERO));
    assertEquals(4, Kata.lastDigit(BigInteger.valueOf(4), BigInteger.ONE));
    assertEquals(6, Kata.lastDigit(BigInteger.valueOf(4), BigInteger.TWO));
    assertEquals(8, Kata.lastDigit(BigInteger.TWO, BigInteger.valueOf(7)));
    assertEquals(9, Kata.lastDigit(BigInteger.valueOf(9), BigInteger.valueOf(7)));
  }
}