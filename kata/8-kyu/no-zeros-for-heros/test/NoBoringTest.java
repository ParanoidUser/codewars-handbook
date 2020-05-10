import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NoBoringTest {
  @Test
  void sample() {
    assertEquals(0, NoBoring.noBoringZeros(0));
    assertEquals(145, NoBoring.noBoringZeros(1450));
    assertEquals(96, NoBoring.noBoringZeros(960000));
    assertEquals(105, NoBoring.noBoringZeros(1050));
    assertEquals(-105, NoBoring.noBoringZeros(-1050));
  }
}
