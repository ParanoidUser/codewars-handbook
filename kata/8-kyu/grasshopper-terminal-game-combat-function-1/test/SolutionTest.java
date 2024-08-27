import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      100, 5, 95
      92, 8, 84
      20, 30, 0
      50, 49, 1
      33, 33, 0
      """)
  void sample(int health, int damage, int expected) {
    assertEquals(expected, Game.combat(health, damage));
  }
}