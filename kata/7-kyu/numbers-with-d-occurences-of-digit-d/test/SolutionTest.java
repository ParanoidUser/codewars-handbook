import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertTrue(DD.isDD(30313));
    assertTrue(DD.isDD(122));
    assertTrue(DD.isDD(664444309));
    assertFalse(DD.isDD(5023011));
    assertFalse(DD.isDD(9081231));
  }
}
