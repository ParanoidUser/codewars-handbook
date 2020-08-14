import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Tests {
  @Test
  void sample() {
    assertEquals(40075.00, Eratosthenes.circumference(8.1, 1.0, 800), 0.05);
    assertEquals(91.0, Eratosthenes.circumference(1, 5, 20), 0.05);
    assertEquals(264.0, Eratosthenes.circumference(2, 5, 50), 0.05);
  }
}
