import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments("y", new String[]{"y 1"}),
        arguments("you", new String[]{"you 3"}),
        arguments("apple ban", new String[]{"apple 5", "ban 3"}),
        arguments("you will win", new String[]{"you 3", "will 4", "win 3"}));
  }

  @ParameterizedTest
  @MethodSource("testData")
  void String(String str, String[] expected) {
    assertArrayEquals(expected, AddLength.addLength(str));
  }
}