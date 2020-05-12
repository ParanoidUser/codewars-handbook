import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BuildStringTest {
  @Test
  void sample() {
    assertEquals("I like Cheese, Milk, Chocolate!", Kata.buildString("Cheese", "Milk", "Chocolate"));
    assertEquals("I like Cheese, Milk!", Kata.buildString("Cheese", "Milk"));
    assertEquals("I like Chocolate!", Kata.buildString("Chocolate"));
  }
}
