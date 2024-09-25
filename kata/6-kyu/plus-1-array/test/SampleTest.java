import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.of;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SampleTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        of(new int[]{2, 3, 9}, new int[]{2, 4, 0}),
        of(new int[]{4, 3, 2, 5}, new int[]{4, 3, 2, 6}),
        of(new int[]{1, -9}, null),
        of(new int[]{1, 33}, null),
        of(new int[0], null)
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(int[] arr, int[] expected) {
    assertArrayEquals(expected, PlusOneArray.upArray(arr));
  }
}