import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals(5, Kata.shapeArea(2));
    assertEquals(13, Kata.shapeArea(3));
    assertEquals(1, Kata.shapeArea(1));
    assertEquals(41, Kata.shapeArea(5));
  }
}
