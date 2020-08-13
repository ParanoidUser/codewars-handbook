import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TriangleTesterTest {
  @Test
  void sample() {
    assertTrue(TriangleTester.isTriangle(1, 2, 2));
    assertFalse(TriangleTester.isTriangle(7, 2, 2));
    assertFalse(TriangleTester.isTriangle(0, 2, 3));
    assertFalse(TriangleTester.isTriangle(1, 3, 2));
  }
}
