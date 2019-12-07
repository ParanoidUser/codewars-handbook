import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StrongNumberTest {
  @Test
  public void testSomething() {
    assertEquals("STRONG!!!!", StrongNumber.isStrongNumber(1));
    assertEquals("STRONG!!!!", StrongNumber.isStrongNumber(2));
    assertEquals("STRONG!!!!", StrongNumber.isStrongNumber(145));
    assertEquals("Not Strong !!", StrongNumber.isStrongNumber(7));
    assertEquals("Not Strong !!", StrongNumber.isStrongNumber(93));
    assertEquals("Not Strong !!", StrongNumber.isStrongNumber(185));
  }
}
