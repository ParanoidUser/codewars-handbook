import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(-1, Solution.lastIndexOf(null, 17));
    assertEquals(1, Solution.lastIndexOf(Helpers.listFromArray(1, 2, 3), 2));
    assertEquals(0, Solution.lastIndexOf(Helpers.listFromArray("aaa", "b", "abc"), "aaa"));
    assertEquals(0, Solution.lastIndexOf(Helpers.listFromArray(17, "17", 1.2), 17));
    assertEquals(1, Solution.lastIndexOf(Helpers.listFromArray(17, "17", 1.2), "17"));
    assertEquals(3, Solution.lastIndexOf(Helpers.listFromArray(1, 2, 3, 3), 3));
  }
}