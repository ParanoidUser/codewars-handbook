import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testBasic() {
    assertEquals(254, Ascii.getWeight("Joe"));
    assertEquals(205, Ascii.getWeight("CJ"));
    assertEquals(141, Ascii.getWeight("cj"));
  }
}
