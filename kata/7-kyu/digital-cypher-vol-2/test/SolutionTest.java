import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        Arguments.of(new int[]{20, 12, 18, 30, 21}, 1939, "scout"),
        Arguments.of(new int[]{14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8}, 1939, "masterpiece")
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sampleTests(int[] code, int key, String expected) {
    assertEquals(expected, Solution.decode(code, key));
  }
}