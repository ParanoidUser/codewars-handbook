import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class EncapsulationDemoTest {
  @Test
  void sample() throws Exception {
    var def = new EncapsulationDemo();
    assertEquals(0, def.getNumber());
    assertNull(def.getStringValue());
    assertNull(def.getAnObject());

    int[] array = new int[]{1, 2, 3};
    def.setNumber(42);
    def.setStringValue("Test");
    def.setAnObject(array);

    assertEquals(42, def.getNumber());
    assertEquals("Test", def.getStringValue());
    assertEquals(array, def.getAnObject());

    var obj = new EncapsulationDemo(5, "hola", 5);
    assertEquals(2, obj.getClass().getDeclaredField("number").getModifiers());
    assertEquals(2, obj.getClass().getDeclaredField("stringValue").getModifiers());
    assertEquals(2, obj.getClass().getDeclaredField("anObject").getModifiers());

    assertEquals(5, obj.getNumber());
    assertEquals("hola", obj.getStringValue());
    assertEquals(5, obj.getAnObject());
  }
}
