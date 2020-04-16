import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquarePiTest {
  @Test
  public void fixedTests1() {
    SquarePi five = new SquarePi(5);
    assertEquals(8, five.calculate());
  }

  @Test
  public void fixedTests2() {
    SquarePi ten = new SquarePi(10);
    assertEquals(15, ten.calculate());
  }
}
