import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DuplicateEncoderTest {
  @Test
  void sample() {
    assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
    assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    assertEquals("(((((", DuplicateEncoder.encode("<a(O/"));
  }
}
