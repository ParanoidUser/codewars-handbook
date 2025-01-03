import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      1, 1
      8, 2
      27, 3
      125, 5
      """)
  void cubes(int volume, int side) {
    assertTrue(Cube.isCube(volume, side));
  }

  @ParameterizedTest
  @CsvSource(textBlock = """
      12, 2
      8, 3
      -8, -2
      0, 0
      1, 5
      125, -5
      0, 12
      12, -1
      """)
  void others(int volume, int side) {
    assertFalse(Cube.isCube(volume, side));
  }
}