import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CapitalsTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments("CodEWaRs", new int[]{0, 3, 4, 6}),
        arguments("aAbB", new int[]{1, 3}),
        arguments("AAA", new int[]{0, 1, 2}),
        arguments("abcdefghijklmnopqrstuvwxyz", new int[0]),
        arguments("ZYXWVUTSRQPONMLKJIHGFEDCBA", new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25}),
        arguments("", new int[0]));
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(String s, int[] expected) {
    assertArrayEquals(expected, Kata.capitals(s));
  }
}