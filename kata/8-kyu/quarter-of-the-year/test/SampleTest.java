import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(1, Kata.quarterOf(3));
    assertEquals(3, Kata.quarterOf(8));
    assertEquals(4, Kata.quarterOf(11));
  }
}