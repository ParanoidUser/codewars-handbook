import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumbersTest {
  @Test
  public void test_01() {
    assertEquals(10.12, Numbers.twoDecimalPlaces(10.1289767789), 0.00);
  }

  @Test
  public void test_Negative_02() {
    assertEquals(-7488.83, Numbers.twoDecimalPlaces(-7488.83485834983), 0.00);
  }
}
