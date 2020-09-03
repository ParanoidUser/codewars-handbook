import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestNumbers {
  @Test
  void sample() {
    assertEquals("ten", Kata.nameThatNumber(10));
    assertEquals("ninety three", Kata.nameThatNumber(93));
    assertEquals("zero", Kata.nameThatNumber(0));
    assertEquals("forty", Kata.nameThatNumber(40));
  }
}
