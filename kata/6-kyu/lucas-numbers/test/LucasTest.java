import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LucasTest {
  @Test
  public void test_lucasnum() {
    assertEquals(2, Lucas.lucasnum(0));
    assertEquals(1, Lucas.lucasnum(1));
    assertEquals(-11, Lucas.lucasnum(-5));
    assertEquals(123, Lucas.lucasnum(-10));
  }
}
