import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MiddleExampleTests {
  @Test
  void sample() {
    assertEquals("es", Kata.getMiddle("test"));
    assertEquals("dd", Kata.getMiddle("middle"));
    assertEquals("t", Kata.getMiddle("testing"));
    assertEquals("A", Kata.getMiddle("A"));
  }
}
