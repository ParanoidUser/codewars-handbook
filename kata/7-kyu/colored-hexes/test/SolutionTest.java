import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
               '', black
      000 000 000, black
      121 245 255, blue
      027 100 100, cyan
      021 021 021, white
      255 000 000, red
      000 147 000, green
      212 103 212, magenta
      101 101 092, yellow
      """)
  void sample(String codes, String color) {
    assertEquals(color, Solution.hexColor(codes));
  }
}