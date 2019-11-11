import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NearestSqTest {
  @Test
  public void basicTests() {
    assertEquals(1, CodeWarsMath.nearestSq(1));
    assertEquals(1, CodeWarsMath.nearestSq(2));
    assertEquals(9, CodeWarsMath.nearestSq(10));
    assertEquals(121, CodeWarsMath.nearestSq(111));
    assertEquals(10000, CodeWarsMath.nearestSq(9999));
  }
}
