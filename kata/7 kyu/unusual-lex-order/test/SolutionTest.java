import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void firstTest() {
    String[] words = new String[] {"nigeb", "ta", "eht", "gninnigeb"};
    assertArrayEquals(new String[] {"ta", "nigeb", "gninnigeb", "eht"}, Solution.unusualLexOrder(words));
    words = new String[] {"a", "b", "a", "d", "c"};
    assertArrayEquals(new String[] {"a", "a", "b", "c", "d"}, Solution.unusualLexOrder(words));
  }
}
