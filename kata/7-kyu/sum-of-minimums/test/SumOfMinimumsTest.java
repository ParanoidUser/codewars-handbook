import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SumOfMinimumsTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments(new int[][]{{7, 9, 8, 6, 2}, {6, 3, 5, 4, 3}, {5, 8, 7, 4, 5}}, 9),
        arguments(new int[][]{{11, 12, 14, 54}, {67, 89, 90, 56}, {7, 9, 4, 3}, {9, 8, 6, 7}}, 76));
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int[][] arr, int expected) {
    assertEquals(expected, Kata.sumOfMinimums(arr));
  }
}