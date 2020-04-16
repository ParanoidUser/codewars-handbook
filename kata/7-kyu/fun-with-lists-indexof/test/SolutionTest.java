import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(-1, Solution.indexOf(null, 17));
    assertEquals(1, Solution.indexOf(Helpers.listFromArray(1, 2, 3), 2));
    assertEquals(0, Solution.indexOf(Helpers.listFromArray("aaa", "b", "abc"), "aaa"));
    assertEquals(0, Solution.indexOf(Helpers.listFromArray(17, "17", 1.2), 17));
    assertEquals(1, Solution.indexOf(Helpers.listFromArray(17, "17", 1.2), "17"));
    assertEquals(2, Solution.indexOf(Helpers.listFromArray(1, 2, 3, 3), 3));
  }
}
