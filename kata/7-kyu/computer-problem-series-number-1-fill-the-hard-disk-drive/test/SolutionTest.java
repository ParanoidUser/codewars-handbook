import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(3, Kata.save(new int[]{4, 4, 4, 3, 3}, 12));
    assertEquals(2, Kata.save(new int[]{4, 4, 4, 3, 3}, 11));
    assertEquals(6, Kata.save(new int[]{4, 8, 15, 16, 23, 42}, 108));
    assertEquals(1, Kata.save(new int[]{13}, 13));
    assertEquals(4, Kata.save(new int[]{1, 2, 3, 4}, 250));
    assertEquals(1, Kata.save(new int[]{100}, 500));
    assertEquals(0, Kata.save(new int[]{11, 13, 15, 17, 19}, 8));
    assertEquals(0, Kata.save(new int[]{45}, 12));
  }
}