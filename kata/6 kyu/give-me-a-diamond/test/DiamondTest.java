import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DiamondTest {
  @Test
  public void testDiamond3() {
    assertEquals(" *\n" + "***\n" + " *\n", Diamond.print(3));
  }

  @Test
  public void testDiamond5() {
    assertEquals("  *\n" + " ***\n" + "*****\n" + " ***\n" + "  *\n", Diamond.print(5));
  }

  @Test
  public void testDiamond1() {
    assertEquals("*\n", Diamond.print(1));
  }

  @Test
  public void testDiamond0() {
    assertNull(Diamond.print(0));
  }

  @Test
  public void testDiamondMinus2() {
    assertNull(Diamond.print(-2));
  }

  @Test
  public void testDiamond2() {
    assertNull(Diamond.print(2));
  }
}
