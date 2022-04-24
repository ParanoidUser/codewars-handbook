import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IntSqRootTest {
  @Test
  void sample() {
    assertEquals(4, IntSqRoot.intRac(25, 1));
    assertEquals(4, IntSqRoot.intRac(125348, 300), 3);
  }
}
