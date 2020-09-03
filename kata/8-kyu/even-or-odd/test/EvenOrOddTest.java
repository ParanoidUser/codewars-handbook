import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvenOrOddTest {
  @Test
  void sample() {
    assertEquals("Even", new EvenOrOdd().even_or_odd(6));
    assertEquals("Odd", new EvenOrOdd().even_or_odd(7));
  }
}
