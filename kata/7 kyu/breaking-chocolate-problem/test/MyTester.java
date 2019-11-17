import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTester {
  @Test
  public void myTests() {
    assertEquals(24, Chocolate.breakChocolate(5, 5));
    assertEquals(0, Chocolate.breakChocolate(1, 1));
  }
}
