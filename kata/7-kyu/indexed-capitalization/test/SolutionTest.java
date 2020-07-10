import static kata.Solution.capitalize;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("aBCdeF", capitalize("abcdef", new int[]{1, 2, 5}));
    assertEquals("aBCdeF", capitalize("abcdef", new int[]{1, 2, 5, 100}));
    assertEquals("cOdEwArs", capitalize("codewars", new int[]{1, 3, 5, 50}));
    assertEquals("abRacaDabRA", capitalize("abracadabra", new int[]{2, 6, 9, 10}));
    assertEquals("codewArriors", capitalize("codewarriors", new int[]{5}));
  }
}