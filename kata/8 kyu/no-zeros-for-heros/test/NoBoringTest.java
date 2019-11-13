import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoBoringTest {
  @Test
  public void test1() {
    assertEquals(145, NoBoring.noBoringZeros(1450));
    assertEquals(96, NoBoring.noBoringZeros(960000));
    assertEquals(105, NoBoring.noBoringZeros(1050));
    assertEquals(-105, NoBoring.noBoringZeros(-1050));
  }
}
