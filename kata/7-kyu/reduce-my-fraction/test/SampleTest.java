import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      3, 1, 60, 20
      2, 3, 80, 120
      2, 1, 4, 2
      3, 8, 45, 120
      1000, 1, 1000, 1
      1, 1, 1, 1
      """
  )
  void sample(int en, int ed, int an, int ad) {
    assertArrayEquals(new int[]{en, ed}, Reduce.myFraction(new int[]{an, ad}));
  }
}