import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntSqRootTest {
  @Test
  public void test0() {
    assertEquals(4, IntSqRoot.IntRac(25, 1));
    assertEquals(4, IntSqRoot.IntRac(125348, 300), 3);
  }
}
