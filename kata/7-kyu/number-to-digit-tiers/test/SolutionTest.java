import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        Arguments.of(0, new String[]{"0"}),
        Arguments.of(6, new String[]{"6"}),
        Arguments.of(420, new String[]{"4", "42", "420"}),
        Arguments.of(2017, new String[]{"2", "20", "201", "2017"}),
        Arguments.of(2010, new String[]{"2", "20", "201", "2010"}),
        Arguments.of(4020, new String[]{"4", "40", "402", "4020"}),
        Arguments.of(80200, new String[]{"8", "80", "802", "8020", "80200"})
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int num, String[] expected) {
    assertArrayEquals(expected, Solution.createArrayOfTiers(num));
  }
}