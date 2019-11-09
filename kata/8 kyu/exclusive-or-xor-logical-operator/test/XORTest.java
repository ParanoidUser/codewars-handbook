import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class XORTest {
  @Test
  public void testBasic() {
    assertFalse(XOR.xor(false, false));
    assertTrue(XOR.xor(true, false));
    assertTrue(XOR.xor(false, true));
    assertFalse(XOR.xor(true, true));
  }

  @Test
  public void testNested() {
    assertFalse(XOR.xor(false, XOR.xor(false, false)));
    assertTrue(XOR.xor(XOR.xor(true, false), false));
    assertFalse(XOR.xor(XOR.xor(true, true), false));
    assertTrue(XOR.xor(true, XOR.xor(true, true)));
    assertFalse(XOR.xor(XOR.xor(false, false), XOR.xor(false, false)));
    assertTrue(XOR.xor(XOR.xor(false, false), XOR.xor(false, true)));
    assertTrue(XOR.xor(XOR.xor(true, false), XOR.xor(false, false)));
    assertFalse(XOR.xor(XOR.xor(true, false), XOR.xor(true, false)));
    assertTrue(XOR.xor(XOR.xor(true, true), XOR.xor(true, false)));
    assertTrue(XOR.xor(XOR.xor(true, XOR.xor(true, true)), XOR.xor(XOR.xor(true, true), false)));
  }
}
