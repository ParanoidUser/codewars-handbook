import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FactorialTests {
  @Test
  void sample() {
    assertEquals(1, Factorial.factorial(0));
    assertEquals(6, Factorial.factorial(3));
    assertEquals(120, Factorial.factorial(5));
    assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(13));
  }
}
