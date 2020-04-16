import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimitiveTest {
  @Test
  public void testTypes() {
    assertEquals("byte", Primitive.determineType("2"));
    assertEquals("int", Primitive.determineType("-803847"));
    assertEquals("none", Primitive.determineType("9173654782928177561848183754729818437466"));
    assertEquals("short", Primitive.determineType("3573"));
    assertEquals("long", Primitive.determineType("-5745621829365"));
  }
}
