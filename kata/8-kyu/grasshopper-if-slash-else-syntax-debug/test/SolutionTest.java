import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {
  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
  void alive(int health) {
    assertTrue(Solution.checkAlive(health));
  }

  @ParameterizedTest
  @ValueSource(ints = {0, -1, -2, -3, -4, -5, -6, -7, -8, -9})
  void dead(int health) {
    assertFalse(Solution.checkAlive(health));
  }
}