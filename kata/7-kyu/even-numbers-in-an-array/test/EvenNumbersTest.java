import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EvenNumbersTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3, new int[]{4, 6, 8}),
        arguments(new int[]{-22, 5, 3, 11, 26, -6, -7, -8, -9, -8, 26}, 2, new int[]{-8, 26}),
        arguments(new int[]{6, -25, 3, 7, 5, 5, 7, -3, 23}, 1, new int[]{6})
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int[] array, int number, int[] expected) {
    assertArrayEquals(expected, Kata.evenNumbers(array, number));
  }
}