import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.OptionalInt;
import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void invalid() {
    assertEquals(OptionalInt.empty(), Kata.pyramid(new int[0]));
    assertEquals(OptionalInt.empty(), Kata.pyramid(new int[]{-1, -1, 0, 0, 1, 1}));
    assertEquals(OptionalInt.empty(), Kata.pyramid(new int[]{7, 7, 7, 7, 7, 7}));
    assertEquals(OptionalInt.empty(), Kata.pyramid(new int[]{10, 10, 5, 5, 1, 1}));
  }

  @Test
  void valid() {
    assertEquals(OptionalInt.of(-6), Kata.pyramid(new int[]{1, 0, -1, -1, -2, -1, -2, -10}));
    assertEquals(OptionalInt.of(0), Kata.pyramid(new int[]{-10, -10, -6, 6, -6, 4, -6, 4, 2, 0, 10, -10, -10}));
    assertEquals(OptionalInt.of(10), Kata.pyramid(new int[]{1, 1, 1, 2, 2, 3}));
    assertEquals(OptionalInt.of(14), Kata.pyramid(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 3}));
    assertEquals(OptionalInt.of(19), Kata.pyramid(new int[]{5, 3, 5, 3, 0, 0, -1, 0, 0, 3, 3, 3}));
  }
}