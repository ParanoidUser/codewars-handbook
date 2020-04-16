import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTests {
  @Test
  public void exampleTests() {
    assertEquals(5, Kata.shapeArea(2));
    assertEquals(13, Kata.shapeArea(3));
    assertEquals(1, Kata.shapeArea(1));
    assertEquals(41, Kata.shapeArea(5));
  }
}
