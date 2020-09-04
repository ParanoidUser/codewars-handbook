import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class BeforeAfterPrimesTest {
  @Test
  void sample() {
    assertArrayEquals(new long[]{89, 101}, BeforeAfterPrimes.primeBefAft(97));
    assertArrayEquals(new long[]{97, 101}, BeforeAfterPrimes.primeBefAft(100));
    assertArrayEquals(new long[]{97, 103}, BeforeAfterPrimes.primeBefAft(101));
    assertArrayEquals(new long[]{113, 127}, BeforeAfterPrimes.primeBefAft(120));
    assertArrayEquals(new long[]{127, 131}, BeforeAfterPrimes.primeBefAft(130));
  }
}
