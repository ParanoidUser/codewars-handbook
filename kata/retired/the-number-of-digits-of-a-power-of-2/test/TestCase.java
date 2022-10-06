import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCase {
  @Test
  void smallNumberTest() {
    assertEquals(1L, Power.digit(1L));
    assertEquals(1L, Power.digit(2L));
    assertEquals(1L, Power.digit(3L));
    assertEquals(2L, Power.digit(4L));
    assertEquals(4L, Power.digit(10L));
    assertEquals(4L, Power.digit(11L));
  }

  @Test
  void bigNumberTest() {
    assertEquals(28915723780146183L, Power.digit(96055955209270208L));
    assertEquals(15443817617893451L, Power.digit(51303251637196672L));
  }
}