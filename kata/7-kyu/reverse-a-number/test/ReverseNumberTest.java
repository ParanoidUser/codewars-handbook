import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseNumberTest {
  @Test
  void sample() {
    assertEquals(5, ReverseNumber.reverse(5));
    assertEquals(1, ReverseNumber.reverse(1000));
    assertEquals(321, ReverseNumber.reverse(123));
    assertEquals(-321, ReverseNumber.reverse(-123));
    assertEquals(4321234, ReverseNumber.reverse(4321234));
    assertEquals(89898989, ReverseNumber.reverse(98989898));
  }
}
