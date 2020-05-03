import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EvenOrOddTest {
  @Test
  void sample() {
    assertEquals("Even", EvenOrOdd.even_or_odd(6));
    assertEquals("Odd", EvenOrOdd.even_or_odd(7));
  }
}
