import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LastWordSortTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments("man i need a taxi up to ubud", new String[]{"a", "need", "ubud", "i", "taxi", "man", "to", "up"}),
        arguments("what time are we climbing up the volcano", new String[]{"time", "are", "we", "the", "climbing", "volcano", "up", "what"}),
        arguments("take me to semynak", new String[]{"take", "me", "semynak", "to"}),
        arguments("massage yes massage yes massage", new String[]{"massage", "massage", "massage", "yes", "yes"}),
        arguments("take bintang and a dance please", new String[]{"a", "and", "take", "dance", "please", "bintang"})
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(String s, String[] expected) {
    assertArrayEquals(expected, Kata.last(s));
  }
}