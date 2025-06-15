import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ElevatorDistanceTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments(new int[]{5, 2, 8}, 9),
        arguments(new int[]{1, 2, 3}, 2),
        arguments(new int[]{7, 1, 7, 1}, 18)
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int[] arr, int expected) {
    assertEquals(expected, Kata.elevatorDistance(arr));
  }
}