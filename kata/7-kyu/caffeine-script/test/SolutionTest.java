import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
  @Test
  public void testSomething() {
    assertEquals("mocha_missing!", CaffeineBuzz.caffeineBuzz(1));
    assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
    assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
    assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
  }
}
