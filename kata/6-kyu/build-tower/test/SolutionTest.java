import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertArrayEquals(new String[]{"*"}, Kata.towerBuilder(1));
    assertArrayEquals(new String[]{" * ", "***"}, Kata.towerBuilder(2));
    assertArrayEquals(new String[]{"  *  ", " *** ", "*****"}, Kata.towerBuilder(3));
  }
}