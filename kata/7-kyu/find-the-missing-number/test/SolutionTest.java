import static java.util.stream.IntStream.rangeClosed;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

class SolutionTest {
  @RepeatedTest(101)
  void sample(RepetitionInfo info) {
    int missed = info.getCurrentRepetition() - 1;
    int[] nums = rangeClosed(0, 100).filter(i -> i != missed).toArray();
    assertEquals(missed, Kata.missingNo(nums));
  }
}