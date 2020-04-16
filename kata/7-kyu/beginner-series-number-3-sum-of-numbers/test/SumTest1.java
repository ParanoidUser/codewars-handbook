import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest1 {
  @Test
  public void test1() {
    assertEquals(-1, Sum.GetSum(0, -1));
    assertEquals(1, Sum.GetSum(0, 1));
  }
}
