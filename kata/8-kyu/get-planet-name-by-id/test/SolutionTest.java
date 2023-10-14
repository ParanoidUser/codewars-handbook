import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      2, Venus
      3, Earth
      5, Jupiter
      """)
  void sample(int id, String name) {
    assertEquals(name, Planet.getPlanetName(id));
  }
}