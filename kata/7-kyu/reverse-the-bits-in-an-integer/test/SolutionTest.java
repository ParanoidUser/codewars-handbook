import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(267, BitsOfInteger.reverse_bits(417));
    assertEquals(417, BitsOfInteger.reverse_bits(267));
    assertEquals(0, BitsOfInteger.reverse_bits(0));
    assertEquals(1087, BitsOfInteger.reverse_bits(2017));
    assertEquals(1023, BitsOfInteger.reverse_bits(1023));
    assertEquals(1, BitsOfInteger.reverse_bits(1024));
  }
}
