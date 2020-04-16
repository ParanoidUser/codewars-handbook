import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LuckyNumberTest {
  @Test
  public void test1() {
    assertTrue("With input 0", LuckyNumber.isLucky(0));
  }

  @Test
  public void test2() {
    assertTrue("With input 1892376", LuckyNumber.isLucky(1892376));
  }

  @Test
  public void test3() {
    assertFalse("With input 189237", LuckyNumber.isLucky(189237));
  }
}
