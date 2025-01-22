import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      0, 6
      1, 18
      2, 12
      3, 20
      4, 17
      """)
  void sample(int pos, int waitTime) {
    assertEquals(waitTime, QueueTime.queue(new int[]{2, 5, 3, 6, 4}, pos));
  }
}