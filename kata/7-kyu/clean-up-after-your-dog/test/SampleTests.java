import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class SampleTests {
  private static Stream<Arguments> cleanData() {
    return Stream.of(
        arguments(new char[][]{{'_', '_', '_', '_'}, {'_', '_', '_', '@'}, {'_', '_', '@', '_'}}, 2, 2),
        arguments(new char[][]{{'_', '_', '_', '_'}, {'_', '_', '_', '_'}, {'_', '_', '_', '_'}}, 2, 2),
        arguments(new char[][]{{'@', '@'}, {'@', '@'}, {'@', '@'}}, 3, 2),
        arguments(new char[0][0], 0, 0)
    );
  }

  private static Stream<Arguments> dirtyData() {
    return Stream.of(
        arguments(new char[][]{{'_', '_', '_', '_'}, {'_', '_', '_', '@'}, {'_', '_', '@', '_'}}, 1, 1),
        arguments(new char[][]{{'@', '.', '.', '.'}, {'.', '.', '.', '.'}, {'.', '.', '.', '@'}}, 1, 0)
    );
  }

  private static Stream<Arguments> dogData() {
    return Stream.of(
        arguments(new char[][]{{'_', '_'}, {'_', '@'}, {'D', '_'}}, 2, 2),
        arguments(new char[][]{{'@', '@'}, {'@', '@'}, {'@', 'D'}}, 0, 0)
    );
  }

  @ParameterizedTest
  @MethodSource("cleanData")
  void cleanCase(char[][] garden, int bags, int capacity) {
    assertEquals("Clean", Kata.crap(garden, bags, capacity));
  }

  @ParameterizedTest
  @MethodSource("dirtyData")
  void dirtyCase(char[][] garden, int bags, int capacity) {
    assertEquals("Cr@p", Kata.crap(garden, bags, capacity));
  }

  @ParameterizedTest
  @MethodSource("dogData")
  void dogCase(char[][] garden, int bags, int capacity) {
    assertEquals("Dog!!", Kata.crap(garden, bags, capacity));
  }
}