import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(BigInteger.ONE, Solution.pell(1));
    assertEquals(BigInteger.TWO, Solution.pell(2));
    assertEquals(BigInteger.valueOf(5), Solution.pell(3));
    assertEquals(BigInteger.valueOf(12), Solution.pell(4));
  }
}