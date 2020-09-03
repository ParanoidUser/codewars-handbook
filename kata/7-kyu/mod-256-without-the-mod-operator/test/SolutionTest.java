import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(254, Kata.mod256WithoutMod(254));
    assertEquals(0, Kata.mod256WithoutMod(256));
    assertEquals(2, Kata.mod256WithoutMod(258));
    assertEquals(-254, Kata.mod256WithoutMod(-254));
    assertEquals(0, Kata.mod256WithoutMod(-256));
    assertEquals(-2, Kata.mod256WithoutMod(-258));
  }
}
