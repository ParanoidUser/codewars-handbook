import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OutlierTest {
  @Test
  public void testExample() {
    int[] exampleTest1 = {2, 6, 8, -10, 3};
    assertEquals(3, FindOutlier.find(exampleTest1));
    int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
    assertEquals(206847684, FindOutlier.find(exampleTest2));
    int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
    assertEquals(0, FindOutlier.find(exampleTest3));
  }
}
