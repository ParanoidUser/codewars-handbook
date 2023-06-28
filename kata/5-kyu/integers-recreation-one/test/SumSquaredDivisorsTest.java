import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumSquaredDivisorsTest {
  @Test
  void sample() {
    assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250));
    assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250));
    assertEquals("[[287, 84100]]", SumSquaredDivisors.listSquared(250, 500));
  }
}