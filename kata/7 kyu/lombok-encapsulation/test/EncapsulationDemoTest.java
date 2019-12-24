import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.SecureRandom;

import org.junit.Test;

public class EncapsulationDemoTest {
  SecureRandom r = new SecureRandom();

  @Test
  public void testSample() {
    EncapsulationDemo ed = new EncapsulationDemo();
    assertEquals(0, ed.getNumber());
  }

  @Test
  public void fieldVisibilityTest() {
    EncapsulationDemo ed = new EncapsulationDemo();
    try {
      Field fieldNumber = ed.getClass().getDeclaredField("number");
      Field fieldStringValue = ed.getClass().getDeclaredField("stringValue");
      Field fieldAnObject = ed.getClass().getDeclaredField("anObject");
      assertTrue("number is not private", Modifier.isPrivate(fieldNumber.getModifiers()));
      assertTrue("stringValue is not private", Modifier.isPrivate(fieldStringValue.getModifiers()));
      assertTrue("anObject is not private", Modifier.isPrivate(fieldAnObject.getModifiers()));
    } catch (NoSuchFieldException x) {
      x.printStackTrace();
      fail();
    }
  }

  @Test
  public void testRandomly() {
    EncapsulationDemo ed = new EncapsulationDemo(5, "hola", 5);
    assertEquals(5, ed.getNumber());
    assertEquals("hola", ed.getStringValue());
    assertEquals(5, ed.getAnObject());

    for (int i = 0; i < 35; i++) {
      int expectedNum = r.nextInt(10000);
      ed.setNumber(expectedNum);
      assertEquals(expectedNum, ed.getNumber());

      String expectedStr = r.nextInt(10000) + "";
      ed.setStringValue(expectedStr);
      assertEquals(expectedStr, ed.getStringValue());

      Object expectedObj = r.nextInt(10) > 5 ? Integer.valueOf(r.nextInt(10000)) : r.nextInt(10000) + "";
      ed.setAnObject(expectedObj);
      assertEquals(expectedObj, ed.getAnObject());
    }
  }
}
