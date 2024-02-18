import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyExampleTests {
  @Test
  void sample() {
    assertEquals(-15, Kata.multiply(-3));
    assertEquals(0, Kata.multiply(0));
    assertEquals(15, Kata.multiply(3));
    assertEquals(250, Kata.multiply(10));
    assertEquals(25000, Kata.multiply(200));
    assertEquals(-3728750, Kata.multiply(-5966));
    assertEquals(-2048000000, Kata.multiply(-131072));
  }
}