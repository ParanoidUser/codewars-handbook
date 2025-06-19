import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DirectionsTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      NNNNNENN, NNNNNNNE
      SSNEWNWSE, S
      SSNEWSN, S
      NWSE,''
      N, N
      '', ''
      """)
  void sample(String path, String shortest) {
    String[] goal = path.isEmpty() ? new String[0] : path.split("");
    String[] expected = shortest.isEmpty() ? new String[0] : shortest.split("");
    assertArrayEquals(expected, ShortestPath.directions(goal));
  }
}