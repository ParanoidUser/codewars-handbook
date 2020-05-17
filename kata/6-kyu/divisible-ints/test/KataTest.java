import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(2, Kata.getCount(123));
    assertEquals(5, Kata.getCount(1230));
    assertEquals(0, Kata.getCount(1));
    assertEquals(25, Kata.getCount(1111111111));
  }
}