import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("2", Solution.kata(new String[]{"2", "3", "5", "7", "11"}, "5"));
    assertEquals("4", Solution.kata(new String[]{"2", "3", "5", "7", "11"}, "11"));
    assertEquals("Not found", Solution.kata(new String[]{"2", "3", "5", "7", "11"}, "843646"));
  }
}