import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AreSameTest {
  @Test
  public void test1() {
    int[] a = new int[] {121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[] {121, 14641, 20736, 361, 25921, 361, 20736, 361};
    assertTrue(AreSame.comp(a, b));
  }
}
