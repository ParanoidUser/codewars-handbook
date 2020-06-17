import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PentaTest {
  @Test
  void testPNum() {
    assertFalse(Penta.pNum(0));
    assertTrue(Penta.pNum(1));
    assertFalse(Penta.pNum(2));
    assertFalse(Penta.pNum(3));
    assertFalse(Penta.pNum(4));
    assertTrue(Penta.pNum(5));
  }

  @Test
  void testGPNum() {
    assertTrue(Penta.gpNum(0));
    assertTrue(Penta.gpNum(1));
    assertTrue(Penta.gpNum(2));
    assertFalse(Penta.gpNum(3));
    assertFalse(Penta.gpNum(4));
    assertTrue(Penta.gpNum(5));
  }

  @Test
  void testSPNum() {
    assertFalse(Penta.spNum(0));
    assertTrue(Penta.spNum(1));
    assertFalse(Penta.spNum(2));
    assertFalse(Penta.spNum(3));
    assertFalse(Penta.spNum(4));
    assertFalse(Penta.spNum(5));
  }
}
