import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class SampleTests {
  @Test
  void sample() {
    assertEquals(20, Kata.sumMul(2, 9));
    assertEquals(30, Kata.sumMul(5, 20));
    assertEquals(1860, Kata.sumMul(4, 123));
    assertEquals(86469, Kata.sumMul(123, 4567));
  }

  @Test
  void negative() {
    assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(0, 0));
    assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(4, -7));
    assertThrows(IllegalArgumentException.class, () -> Kata.sumMul(-3, 10));
  }
}

