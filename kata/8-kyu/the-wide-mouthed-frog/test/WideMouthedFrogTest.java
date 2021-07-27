import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class WideMouthedFrogTest {
  @Test
  void sample() {
    assertEquals("wide", WideMouthedFrog.mouthSize("toucan"));
    assertEquals("wide", WideMouthedFrog.mouthSize("ant bear"));
    assertEquals("small", WideMouthedFrog.mouthSize("alligator"));
  }
}