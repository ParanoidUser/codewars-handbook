import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
  @Test
  void sample() {
    assertEquals(1, Budget.find_caterer(150, 10));
    assertEquals(2, Budget.find_caterer(1000, 45));
    assertEquals(2, Budget.find_caterer(1500, 60));
    assertEquals(3, Budget.find_caterer(200, 5));
    assertEquals(3, Budget.find_caterer(1500, 61));
    assertEquals(-1, Budget.find_caterer(100, 0));
    assertEquals(-1, Budget.find_caterer(940, 70));
  }
}