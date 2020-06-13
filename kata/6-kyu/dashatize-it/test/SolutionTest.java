import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void testBasic() {
    assertEquals("2-7-4", Solution.dashatize(274));
    assertEquals("5-3-1-1", Solution.dashatize(5311));
    assertEquals("86-3-20", Solution.dashatize(86320));
    assertEquals("9-7-4-3-02", Solution.dashatize(974302));
  }

  @Test
  void testWeird() {
    assertEquals("0", Solution.dashatize(0));
    assertEquals("1", Solution.dashatize(-1));
    assertEquals("28-3-6-9", Solution.dashatize(-28369));
  }

  @Test
  void testEdgeCases() {
    assertEquals("2-1-4-7-48-3-64-7", Solution.dashatize(Integer.MAX_VALUE));
    assertEquals("2-1-4-7-48-3-648", Solution.dashatize(Integer.MIN_VALUE));
    assertEquals("1-1-1-1-1-1-1-1-1-1", Solution.dashatize(-1111111111));
  }
}
