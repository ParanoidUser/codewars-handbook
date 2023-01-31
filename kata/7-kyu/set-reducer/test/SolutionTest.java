import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments(2, new int[]{0, 4, 6, 8, 8, 8, 5, 5, 7}),
        arguments(3, new int[]{8, 1, 6, 1, 2, 7, 7, 7, 7, 6, 5, 3, 2, 1, 8}),
        arguments(2, new int[]{0, 0, 8, 6, 6, 7, 8, 6, 6, 4, 7, 6, 4, 0, 1, 1, 2, 1, 2, 9, 9, 0, 3, 3, 0, 4}),
        arguments(3, new int[]{6, 3, 5, 7, 4, 2, 0, 0, 1, 6, 9, 6, 1, 3, 9, 3, 2}),
        arguments(5, new int[]{1, 4, 0, 1, 2, 6, 6, 0, 8, 4, 7, 9, 9, 4, 3, 7, 2, 6, 7, 5, 0, 9, 8}),
        arguments(23, new int[]{4, 6, 8, 1, 9, 3, 8, 4, 1, 4, 0, 8, 3, 7, 1, 5, 6, 3, 2, 1, 8, 4, 9}),
        arguments(3, new int[]{8, 3, 2, 6, 2, 7, 9, 9, 6, 8, 2, 4, 3, 6, 9, 5, 2, 4, 9}),
        arguments(3, new int[]{7, 2, 0, 6, 5, 7, 3, 9, 1, 8, 4, 5, 5, 5, 8, 9, 8, 1, 9, 1, 2, 7, 2, 6, 0, 8, 0, 2}),
        arguments(5, new int[]{8, 5, 1, 1, 1, 5, 9, 7, 4, 8, 8, 8, 2, 4, 3, 1, 2, 1, 3, 5, 6, 4}),
        arguments(3, new int[]{2, 4, 4, 6, 2, 1, 1, 5, 6, 7, 8, 8, 8, 8, 9, 0, 1, 1, 5, 4, 4}));
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int expected, int[] input) {
    assertEquals(expected, Kata.setReducer(input));
  }
}