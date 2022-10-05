import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        Arguments.of(List.of("first"), "trisf", List.of("first")),
        Arguments.of(List.of(), "oob", List.of("bob", "baobab")),
        Arguments.of(List.of("mountains"), "ainstuomn", List.of("mountains", "hills", "mesa")),
        Arguments.of(List.of("pool", "loop"), "oolp", List.of("donkey", "pool", "horse", "loop")),
        Arguments.of(List.of("sport", "ports"), "ortsp", List.of("sport", "parrot", "ports", "matey")),
        Arguments.of(List.of(), "ourf", List.of("one", "two", "three"))
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(List<String> expected, String s, List<String> words) {
    assertEquals(expected, Grab.grabscrab(s, words));
  }
}
