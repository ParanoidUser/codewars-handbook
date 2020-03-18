import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class LampTest {
  @Test
  public void testConstructor() {
    Lamp myObject = new Lamp("Red", "on");
    assertNotNull("constructor can't create instances", myObject);
  }

  @Test
  public void testSettersGetters() {
    Lamp lamp = new Lamp("Red", "on");
    lamp.setColor("Blue");
    lamp.setState("off");
    assertEquals("Missing getter for attribute state", "Blue", lamp.getColor());
    assertEquals("Missing getter for attribute state", "off", lamp.getState());
  }
}
