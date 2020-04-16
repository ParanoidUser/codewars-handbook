import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void test1() {
    assertEquals(9, Sid.simpleMultiplication(1));
    assertEquals(27, Sid.simpleMultiplication(3));
    assertEquals(189, Sid.simpleMultiplication(21));
    assertEquals(207, Sid.simpleMultiplication(23));
  }

  @Test
  public void test2() {
    assertEquals(16, Sid.simpleMultiplication(2));
    assertEquals(32, Sid.simpleMultiplication(4));
    assertEquals(176, Sid.simpleMultiplication(22));
    assertEquals(208, Sid.simpleMultiplication(26));
  }
}
