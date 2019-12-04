import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DoorTest {
  @Test
  public void testDoor() {
    assertTrue("You can write a comment, but not code", GreenGlassDoor.stepThroughWith("comment"));
  }
}
