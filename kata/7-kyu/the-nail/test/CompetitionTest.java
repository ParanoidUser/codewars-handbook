import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CompetitionTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
       1, 1
       2, 2
       3, 3
       4, 4
       5, 0
       6, 1
       7, 2
       8, 3
       9, 4
      10, 0
      """)
  void sample(int nail, int hit) {
    assertEquals(hit, Competition.hit(nail));
  }
}