package codewars.triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;

class TriangularNumbersTest {
  @Test
  void sample() {
    assertEquals(BigInteger.valueOf(1L), TriangularNumbers.numberOfDots(BigInteger.valueOf(1L)));
    assertEquals(BigInteger.valueOf(3L), TriangularNumbers.numberOfDots(BigInteger.valueOf(2L)));
    assertEquals(BigInteger.valueOf(6L), TriangularNumbers.numberOfDots(BigInteger.valueOf(3L)));
    assertEquals(BigInteger.valueOf(10L), TriangularNumbers.numberOfDots(BigInteger.valueOf(4L)));
  }
}
