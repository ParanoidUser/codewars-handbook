import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("not possible", Solution.solve("abbaab"));
    assertEquals("OK", Solution.solve("abba"));
    assertEquals("remove one", Solution.solve("abbaa"));
    assertEquals("remove one", Solution.solve("abcbad"));
    assertEquals("remove one", Solution.solve("madmam"));
    assertEquals("not possible", Solution.solve("raydarm"));
    assertEquals("OK", Solution.solve("hannah"));
  }
}
