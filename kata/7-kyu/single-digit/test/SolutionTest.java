import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(5, Kata.singleDigit(5));
    assertEquals(8, Kata.singleDigit(999));
    assertEquals(2, Kata.singleDigit(443566));
    assertEquals(7, Kata.singleDigit(567448));
    assertEquals(8, Kata.singleDigit(4868872));
    assertEquals(2, Kata.singleDigit(234234235));
    assertEquals(3, Kata.singleDigit(565656565));
    assertEquals(3, Kata.singleDigit(1000000000));
    assertEquals(1, Kata.singleDigit(1234444123));
  }
}
