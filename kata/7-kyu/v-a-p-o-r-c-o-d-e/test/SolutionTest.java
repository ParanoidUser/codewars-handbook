import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource({
      "L  E  T  S  G  O  T  O  T  H  E  M  O  V  I  E  S, Lets go to the movies",
      "W  H  Y  I  S  N  '  T  M  Y  C  O  D  E  W  O  R  K  I  N  G  ?, Why isn't my code working?"
  })
  void sample(String expected, String text) {
    assertEquals(expected, Solution.vaporcode(text));
  }
}
