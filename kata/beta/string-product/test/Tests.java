import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Tests {
  @Test
  void test1() {
    assertTrue(Zero.isZero("0"));
  }

  @Test
  void test2() {
    assertFalse(Zero.isZero(""));
  }

  @Test
  void test3() {
    assertTrue(Zero.isZero("0*4"));
  }

  @Test
  void test4() {
    assertTrue(Zero.isZero("17*41*886*9,422,000*0*e*pi"));
  }
}