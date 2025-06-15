import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DroneFlyByTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      xxxxxx, ====T, ooooox
      xxxxxxxxx, ==T, oooxxxxxx
      xxxxxxxxxxxxxxx, =========T, ooooooooooxxxxx
      """)
  void sample(String lamps, String drone, String expected) {
    assertEquals(expected, Kata.flyBy(lamps, drone));
  }
}