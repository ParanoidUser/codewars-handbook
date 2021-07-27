import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(4, Solution.waterbombs("xxYxx", 1));
    assertEquals(2, Solution.waterbombs("xxYxx", 3));
    assertEquals(3, Solution.waterbombs("xxxxYxYx", 4));
    assertEquals(3, Solution.waterbombs("xxxxYxYx", 5));
    assertEquals(5, Solution.waterbombs("xxxxxYxYx", 2));
  }
}
