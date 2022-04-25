import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(267, BitsOfInteger.reverseBits(417));
    assertEquals(417, BitsOfInteger.reverseBits(267));
    assertEquals(0, BitsOfInteger.reverseBits(0));
    assertEquals(1087, BitsOfInteger.reverseBits(2017));
    assertEquals(1023, BitsOfInteger.reverseBits(1023));
    assertEquals(1, BitsOfInteger.reverseBits(1024));
  }
}
