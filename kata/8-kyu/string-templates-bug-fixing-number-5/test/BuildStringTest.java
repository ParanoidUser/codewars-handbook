import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildStringTest {
  @Test
  public void fixedTests() {
    assertEquals("I like Cheese, Milk, Chocolate!", Kata.buildString("Cheese", "Milk", "Chocolate"));
    assertEquals("I like Cheese, Milk!", Kata.buildString("Cheese", "Milk"));
    assertEquals("I like Chocolate!", Kata.buildString("Chocolate"));
  }
}
