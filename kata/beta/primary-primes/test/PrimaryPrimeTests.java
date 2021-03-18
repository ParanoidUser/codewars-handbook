import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrimaryPrimeTests {
  @Test
  void sample() {
    assertEquals(5, PrimaryPrime.find(24));
    assertEquals(10, PrimaryPrime.find(60));
  }
}