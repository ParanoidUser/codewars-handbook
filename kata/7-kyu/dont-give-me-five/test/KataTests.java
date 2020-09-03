import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertEquals(8, Kata.dontGiveMeFive(1, 9));
    assertEquals(12, Kata.dontGiveMeFive(4, 17));
  }
}
