import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntSqRootTest {
  @Test
  void sample() {
    assertEquals(4, IntSqRoot.IntRac(25, 1));
    assertEquals(4, IntSqRoot.IntRac(125348, 300), 3);
  }
}
