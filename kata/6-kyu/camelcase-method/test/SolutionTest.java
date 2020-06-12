import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
  @Test
  void sample() {
    assertEquals("TestCase", Solution.camelCase("test case"));
    assertEquals("CamelCaseMethod", Solution.camelCase("camel case method"));
    assertEquals("CamelCaseWord", Solution.camelCase(" camel case word"));
    assertEquals("SayHello", Solution.camelCase("say hello "));
    assertEquals("AbC", Solution.camelCase("ab  c"));
    assertEquals("Z", Solution.camelCase("z"));
    assertEquals("", Solution.camelCase(""));
  }
}
