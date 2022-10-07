import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExampleTests {
  @Test
  void sample() {
    assertEquals("", AscendDescend.ascendDescend(14, -4, -5));
    assertEquals("-", AscendDescend.ascendDescend(1, -1, 0));
    assertEquals("12321", AscendDescend.ascendDescend(5, 1, 3));
    assertEquals("1111111111", AscendDescend.ascendDescend(10, 1, 1));
    assertEquals("56789876567", AscendDescend.ascendDescend(11, 5, 9));
    assertEquals("01210121012101", AscendDescend.ascendDescend(14, 0, 2));
    assertEquals("-9-8-7-6-5-4-3-4-5-6-7-8-", AscendDescend.ascendDescend(25, -9, -3));
    assertEquals("6566676869707172737475767574737271706968676665666768697071727374", AscendDescend.ascendDescend(64, 65, 76));
  }
}
