import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrimeTest {
  @Test
  void sample() {
    assertFalse(Prime.isPrime(-41));
    assertFalse(Prime.isPrime(-8));
    assertFalse(Prime.isPrime(-5));
    assertFalse(Prime.isPrime(-1));
    assertFalse(Prime.isPrime(0));
    assertFalse(Prime.isPrime(1));
    assertTrue(Prime.isPrime(2));
    assertTrue(Prime.isPrime(3));
    assertFalse(Prime.isPrime(4));
    assertTrue(Prime.isPrime(5));
    assertFalse(Prime.isPrime(6));
    assertTrue(Prime.isPrime(7));
    assertFalse(Prime.isPrime(8));
    assertFalse(Prime.isPrime(9));
    assertTrue(Prime.isPrime(41));
    assertFalse(Prime.isPrime(45));
    assertTrue(Prime.isPrime(73));
    assertFalse(Prime.isPrime(75));
    assertTrue(Prime.isPrime(5099));
  }
}
