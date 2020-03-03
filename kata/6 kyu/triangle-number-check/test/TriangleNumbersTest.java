import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TriangleNumbersTest {
  @Test
  public void test1() {
    assertTrue(TriangleNumbers.isTriangleNumber(125250));
  }

  @Test
  public void test2() {
    assertTrue(TriangleNumbers.isTriangleNumber(3126250));
  }
}
