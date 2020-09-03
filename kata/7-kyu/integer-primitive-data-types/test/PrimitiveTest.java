import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PrimitiveTest {
  @Test
  void sample() {
    assertEquals("byte", new Primitive().determineType("2"));
    assertEquals("short", new Primitive().determineType("3573"));
    assertEquals("short", new Primitive().determineType("-3573"));
    assertEquals("int", new Primitive().determineType("803847"));
    assertEquals("int", new Primitive().determineType("-803847"));
    assertEquals("long", new Primitive().determineType("5745621829365"));
    assertEquals("long", new Primitive().determineType("-5745621829365"));
    assertEquals("none", new Primitive().determineType("9173654782928177561848183754729818437466"));
  }
}
