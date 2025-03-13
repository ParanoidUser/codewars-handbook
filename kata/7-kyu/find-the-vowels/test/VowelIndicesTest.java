import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class VowelIndicesTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments("mmm", new int[]{}),
        arguments("apple", new int[]{1, 5}),
        arguments("super", new int[]{2, 4}),
        arguments("orange", new int[]{1, 3, 6}),
        arguments("supercalifragilisticexpialidocious", new int[]{2, 4, 7, 9, 12, 14, 16, 19, 21, 24, 25, 27, 29, 31, 32, 33})
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(String wd, int[] expected) {
    assertArrayEquals(expected, Kata.vowelIndices(wd));
  }
}