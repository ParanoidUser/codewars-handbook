import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class RGBTest {
  @Test
  void toString_test() {
    assertEquals("RGB(  0,  0,  0)", new RGB(0, 0, 0).toString());
  }

  @Test
  void hashcode_test() {
    assertEquals(29791, new RGB(0, 0, 0).hashCode());
  }

  @Test
  void equals_test() {
    assertEquals(new RGB(0,256,0), new RGB(0,256,0));
    var black = new RGB(0,0,0);
    assertEquals(black, black);
    assertFalse(new RGB(0,0,0).equals(null));
    assertNotEquals(new RGB(0,0,0), new Object());
    assertNotEquals(new RGB(0,0,0), new RGB(1,0,0));
    assertNotEquals(new RGB(0,0,0), new RGB(0,1,0));
    assertNotEquals(new RGB(0,0,0), new RGB(0,0,1));
  }
}