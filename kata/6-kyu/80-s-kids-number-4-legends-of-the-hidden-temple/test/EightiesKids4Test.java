import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EightiesKids4Test {
  @Test
  public void test1() {
    assertEquals("X       X\n  X   X\n    X\n  X   X\nX       X\n", EightiesKids4.markSpot(5));
  }

  @Test
  public void test2() {
    assertEquals("X\n", EightiesKids4.markSpot(1));
  }

  @Test
  public void test3() {
    assertEquals("X                   X\n  X               X\n    X           X\n      X       X\n        X   X\n          X\n        X   X\n      X       X\n    X           X\n  X               X\nX                   X\n", EightiesKids4.markSpot(11));
  }

  @Test
  public void test4() {
    assertEquals("?", EightiesKids4.markSpot(-1));
  }
}
