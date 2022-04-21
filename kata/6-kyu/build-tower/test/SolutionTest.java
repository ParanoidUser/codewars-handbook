import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"*"}, Kata.TowerBuilder(1));
    assertArrayEquals(new String[]{" * ", "***"}, Kata.TowerBuilder(2));
    assertArrayEquals(new String[]{"  *  ", " *** ", "*****"}, Kata.TowerBuilder(3));
  }
}