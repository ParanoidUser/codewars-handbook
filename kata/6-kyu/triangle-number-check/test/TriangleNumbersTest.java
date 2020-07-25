import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TriangleNumbersTest {
  @Test
  void sample() {
    assertTrue(TriangleNumbers.isTriangleNumber(125250));
    assertTrue(TriangleNumbers.isTriangleNumber(3126250));
    assertFalse(TriangleNumbers.isTriangleNumber(617717));
  }
}
