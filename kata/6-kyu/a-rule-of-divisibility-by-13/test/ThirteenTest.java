import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ThirteenTest {
  @Test
  void sample() {
    assertEquals(79, Thirteen.thirt(8529));
    assertEquals(31, Thirteen.thirt(85299258));
    assertEquals(57, Thirteen.thirt(5634));
    assertEquals(71, Thirteen.thirt(1111111111));
    assertEquals(30, Thirteen.thirt(987654321));
  }
}
