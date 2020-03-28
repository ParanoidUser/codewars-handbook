import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NeedInHaystackTests {
  @Test
  public void testBasicCases() {
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