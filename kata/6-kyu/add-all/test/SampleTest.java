import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(9, Kata.addAll(new int[]{1, 2, 3}));
    assertEquals(19, Kata.addAll(new int[]{1, 2, 3, 4}));
    assertEquals(33, Kata.addAll(new int[]{1, 2, 3, 4, 5}));
  }
}
