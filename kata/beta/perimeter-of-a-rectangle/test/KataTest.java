import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
  @Test
  void sample() {
    assertEquals(20, Kata.getPerimeter(5, 5));
    assertEquals(60, Kata.getPerimeter(10, 20));
  }
}
