import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOrOddTest {
  @Test
  public void testEvenOrOdd() {
    assertEquals(EvenOrOdd.even_or_odd(6), "Even");
    assertEquals(EvenOrOdd.even_or_odd(7), "Odd");
  }
}
