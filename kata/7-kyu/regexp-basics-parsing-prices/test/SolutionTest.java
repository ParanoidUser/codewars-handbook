import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(69, CentParser.toCents("$0.69"));
    assertEquals(123, CentParser.toCents("$1.23"));
    assertEquals(969, CentParser.toCents("$9.69"));
    assertEquals(970, CentParser.toCents("$9.70"));
    assertEquals(971, CentParser.toCents("$9.71"));
    assertEquals(9999, CentParser.toCents("$99.99"));
    assertEquals(1234567890, CentParser.toCents("$12345678.90"));
    assertNull(CentParser.toCents(""));
    assertNull(CentParser.toCents("1"));
    assertNull(CentParser.toCents("$1"));
    assertNull(CentParser.toCents("1.23"));
    assertNull(CentParser.toCents("$1.23\n"));
    assertNull(CentParser.toCents("\n$1.23"));
    assertNull(CentParser.toCents("$9.692"));
    assertNull(CentParser.toCents("$9.69$4.3.7"));
  }
}
