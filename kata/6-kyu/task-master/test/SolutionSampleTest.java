import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionSampleTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments((Callable<Integer>) () -> 7, 1, 7),
        arguments((Callable<Integer>) () -> 7, 1000, 7000),
        arguments((Callable<Integer>) () -> 7, 100000, 700000)
    );
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(Callable<Integer> function, int calls, int expected) {
    assertEquals(expected, Solution.taskMaster(Stream.generate(() -> function).limit(calls).toList()));
  }

  @Test
  void negative() {
    assertThrows(RuntimeException.class, () -> Solution.taskMaster(List.of(
            () -> 2,
            () -> { throw new Exception(); },
            () -> 2
        )
    ));
  }
}