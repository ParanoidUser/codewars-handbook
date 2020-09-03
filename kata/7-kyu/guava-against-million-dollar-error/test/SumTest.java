import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SumTest {
  @Test
  void sample() {
    assertEquals(5.0, Sum.sum(2.0, 3.0), 0.001);
    assertThrows(IllegalArgumentException.class, () -> Sum.sum(0.0, 3.0));
    assertThrows(NullPointerException.class, () -> Sum.sum(null, 3.0));
    assertThrows(NullPointerException.class, () -> Sum.sum(8.0, null));
    assertThrows(IllegalArgumentException.class, () -> Sum.sum(-2.0, 3.0));
    assertThrows(IllegalArgumentException.class, () -> Sum.sum(2.0, -3.0));
  }
}
