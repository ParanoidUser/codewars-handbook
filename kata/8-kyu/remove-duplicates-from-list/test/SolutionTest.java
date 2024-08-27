import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        Arguments.of(new int[0], new int[0]),
        Arguments.of(new int[]{1}, new int[]{1}),
        Arguments.of(new int[]{1, 2}, new int[]{1, 2}),
        Arguments.of(new int[]{1, 1, 2}, new int[]{1, 2}),
        Arguments.of(new int[]{1, 1, 1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5}),
        Arguments.of(new int[]{1, 2, 2, 1, 3, 3, 1, 4, 2, 4, 5, 6, 7, 7, 7}, new int[]{1, 2, 3, 4, 5, 6, 7})
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int[] input, int[] expected) {
    assertArrayEquals(expected, Solution.distinct(input));
  }
}