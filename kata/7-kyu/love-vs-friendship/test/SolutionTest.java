import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      love, 54
      family, 66
      friends, 75
      knowledge, 96
      selfness, 99
      attitude, 100
      incomprehensibility, 225
      """)
  void sample(String text, int value) {
    assertEquals(value, LoveVsFriendship.wordsToMarks(text));
  }
}