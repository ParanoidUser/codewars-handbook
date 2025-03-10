import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class EvenLastTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments(new int[0], 0),
        arguments(new int[]{2, 2, 2, 2}, 8),
        arguments(new int[]{2, 3, 4, 5}, 30),
        arguments(new int[]{1, 3, 3, 1, 10}, 140),
        arguments(new int[]{-11, 3, 3, 1, 10}, 20)
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int[] arr, int expected) {
    assertEquals(expected, Kata.evenLast(arr));
  }
}