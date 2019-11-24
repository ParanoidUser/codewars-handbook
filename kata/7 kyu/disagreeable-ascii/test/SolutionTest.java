import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testBasic() {
    assertEquals(Ascii.getWeight("Joe"), 254);
    assertEquals(Ascii.getWeight("CJ"), 205);
    assertEquals(Ascii.getWeight("cj"), 141);
  }
}
