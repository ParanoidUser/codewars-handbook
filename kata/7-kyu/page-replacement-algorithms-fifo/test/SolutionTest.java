import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments(3, new int[]{1, 2, 3, 4, 2, 5}, new int[]{4, 5, 3}),
        arguments(5, new int[0], new int[]{-1, -1, -1, -1, -1}),
        arguments(4, new int[]{1, 2, 3, 3, 4, 5, 1}, new int[]{5, 1, 3, 4}),
        arguments(4, new int[]{1, 1, 1, 2, 2, 3}, new int[]{1, 2, 3, -1}),
        arguments(1, new int[]{5, 4, 3, 3, 4, 10}, new int[]{10}),
        arguments(3, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, -1, -1}),
        arguments(5, new int[]{10, 9, 8, 7, 7, 8, 7, 6, 5, 4, 3, 4, 3, 4, 5, 6, 5}, new int[]{5, 4, 3, 7, 6})
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int n, int[] referencesList, int[] expected) {
    assertArrayEquals(expected, Solution.fifo(n, referencesList));
  }
}