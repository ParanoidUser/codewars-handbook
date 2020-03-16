import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {
  @Test
  public void examples() {
    assertEquals(20, Kata.getPerimeter(5, 5));
    assertEquals(60, Kata.getPerimeter(10, 20));
  }
}
