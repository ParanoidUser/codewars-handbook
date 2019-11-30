import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(0, Solution.length(null));
    assertEquals(4, Solution.length(Helpers.listFromArray(1, 2, 3, 4)));
  }
}