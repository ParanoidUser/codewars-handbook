import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DirectionsTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      NNNNNENN, NNNNNNNE
      SSNEWSN, S
      NWSE,''
      """)
  void sample(String path, String shortest) {
    assertArrayEquals(shortest.split(""), ShortestPath.directions(path.split("")));
  }
}