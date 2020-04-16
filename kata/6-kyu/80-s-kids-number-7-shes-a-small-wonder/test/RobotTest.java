import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RobotTest {
  private Robot vicky = new Robot();

  @Test
  public void simpleTest() {
    assertEquals("Thank you for teaching me hello", vicky.learnWord("hello"));
    assertEquals("Thank you for teaching me world", vicky.learnWord("world"));
    assertEquals("Thank you for teaching me goodbye", vicky.learnWord("goodbye"));
    assertEquals("I already know the word world", vicky.learnWord("world"));
    assertEquals("I already know the word World", vicky.learnWord("World"));
  }
}
