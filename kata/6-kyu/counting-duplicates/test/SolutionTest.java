import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    assertEquals(3, CountingDuplicates.duplicateCount("dA" + "c".repeat(10) + "b".repeat(100) + "a".repeat(1000)));
  }
}
