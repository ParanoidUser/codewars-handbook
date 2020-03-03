import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOrOddTest {
  @Test
  public void testEvenOrOdd() {
    assertEquals("Even", EvenOrOdd.even_or_odd(6));
    assertEquals("Odd", EvenOrOdd.even_or_odd(7));
  }
}
