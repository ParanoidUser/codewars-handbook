import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("aaaa", Solution.repeatStr(4, "a"));
    assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    assertEquals("", Solution.repeatStr(5, ""));
    assertEquals("", Solution.repeatStr(0, "kata"));
    assertEquals("", Solution.repeatStr(-10, "kata"));
  }
}
