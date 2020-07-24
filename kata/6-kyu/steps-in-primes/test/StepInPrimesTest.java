import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class StepInPrimesTest {
  @Test
  void sample() {
    assertArrayEquals(new long[] {101, 103}, StepInPrimes.step(2, 100, 110));
    assertArrayEquals(new long[] {103, 107}, StepInPrimes.step(4, 100, 110));
    assertArrayEquals(new long[] {101, 107}, StepInPrimes.step(6, 100, 110));
    assertArrayEquals(new long[] {359, 367}, StepInPrimes.step(8, 300, 400));
    assertArrayEquals(new long[] {307, 317}, StepInPrimes.step(10, 300, 400));
  }
}
