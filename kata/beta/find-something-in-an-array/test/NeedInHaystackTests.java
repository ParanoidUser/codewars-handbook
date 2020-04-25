import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class NeedInHaystackTests {
  @Test
  void sample() {
    assertTrue(NeedleInHaystack.find("hello", new String[]{"bye bye", "hello"}));
    assertFalse(NeedleInHaystack.find("anything", new String[]{"bye bye", "hello"}));
    assertFalse(NeedleInHaystack.find("", new String[]{"bye bye", "hello"}));
    assertTrue(NeedleInHaystack.find("bye bye", new String[]{"bye bye", "hello"}));
    assertFalse(NeedleInHaystack.find("bye bye", new String[]{}));
    assertFalse(NeedleInHaystack.find("", new String[]{}));
    assertFalse(NeedleInHaystack.find("bye bye", new String[]{"bye", "sayonara", "hello"}));
    assertTrue(NeedleInHaystack.find("bye bye", new String[]{"bye", "bye bye", "hello"}));
    assertTrue(NeedleInHaystack.find("ciao", new String[]{"ciao"}));
    assertFalse(NeedleInHaystack.find("codewars", new String[]{"codeWars", "code wars", "code-wars"}));
  }
}