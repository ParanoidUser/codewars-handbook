import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, Converter.convert(""));
    assertEquals(1020, Converter.convert("KATA"));
    assertEquals(11001201, Converter.convert("AABBADBA"));
    assertEquals(10234567, Converter.convert("CodeWars"));
    assertEquals(1022131435254406400L, Converter.convert("fBuufRfKRDuDKKbZKbb"));
  }
}