import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FactorialTests {
  @Test
  void sample() {
    var f = new Factorial();
    assertEquals(1, f.factorial(0));
    assertEquals(6, f.factorial(3));
    assertEquals(120, f.factorial(5));
    assertThrows(IllegalArgumentException.class, () -> f.factorial(-1));
    assertThrows(IllegalArgumentException.class, () -> f.factorial(13));
  }
}
