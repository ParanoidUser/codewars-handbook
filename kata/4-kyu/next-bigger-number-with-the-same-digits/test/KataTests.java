import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTests {
  @Test
  void sample() {
    assertEquals(19009, Kata.nextBiggerNumber(10990));
    assertEquals(21, Kata.nextBiggerNumber(12));
    assertEquals(531, Kata.nextBiggerNumber(513));
    assertEquals(2071, Kata.nextBiggerNumber(2017));
    assertEquals(441, Kata.nextBiggerNumber(414));
    assertEquals(414, Kata.nextBiggerNumber(144));
  }
}