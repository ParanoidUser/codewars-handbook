import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RobotTest {
  @Test
  void sample() {
    var robot = new Robot();
    assertEquals("Thank you for teaching me hello", robot.learnWord("hello"));
    assertEquals("Thank you for teaching me world", robot.learnWord("world"));
    assertEquals("Thank you for teaching me goodbye", robot.learnWord("goodbye"));
    assertEquals("I already know the word world", robot.learnWord("world"));
    assertEquals("I already know the word World", robot.learnWord("World"));
    assertEquals("I do not understand the input", robot.learnWord(""));
  }
}
