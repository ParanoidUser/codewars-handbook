import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("Hello", Solution.binaryToText("0100100001100101011011000110110001101111"));
    assertEquals("", Solution.binaryToText(""));
  }
}
