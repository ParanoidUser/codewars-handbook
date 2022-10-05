import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(".....", Solution.calc("..... // ."));
    assertEquals("..........", Solution.calc("..... * .."));
    assertEquals("..", Solution.calc("..... // .."));
    assertEquals("....", Solution.calc("..... - ."));
    assertEquals("....................", Solution.calc("..... + ..............."));
    assertEquals("...............", Solution.calc("..... * ..."));
    assertEquals("..", Solution.calc("..... - ..."));
    assertEquals("", Solution.calc(". - ."));
    assertEquals("", Solution.calc(". // .."));
    assertEquals("", Solution.calc("..... % .........."));
  }
}
