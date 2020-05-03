import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FactorialBaseConverterTest {
  @Test
  void sample() {
    assertEquals(43010, FactorialBaseConverter.intoFactorial("115"));
    assertEquals(115, FactorialBaseConverter.outOfFactorial("43010"));
    assertEquals(463, FactorialBaseConverter.outOfFactorial("341010"));
    assertEquals(341010, FactorialBaseConverter.intoFactorial("463"));
    assertThrows(IllegalArgumentException.class, () -> FactorialBaseConverter.outOfFactorial("3020"));
  }
}