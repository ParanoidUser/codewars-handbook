import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    Integer[] args = new Integer[]{1, 2};
    new Swapper(args).swapValues();
    assertEquals(2, args[0]);
    assertEquals(1, args[1]);
  }
}
