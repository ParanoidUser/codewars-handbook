import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingTest {
  @Test
  public void exampleTests() {
    int[] testArray = {1, 2, 3};
    assertEquals("I I I I\n I I I \n       \n       ", Bowling.bowlingPins(testArray));

    testArray = new int[] {3, 5, 9};
    assertEquals("I I   I\n I   I \n  I    \n   I   ", Bowling.bowlingPins(testArray));
  }
}
