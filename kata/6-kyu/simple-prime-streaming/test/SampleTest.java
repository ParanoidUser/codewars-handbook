import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals("57", SimplePrimeStreaming.solve(2, 2));
    assertEquals("192", SimplePrimeStreaming.solve(10, 3));
    assertEquals("02192", SimplePrimeStreaming.solve(10000, 5));
    assertEquals("09334", SimplePrimeStreaming.solve(20000, 5));
    assertEquals("031071", SimplePrimeStreaming.solve(50, 6));
    assertEquals("83899710", SimplePrimeStreaming.solve(40, 8));
    assertEquals("414347535", SimplePrimeStreaming.solve(20, 9));
    assertEquals("616771737983", SimplePrimeStreaming.solve(30, 12));
  }
}