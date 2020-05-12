import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MakeNegativeTest {
  @Test
  void sample() {
    assertEquals(-42, Kata.makeNegative(42));
  }
}
