import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class OddDigPrimeTest {
  @Test
  void sample() {
    assertArrayEquals(new long[]{7, 19, 31}, OddDigPrime.onlyOddDigPrimes(20));
    assertArrayEquals(new long[]{9, 37, 53}, OddDigPrime.onlyOddDigPrimes(40));
    assertArrayEquals(new long[]{10, 53, 59}, OddDigPrime.onlyOddDigPrimes(55));
    assertArrayEquals(new long[]{11, 59, 71}, OddDigPrime.onlyOddDigPrimes(60));
    assertArrayEquals(new long[]{15, 97, 113}, OddDigPrime.onlyOddDigPrimes(100));
  }
}
