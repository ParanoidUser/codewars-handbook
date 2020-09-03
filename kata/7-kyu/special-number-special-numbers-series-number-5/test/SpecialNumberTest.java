import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpecialNumberTest {
  @Test
  void sample() {
    assertEquals("Special!!", Solution.specialNumber(2));
    assertEquals("Special!!", Solution.specialNumber(3));
    assertEquals("NOT!!", Solution.specialNumber(7));
    assertEquals("NOT!!", Solution.specialNumber(9));
    assertEquals("Special!!", Solution.specialNumber(23));
    assertEquals("Special!!", Solution.specialNumber(32));
    assertEquals("NOT!!", Solution.specialNumber(39));
    assertEquals("Special!!", Solution.specialNumber(55));
    assertEquals("NOT!!", Solution.specialNumber(79));
    assertEquals("Special!!", Solution.specialNumber(513));
    assertEquals("NOT!!", Solution.specialNumber(538));
    assertEquals("NOT!!", Solution.specialNumber(709));
    assertEquals("Special!!", Solution.specialNumber(53532));
    assertEquals("NOT!!", Solution.specialNumber(970569));
    assertEquals("Special!!", Solution.specialNumber(11350224));
  }
}
