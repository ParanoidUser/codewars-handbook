import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionSampleTest {
  private static Stream<Arguments> testData() {
    return Stream.of(
        arguments(List.of(2, 3), 5),
        arguments(List.of(3, 3, 3, 3, 3, 3, 3, 3, 3, 3), 30),
        arguments(List.of(3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2, 3, 2), 50)
    );
  }

  private static Callable<Integer> waitAndGet(int result) {
    return () -> {
      var random = ThreadLocalRandom.current();
      long millis = random.nextLong(100, 201);
      Thread.sleep(millis);
      return result;
    };
  }

  @ParameterizedTest
  @MethodSource("testData")
  void sample(List<Integer> numbers, int expected) {
    assertEquals(expected, Solution.taskMaster(numbers.stream().map(SolutionSampleTest::waitAndGet).toList()));
  }

  @Test
  void negative() {
    assertEquals(2, Solution.taskMaster(List.of(
            () -> 2,
            () -> { throw new RuntimeException(); },
            () -> 2
        )
    ));
  }
}