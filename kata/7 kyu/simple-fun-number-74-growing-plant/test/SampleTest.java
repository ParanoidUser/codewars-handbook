import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SampleTest {
  @Test
  public void basicTests() {
    assertEquals(10, SimpleFun.growingPlant(100, 10, 910));
    assertEquals(1, SimpleFun.growingPlant( 10,  9,   4));
  }
}
