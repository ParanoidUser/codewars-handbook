package codewars.triangle;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.Test;

public class TriangularNumbersTest {
  @Test
  public void numberOfDots() {
    assertEquals(BigInteger.valueOf(1L), TriangularNumbers.numberOfDots(BigInteger.valueOf(1L)));
    assertEquals(BigInteger.valueOf(3L), TriangularNumbers.numberOfDots(BigInteger.valueOf(2L)));
    assertEquals(BigInteger.valueOf(6L), TriangularNumbers.numberOfDots(BigInteger.valueOf(3L)));
    assertEquals(BigInteger.valueOf(10L), TriangularNumbers.numberOfDots(BigInteger.valueOf(4L)));
  }
}
