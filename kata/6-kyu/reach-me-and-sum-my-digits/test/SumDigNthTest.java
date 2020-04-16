import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumDigNthTest {
  @Test
  public void test() {
    assertEquals(10, SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 6));
    assertEquals(10, SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 15));
    assertEquals(9, SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 50));
    assertEquals(10, SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 78));
    assertEquals(7, SumDigNth.sumDigNthTerm(10, new long[] {2, 1, 3}, 157));
  }
}
