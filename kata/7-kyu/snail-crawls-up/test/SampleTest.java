import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleTest {
  @Test
  void sample() {
    assertEquals(2, Kata.snail(3, 2, 1));
    assertEquals(5, Kata.snail(10, 3, 1));
    assertEquals(8, Kata.snail(10, 3, 2));
    assertEquals(7, Kata.snail(100, 20, 5));
    assertEquals(1, Kata.snail(5, 10, 3));
  }
}
