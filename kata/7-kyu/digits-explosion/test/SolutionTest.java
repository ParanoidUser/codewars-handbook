import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("", Solution.explode("0"));
    assertEquals("", Solution.explode("000"));
    assertEquals("122333", Solution.explode("123"));
    assertEquals("333122", Solution.explode("312"));
    assertEquals("12222666666999999999", Solution.explode("102269"));
  }
}
