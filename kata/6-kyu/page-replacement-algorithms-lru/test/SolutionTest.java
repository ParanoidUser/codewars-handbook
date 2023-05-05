import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
            arguments(4, new int[]{5, 4, 3, 2, 3, 5, 2, 6, 7, 8}, new int[]{8, 6, 7, 2}),
            arguments(5, new int[0], new int[]{-1, -1, -1, -1, -1}),
            arguments(3, new int[]{1, 2, 3, 4, 3, 2, 5}, new int[]{5, 2, 3}),
            arguments(4, new int[]{1, 1, 1, 2, 2, 3}, new int[]{1, 2, 3, -1}),
            arguments(1, new int[]{5, 4, 3, 3, 4, 10}, new int[]{10}),
            arguments(3, new int[]{1, 1, 1, 1, 1, 1, 1, 1}, new int[]{1, -1, -1}),
            arguments(5, new int[]{10, 9, 8, 7, 7, 8, 7, 6, 5, 4, 3, 4, 3, 4, 5, 6, 5}, new int[]{5, 4, 3, 7, 6})
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int n, int[] referencesList, int[] expected) {
    assertArrayEquals(expected, Solution.lru(n, referencesList));
  }
}